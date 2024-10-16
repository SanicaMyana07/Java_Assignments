package JDBC;
import com.mysql.cj.jdbc.StatementImpl;

import java.sql.*;
import java.util.Map;
import java.util.SortedMap;
public class JdbcConnection {



    public class JdbcDemo {

        public static void main(String[] args) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/jdbc15OctEve";
                String userName="root";
                String password="jeevan@6993";

                Connection connection=DriverManager.getConnection(url,userName,password);

                Statement statement=connection.createStatement();


                String sql="create table Students (id int,fname varchar(20),lname varchar(20),age int,class varchar(20))";
                int status=statement.executeUpdate(sql);

                if (status==1){
                    System.out.println("Table Created..");
                }else {
                    System.out.println("Error while creating table..");
                }

//            String sql="Insert into Students (id,fname,lname,class,age) values (3,'abc','qpr','12th','20')";
//            statement.executeUpdate(sql);

//            String sql="Select * from Students where id=1";
//            ResultSet resultSet=statement.executeQuery(sql);

                String name="abc";
                int id=2;

                PreparedStatement pst= connection.prepareStatement("Select * from Students where id=? and fname=?");

                pst.setInt(1,id);
                pst.setString(2,name);

                ResultSet resultSet =  pst.executeQuery();

//            System.out.println(map.get("id"));

                while (resultSet.next()){
                    System.out.println(resultSet.getInt("Id"));
                    System.out.println(resultSet.getString("fname"));
                    System.out.println(resultSet.getString("lname"));
                    System.out.println(resultSet.getInt("age"));
                }

                connection.close();

            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
}
