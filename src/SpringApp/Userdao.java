package SpringApp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Userdao {
 

	JdbcTemplate jt;
	@Autowired
	public void setJt(JdbcTemplate jt) {
		System.out.println("temlate");
		this.jt = jt;
	}

	public int UserInsertDataInDataBase(Userbean e) {
		// TODO Auto-generated method stub
		String Query="insert into userlogin values(?,?,?,?,?)";
		Object xx[]= {e.getUsername(),e.getPassword(),e.getEmailid(),e.getContact(),e.getAddress()};
			int row=jt.update(Query, xx);
			
		return row;
	}

	public List<Userbean> UsergetDataFromDataBase(String username, String password) {
		String Query="Select username,password from userlogin where username=? and password=?";
		RowMapper<Userbean> rm= new userhelper();
		System.out.println(username);
		Object xx[]= {username,password};
		List<Userbean> li=jt.query(Query, xx, rm);
		return li;
	}

	public String Uservalidate(Userbean ub) {
		
		
		
	return null;
		
	}


}
