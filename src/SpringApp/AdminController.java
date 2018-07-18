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
public class AdminController {
 
   Adminservice s1;
	

	@Autowired
	public void setSl(Adminservice sl) {
		System.out.println("gate for 3 to 4");
		this.s1 = sl;
	}


	@RequestMapping("/adminstart")
	public ModelAndView startPage(HttpServletRequest request)
	{
		
		//admin signup details storing into database
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String emailid=request.getParameter("emailid");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		
		Adminbean e=new Adminbean(username,password,emailid,contact, address);
		
			int row=s1.AdminInsertData(e);
			
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Adminlogin.jsp");
		return mav;
		
//		mav.addObject("k1", "Value Is Inserted");
//		List<Loginbean> list=sl.ShowAllData();
//		mav.addObject("k2", list);
		
	
		
		
	}
	
	
	@RequestMapping("/adminlogin")
	public ModelAndView LoginValidate(HttpServletRequest request)
	{
	      	String username=request.getParameter("username");
		    String password=request.getParameter("password");
			   boolean result;
			   ModelAndView modelAndView = null;
//			   String userName = ad.getUsername();
//			   String password = ad.getPassword();
			 
			   if ( username != null && password != null) {
			       result = s1.isValidUser(username, password);
			       if (result == true) {
			           modelAndView = new ModelAndView("AdminHomepage");
			       } else {
			           modelAndView = new ModelAndView("Adminlogin");
			           modelAndView.addObject("msg", "Wrong user name or password");
			       }
			   } else {
			       modelAndView = new ModelAndView("Adminlogin");
			       modelAndView.addObject("msg", "Error occurred while processing");
			   }
			 return modelAndView;
			}
		
    }
	
	
	
	/*public ModelAndView ShowAll()
	{
		System.out.println("show function");
		List<Employee> list=sl.ShowAllData();
		ModelAndView mav=new ModelAndView();
		System.out.println(list.get(0).getEmpid());
		
		mav.setViewName("index.jsp");
		return mav;
		
	}*/

