package SpringApp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Userhelper1 implements RowMapper<Userbean> {

	@Override
	public Userbean mapRow(ResultSet arg0, int arg1) throws SQLException {
		String username=arg0.getString("username");
		String password=arg0.getString("password");
		
		return new Userbean(username,password);
	}
	

}
