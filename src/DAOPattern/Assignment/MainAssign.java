package DAOPattern.Assignment;

import DAOPattern.AddressBookWithDB.Person;

import java.sql.*;
import java.util.ArrayList;

public class MainAssign {
    final static String DB_FILE_NAME = "DAOAssign.db";
    final static String DB_TABLE_NAME = "passwords";
    public static void main(String[] args){
        Connection connection = null;
        ResultSet rs = null;
        Statement statement = null;
        PasswordInfo info;
        PasswordDaoImpl impl=new PasswordDaoImpl();
        //1번 삽입
        System.out.println("1. inserting...");
        info=new PasswordInfo("https://www.smu.ac.kr","smu","abcde");
        impl.insert(info);

        info=new PasswordInfo("https://www.smu2.ac.kr","smu2","abcde");
        impl.insert(info);

        System.out.println("2. find all");
        /*
        for (PasswordInfo pi : impl.findAll()) {
            System.out.println("reading... " + pi);
        }

         */
        //2번 SELECT로 확인
        try{
            ArrayList<String> list=new ArrayList<>();
            list.add("https://www.smu.ac.kr");
            list.add("https://www.smu2.ac.kr");
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);
            String fmt="SELECT * FROM %s WHERE URL = '%s'";
            for(String url: list){
                String q=String.format(fmt,DB_TABLE_NAME,url);
                rs=statement.executeQuery(q);
                System.out.println(rs.getString("URL")+","+rs.getString("id")+","+rs.getString("password"));
            }
            statement.close();


        }catch (SQLException e){
            e.printStackTrace();

        }
        //3번 update
        System.out.println("3. Updating");
        info=impl.findByKey("https://www.smu2.ac.kr");
        info.setId("smu1");

        impl.update(info);
        try{
            connection=DriverManager.getConnection("jdbc:sqlite:"+DB_FILE_NAME);
            statement=connection.createStatement();
            statement.setQueryTimeout(30);
            String q="SELECT * FROM %s WHERE URL = '%s'";
            q=String.format(q,DB_TABLE_NAME,info.getUrl());
            rs=statement.executeQuery(q);
            System.out.println(rs.getString("id"));
            statement.close();
        }catch (SQLException e){

        }
        //4번 key로 삭제
        System.out.println("4. deleting url choosed");
        impl.delete("https://www.smu2.ac.kr");
        //5번 전체 출력
        System.out.println("5. print all");
        for(PasswordInfo info2: impl.findAll()){
            System.out.println(info2);
        }



    }
}
