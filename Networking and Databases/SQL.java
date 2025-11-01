import java.sql.*;
import java.sql.DriverManager;
class SQL {
    public static void main(String args[]) throws SQLException
    {
        String driver="oracle.jdbc.driver.OracleDriver";
        try
        {
            Class.forName(driver);
            System.out.println("Driver loaded");
            String url="jdbc:oracle:thin:@Lenovo-Ideapad:1521:XE";
            String user="system";
            String pwd="201983";
            Connection con=DriverManager.getConnection(url,user,pwd);
            System.out.println("Connected to Database");
            Statement st=con.createStatement();
            String q="CREATE TABLE Student(S_id NUMBER(10))";
            st.executeQuery(q);
            System.out.println("Query executed");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Exception raised!");
        }
    }
}