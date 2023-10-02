import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/portal","root","");
        }catch(Exception e){JOptionPane.showMessageDialog(null,e);}
        return con;
    }

}