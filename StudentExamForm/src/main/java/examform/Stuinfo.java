package examform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Stuinfo {
	private String dburl = "jdbc:mysql://localhost:3306/admin";
	private String dbuname = "root";
	private String dbpassword = "Adi@94210";
	private String dbdriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public String insert(Studata studata) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "insert into studata values(?,?,?,?,?,?,?,?)";
		String result="Data Entered Successfully";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, studata.getName());
			ps.setString(2, studata.getNumber());
			ps.setString(3, studata.getCollegeid());
			ps.setString(4, studata.getBirthday());
			ps.setString(5, studata.getGender());
			ps.setString(6, studata.getFifthsub());
			ps.setString(7, studata.getSixthsub());
			ps.setString(8, studata.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result="Data Not Entered Successfully";
			e.printStackTrace();
		}
		return result;

	}
}