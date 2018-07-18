package SpringApp;






import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Logindao 
 {

	JdbcTemplate jt;
	@Autowired
	public void setJt(JdbcTemplate jt) {
		System.out.println("temlate");
		this.jt = jt;
	}

	public int InsertDataInDataBase(Loginbean e) {
		// TODO Auto-generated method stub
		String Query="INSERT INTO login values(?,?)";
		Object xx[]= {e.getUsername(),e.getPassword()};
			int row=jt.update(Query, xx);
			
		return row;
	}
	public List<Loginbean> getDataFromDataBase(String username) {
		// TODO Auto-generated method stub
		String Query="Select username,password From login where username=?";
		RowMapper<Loginbean> rm=new helper();
		System.out.println(username);
		Object xx[]= {username};
		List<Loginbean> li=jt.query(Query, xx, rm);
		return li;
	}

	public List<Userbean> ShowAllDataFromDao() {
		
		String Query="Select username from userlogin";
		RowMapper<Userbean> rm=new helper1();
		List<Userbean> li=jt.query(Query, rm);
		return li;
	}

	
}
