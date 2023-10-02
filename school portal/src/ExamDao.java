import java.sql.*;
public class ExamDao {

	
	public static int save(int id,String course,String unit){
		int status=0;
		try{
			Connection con=Db.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into exam(id,course,unit) values(?,?,?)");
			ps.setInt(1,id);
			ps.setString(2,course);
			ps.setString(3,unit);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=Db.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from exam where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static boolean validate(String unit,String course){
		boolean status=false;
		try{
			Connection con=Db.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from exam where unit=? and course=?");
			ps.setString(1,unit);
			ps.setString(2,course);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
