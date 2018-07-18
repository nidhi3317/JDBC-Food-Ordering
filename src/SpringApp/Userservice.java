package SpringApp;

import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Userservice {
	Userdao dl;
	
	@Autowired
	public void setDl(Userdao dl) {
		
		System.out.println("gate for 4 to 5");
		this.dl = dl;
	}


	public int UserInsertData(Userbean e) {
		// TODO Auto-generated method stub
		
		return dl.UserInsertDataInDataBase(e);
	}


	public List<Userbean> UsergetData(String username, String password) {
		
		return dl.UsergetDataFromDataBase(username,password);
		
			}


	public String authenticateUser(Userbean ub) {
		return dl.Uservalidate(ub);
		
	}


//	public List<Userbean> ShowAllData() {
//		return dl.UserShowAllDataFromDao();
//	}


}
