package SpringApp;




	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	@Service
	public class Loginservice {
		Logindao dl;
		
		@Autowired
		public void setDl(Logindao dl) {
			
			System.out.println("gate for 4 to 5");
			this.dl = dl;
		}


		public int InsertData(Loginbean e) {
			// TODO Auto-generated method stub
			
			return dl.InsertDataInDataBase(e);
		}


		public List<Loginbean> getData(String username) {
			
			return dl.getDataFromDataBase(username);
		}


		public List<Loginbean> ShowAllData() {
			// TODO Auto-generated method stub
			return dl.ShowAllDataFromDao();
		}
	}

