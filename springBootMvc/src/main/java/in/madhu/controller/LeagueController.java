package in.madhu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;
import in.madhu.model.Player;

@Controller
public class LeagueController {
   @Autowired
	private in.madhu.service.WishMessage WishMessage;
	@RequestMapping
	public String krishna()
	{
		System.out.println("i am in");
		return "index";
	}
	@RequestMapping("/wish")
	public ModelAndView wishing()
	{
		String msg=WishMessage.wishMsgGenerator();
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg",msg);
		mv.setViewName("home");
		
		return mv;
		}
	@GetMapping("/countries")
	public ModelAndView playerCountries()
	{
		
		/*
		 * String[]countryNames= {"ind","aus","eng","sa"}; model.put("countryNames",
		 * countryNames); model.put("player", "kohli");
		 */
		ModelAndView mv=new ModelAndView();
		Player pl=new Player("kohli",18);
		//mv.add("pl", pl);
		mv.addObject(pl);
		String m="madhu";
		Map<String,Object>m1=new HashMap<String,Object>();
		m1.put("name", "kohli");
		mv.addObject("mk",m1);
		 //String[]countryNames= {"ind","aus","eng","sa"};
		List<String>countryNames=new ArrayList<String>();
		countryNames.add("ind");
		countryNames.add("aus");
		 mv.addObject("Country",countryNames);
		mv.setViewName("countries");
		return mv;
	}
	@RequestMapping("/data")
		public String showdata(@RequestParam  String name,@RequestParam	int no)
		{
		System.out.println(name);
		System.out.println(no);
			return "look";
			
		}
		
	
@RequestMapping("/data1")
public String showdata1(@RequestParam("sname")  String name,@RequestParam("sno")	int no)
{
System.out.println(name);
System.out.println(no);
	return "look";
	
}

}
	

