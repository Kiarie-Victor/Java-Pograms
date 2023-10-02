import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
    public static int save(String RegNo,String FullName,String EmailId,String  MobileNumber,String Password){
        int status=0;
        try{
            Connection con=Db.getConnection();
            PreparedStatement ps=con.prepareStatement("INSERT INTO tblstudents (RegNo,FullName, EmailId, MobileNumber, Password) values(?,?,?,?,?)");

            ps.setString(1,RegNo);
            ps.setString(2,FullName);
            ps.setString(3,EmailId);
            ps.setString(4,MobileNumber);
            ps.setString(5,Password);

            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
    public static int delete(String regno){
        int status=0;
        try{
            Connection con=Db.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from tblstudents where RegNo=?");
            ps.setString(1,regno);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
}