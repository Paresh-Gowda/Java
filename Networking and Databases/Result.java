import java.sql.*;
import java.sql.DriverManager;
class Result {
    public static void main(String args[]) throws SQLException
    {
        String driver="oracle.jdbc.driver.OracleDriver";
        try
        {
            Class.forName(driver);
            System.out.println("Drive loaded successfully");
            String url="jdbc:oracle:thin:@Lenovo-Ideapad:1521:XE";
            String user="system";
            String pwd="201983";
            Connection con=DriverManager.getConnection(url,user,pwd);
            System.out.println("Connection established");
            String sql="SELECT * FROM Employee";
            ResultSet rs=null;
            Statement st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                int E_id=rs.getInt("E_id");
                String E_name=rs.getString("E_name");
                System.out.println(E_id+" "+E_name);
            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Exception has been raised!");
        }
    }
}