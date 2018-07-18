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
public class Logincontroller {
	
	Loginservice sl;
	

	@Autowired
	public void setSl(Loginservice sl) {
		System.out.println("gate for 3 to 4");
		this.sl = sl;
	}


	@RequestMapping("/start")
	public ModelAndView startPage(HttpServletRequest request)
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Loginbean e=new Loginbean(username,password);
		
			int row=sl.InsertData(e);
			
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("k1", "Value Is Inserted");
		List<Loginbean> list=sl.ShowAllData();
		mav.addObject("k2", list);
		mav.setViewName("index.jsp");
	
		return mav;
		
	}
	
	
	
	@RequestMapping("/singleselect")
	public ModelAndView SingleSelect(HttpServletRequest request)
	{
		
		String username=request.getParameter("username");
		List<Loginbean> li =sl.getData(username);
			
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("k4", li);
		List<Loginbean> list=sl.ShowAllData();
		mav.addObject("k2", list);
		mav.setViewName("index.jsp");
	
		return mav;
		
	}
	
//	
//	public ModelAndView ShowAll()
//	{
//		System.out.println("show function");
//		List<Employee> list=sl.ShowAllData();
//		ModelAndView mav=new ModelAndView();
//		System.out.println(list.get(0).getEmpid());
//		
//		mav.setViewName("index.jsp");
//		return mav;
//		
//	}
}
