import java.sql.*;
public class UnitDao {


    public static int save(String unit1,String unit2,String unit3){
        int status=0;
        try{
            Connection con=Db.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into unitsreg(unit1,unit2,unit3) values(?,?,?)");
            ps.setString(1,unit1);
            ps.setString(2,unit2);
            ps.setString(3,unit3);

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
