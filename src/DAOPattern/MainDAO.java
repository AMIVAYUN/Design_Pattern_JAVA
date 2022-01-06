package DAOPattern;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//DATA ACCESS OBJECT PATTERN
/*
TODO 업무와 db를 분리하기 위해 사용 데이터 2계층을 분리하고 상태를 동일하게 유지함, 업무: 주문과 유통 같은 업무의 절차 및 규칙 데이터: 정보를 어떻게 저장할지 ID 몇자리로 할 것인지,
TODO 숫자 문자등의 물리적인 문제
TODO db 사용법이 바뀌면 클라이언트의 수정이 많아진다.
TODO 사용방법의 분리 --> 느슨한 확장성
TODO DAO -> 모델에 대한 기본 crud 인터페이스 Value Object DAO를 사용하여 데이터를 저장하는 단순 POJO
TODO 주소록 관리
 */

public class MainDAO {
    final static String DB_FILE_NAME = "addressbook.db";
    final static String DB_TABLE_NAME = "persons";
    public static void main(String[] args){
        Connection connection = null;
        ResultSet rs = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);

            final String table = " (ID INTEGER PRIMARY KEY AUTOINCREMENT, name text, address text)";

            // create table
            statement.executeUpdate(
                    "DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate(
                    "CREATE TABLE " + DB_TABLE_NAME + table);

            System.out.println("--- inserting...");
            statement.execute("INSERT INTO persons(name, address) VALUES('Seonyoung Kim','1 Hongji Dong')");
            statement.execute("INSERT INTO persons(name, address) VALUES('Jangkwon Lee','2 Hongji Dong')");
            System.out.println("--- finding all...");
            rs = statement.executeQuery(
                    "SELECT * FROM persons");// WHERE id < 4 ORDER BY id");
            while (rs.next()) {
                System.out.println(
                        "" + rs.getInt("ID") + ", "
                                + rs.getString("name") + ", "
                                + rs.getString("address"));
            }

            System.out.println("--- updating...");
            statement.execute(
                    "UPDATE persons SET name = 'Sooyoung Lim' WHERE id = 1");

            System.out.println("--- see if updated...");
            rs = statement.executeQuery(
                    "SELECT * FROM persons WHERE id = 1");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", "
                        + rs.getString("name") + ", "
                        + rs.getString("address"));
            }
            System.out.println("--- deleting...");
            statement.execute(
                    "DELETE FROM persons WHERE id = 1");

            System.out.println("--- finding all after deleting...");
            rs = statement.executeQuery(
                    "SELECT * FROM persons WHERE id < 4 ORDER BY id");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", "
                        + rs.getString("name") + ", "
                        + rs.getString("address"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if (rs != null) { rs.close(); }
                if (statement != null) { statement.close(); }
                if (connection != null) { connection.close(); }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    } // main


}
