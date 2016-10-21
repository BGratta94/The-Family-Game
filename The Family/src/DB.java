import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Brandon
 */
public class DB 
{
     public DB()
    {
        try 
        {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } 
        catch (Exception ex) 
        {
            // handle the error
        }
    }
}
