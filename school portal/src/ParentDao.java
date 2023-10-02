import java.sql.*;
public class ParentDao {


    public static int save(String Fname,String PEmail,String username,String Mobno,String pass){
        int status=0;
        try{
            Connection con=Db.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into parent(Fullname,ParentEmail,UserName,Mobno,Password) values(?,?,?,?,?)");
            ps.setString(1,Fname);
            ps.setString(2,PEmail);
            ps.setString(3,username);;
            ps.setString(4,Mobno);
            ps.setString(5,pass);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }

}
