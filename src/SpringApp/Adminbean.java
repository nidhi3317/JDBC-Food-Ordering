package SpringApp;

public class Adminbean
{

	private String username;
	private String password;
	private String emailid;
	private String contact;
	private String address;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Adminbean(String username, String password, String emailid, String contact, String address) {
		
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.contact = contact;
		this.address = address;
	}
	public Adminbean() {
		super();
	}
	
	
	

}
