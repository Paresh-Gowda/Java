import java.sql.*;
public class JDBC {
    public static void main(String args[]) throws SQLException
    {
        Connection con=null;
        String driver="oracle.jdbc.driver.OracleDriver";
        try 
        {
            Class.forName(driver);
            System.out.println("Drive loaded");
            String url="jdbc:oracle:thin:@Lenovo-Ideapad:1521:XE";
            String user="system";
            String pwd="201983";
            con=DriverManager.getConnection(url,user,pwd);
            System.out.println("Connected to Database");
            if(con!=null) 
            {
                con.isClosed();
            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Exception has occured");
        }
    }
}
