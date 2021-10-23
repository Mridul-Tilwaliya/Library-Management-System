package library.management.system;
import java.sql.*;  
public class Conn
{
    Connection c;
    Statement s;
    public Conn()
    {  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library_management_system","root","root" );    
            s =c.createStatement();
        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    } 
}  
