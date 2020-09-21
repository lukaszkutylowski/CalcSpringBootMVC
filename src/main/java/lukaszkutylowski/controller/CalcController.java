package lukaszkutylowski.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lukaszkutylowski.service.CalcService;

@Controller
public class CalcController {

	@RequestMapping("/calc")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public ModelAndView doCalc(@RequestParam("firstNumber") BigDecimal num1,
			@RequestParam("sign") String sign,
			@RequestParam("secondNumber") BigDecimal num2,
			ModelAndView mv) {
		
		CalcService service = new CalcService();
		BigDecimal result = null;
		
		result = service.executeCalculation(num1, num2, sign);
		
		mv.addObject("result", result);
		mv.addObject("num1", num1);
		mv.addObject("sign", sign);
		mv.addObject("num2", num2);
		mv.addObject("flag", 0);
		
		mv.setViewName("index");
		
		return mv;
	}
}