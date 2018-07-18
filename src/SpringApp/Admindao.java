package SpringApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Admindao{

	JdbcTemplate jt;
	@Autowired
	public void setJt(JdbcTemplate jt) {
		System.out.println("template");
		this.jt = jt;
	}

	public int AdminInsertDataInDataBase(Adminbean e) {
		// TODO Auto-generated method stub
		String Query="INSERT INTO adminlogin values(?,?,?,?,?)";
		Object user[]= {e.getUsername(),e.getPassword(),e.getEmailid(),e.getContact(),e.getAddress()};
			int row=jt.update(Query, user);
		    return row;
	}
//	public List<Loginbean> getDataFromDataBase(String username) {
//		// TODO Auto-generated method stub
//		String Query="Select username,password From login where username=?";
//		RowMapper<Loginbean> rm=new helper();
//		System.out.println(username);
//		Object xx[]= {username};
//		List<Loginbean> li=jt.query(Query, xx, rm);
//		return li;
//	}
//
//	public List<Loginbean> ShowAllDataFromDao() {
//		// TODO Auto-generated method stub
//		String Query="Select * From login";
//		RowMapper<Loginbean> rm=new helper1();
//		List<Loginbean> li=jt.query(Query, rm);
//		return li;
//	}

	public boolean isValidUserdata(String username, String password) {
		
		      boolean retVal;
		      try { 
		           String SQL = "select count(*) from adminlogin where username= ? and password = ?";
		           @SuppressWarnings("deprecation")
				int count = jt.queryForInt(SQL, new Object[]{username, password});
		 
		           if (count == 1) {
		                retVal = true;
		           } else {
		                retVal = false;
		           }
		      } catch (Exception ex) { 
		          retVal = false;
		      }
		      return retVal;
		 }
		
	}

	
