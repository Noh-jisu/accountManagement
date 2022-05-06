package spring.framework.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.framework.test.service.MainService;

@Controller
public class MainController {

	private static Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	MainService sv;
	
	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String main(Model model) {
		System.out.println("메인 컨트롤러 진입");
		return "main";
	}
}
