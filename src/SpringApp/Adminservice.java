package SpringApp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Adminservice {
    Admindao dl;
	
	@Autowired
	public void setDl(Admindao dl) {
		
		System.out.println("gate for 4 to 5");
		this.dl = dl;
	}


	public int AdminInsertData(Adminbean e) {
		// TODO Auto-generated method stub
		
		return dl.AdminInsertDataInDataBase(e);
	}


    public boolean isValidUser(String username,String password) {
		
		return dl.isValidUserdata(username, password);
  }
//
//
//	public List<Loginbean> ShowAllData() {
//		// TODO Auto-generated method stub
//		return dl.ShowAllDataFromDao();
//	}
}

