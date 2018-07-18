package SpringApp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class helper1 implements RowMapper<Loginbean> {

	@Override
	public Loginbean mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		String username=arg0.getString("username");
		String password=arg0.getString("password");
		
		return new Loginbean(username,password);
	}

}
