package SpringApp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//login 
public class userhelper implements RowMapper<Userbean> {
	@Override
	public Userbean mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		
		String username=arg0.getString("username");
		String password=arg0.getString("password");
		Userbean s1=new Userbean(username,password);
		return s1;
	}

}
