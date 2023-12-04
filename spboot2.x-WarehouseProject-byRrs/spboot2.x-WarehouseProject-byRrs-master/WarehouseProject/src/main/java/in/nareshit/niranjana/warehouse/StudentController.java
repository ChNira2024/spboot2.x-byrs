package in.nareshit.niranjana.warehouse;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/setuptest")
	public String Test()
	{
		return "setupTest";
	}

}
