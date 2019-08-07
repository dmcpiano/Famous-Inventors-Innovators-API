package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.apiservice.ApiService;
import co.grandcircus.famouslab.entity.Innovators;
import co.grandcircus.famouslab.entity.Inventor;

@Controller
public class FamousLabController {

	@Autowired
	ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		List<Inventor> inventors = apiService.getNerds();
		mv.addObject("list", inventors);
		return mv;
	}
	
	@RequestMapping("/complete")
	public ModelAndView completeList() {
		ModelAndView mv2 = new ModelAndView("complete");
		List<Innovators> innovators = apiService.getOtherNerds();
		mv2.addObject("completeList", innovators);
		return mv2;
	}
}
