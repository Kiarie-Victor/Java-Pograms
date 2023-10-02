import java.sql.*;
public class FeeDao {


    public static int save(String Yos,String sem,String amount,String paid,String bal){
        int status=0;
        try{
            Connection con=Db.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into fee(yos,sem,amount,paid,bal) values(?,?,?,?,?)");
            ps.setString(1,Yos);
            ps.setString(2,sem);
            ps.setString(3,amount);
            ps.setString(4,paid);
            ps.setString(5,bal);

            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }


    public static boolean validate(String unit,String course){
        boolean status=false;
        try{
            Connection con=Db.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from units where unit=? and course=?");
            ps.setString(1,unit);
            ps.setString(2,course);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }

}
