package SpringApp;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Usercontroller {

Userservice sl;
	

	@Autowired
	public void setSl(Userservice sl) {
		System.out.println("gate for 3 to 4");
		this.sl = sl;
	}


	@RequestMapping("/usersignup")
	public ModelAndView startPage(HttpServletRequest request)
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String emailid=request.getParameter("emailid");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		
		Userbean e=new Userbean(username,password,emailid,contact,address);
		
			int row=sl.UserInsertData(e);
			
		ModelAndView mav=new ModelAndView();
		mav.setViewName("UserLogin.jsp");
		return mav;	
	}
	
	@RequestMapping("/userlogin")
	public ModelAndView SingleSelect(HttpServletRequest request)
	{
		
		 
		String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 
		Userbean ub = new Userbean(); //creating object for LoginBean class, which is a normal java class, contains just setters and getters. Bean classes are efficiently used in java to access user information wherever required in the application.
		 
		ub.setUsername(username); //setting the username and password through the loginBean object then only you can get it in future.
		ub.setPassword(password);
		 
				 
		String userValidate = sl.authenticateUser(ub); //Calling authenticateUser function
		ModelAndView mav=new ModelAndView(); 
		
		if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
		 {
			
				mav.addObject("k1", username);
				mav.setViewName("Welcomeuser.jsp");
				
				return mav;
				
		 }
		 else
		 {
			 	mav.addObject("k2"," Invalid user");
		    	mav.setViewName("UserLogin.jsp");
		    	return mav; 
		 }
		 
	}
}
