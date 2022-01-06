package DAOPattern.Assignment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PasswordDaoImpl implements PasswordDAO{
    final static String DB_FILE_NAME = "DAOAssign.db";
    final static String DB_TABLE_NAME = "passwords";
    Connection connection=null;
    ResultSet rs=null;
    Statement statement = null;
    public PasswordDaoImpl(){
        try{
            connection= DriverManager.getConnection("jdbc:sqlite:"+DB_FILE_NAME);
            statement=connection.createStatement();
            statement.setQueryTimeout(20);
            final String table=" (URL TEXT PRIMARY KEY , id text, password text)";
            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate("CREATE TABLE " +DB_TABLE_NAME+table);

        }catch (SQLException E){

        }
    }
    @Override
    public void insert(PasswordInfo p){
        try{
            String fmt="INSERT INTO %s VALUES('%s', '%s', '%s')";
            String q=String.format(fmt,DB_TABLE_NAME,p.getUrl(),p.getId(),p.getPassword());
            statement.execute(q);

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public List<PasswordInfo> findAll() {
        ArrayList<PasswordInfo> passwords= new ArrayList<>();

        try{
            rs=statement.executeQuery("SELECT * FROM "+DB_TABLE_NAME);
            while(rs.next()){
                passwords.add(new PasswordInfo(rs.getString("URL"),rs.getString("id"), rs.getString("password")));

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return passwords;
    }

    @Override
    public PasswordInfo findByKey(String url) {
        PasswordInfo info = null;
        try{
            String fmt="SELECT * FROM %s WHERE URL = '%s'";
            String q=String.format(fmt,DB_TABLE_NAME,url);
            rs=statement.executeQuery(q);
            if(rs.next()){
                info=new PasswordInfo(rs.getString("URL"),rs.getString("id"),rs.getString("password"));
            }


        }catch (SQLException e){
            e.printStackTrace();
        }
        return info;
    }

    @Override
    public void update(PasswordInfo p) {
        try{
            String fmt="UPDATE %s SET id = '%s', password = '%s' WHERE URL= '%s'";
            String q=String.format(fmt,DB_TABLE_NAME,p.getId(),p.getPassword(),p.getUrl());
            statement.execute(q);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void delete(String url) {
        try{
            String fmt= "DELETE FROM %s WHERE URL = '%s'";
            String q = String.format(fmt,DB_TABLE_NAME,url);
            statement.execute(q);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void delete(PasswordInfo p) {
        delete(p.getUrl());
    }
}
