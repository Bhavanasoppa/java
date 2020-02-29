package com.day7;

import java.sql.*;
public class First {
public static void main(String[]args)
{
Connection c=null;
Statement stmt=null;
ResultSet rs=null;
try
{
try{
Class.forName("com.mysql.cj.jdbc.Driver");
}
catch(ClassNotFoundException e){
e.printStackTrace();

}
c=DriverManager.getConnection("jdbc:mysql://localhost:3306" + "/sample","root","manager");
System.out.println("connected");
stmt=c.createStatement();
rs=stmt.executeQuery("select empid,ename,salary from employee1");
while(rs.next())
System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
}

catch(SQLException e)
{
System.out.println(e);
}
finally
{
try{
c.close();
rs.close();
stmt.close();


}
catch(SQLException e)
{
e.printStackTrace();
}
}
}
}




