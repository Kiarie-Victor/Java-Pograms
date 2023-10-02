import java.sql.*;
public class ResultDao {

	
	public static int save(String regno,String name,String unit,String grade){
		int status=0;
		try{
			Connection con=Db.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into examResults(regno,name,unit,grade) values(?,?,?,?)");
			ps.setString(1,regno);
			ps.setString(2,name);
			ps.setString(3,unit);;
            ps.setString(4,grade);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
