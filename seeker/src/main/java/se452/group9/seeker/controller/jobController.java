package se452.group9.seeker.controller;

import se452.group9.seeker.model.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class jobController {


	Job jobd = new Job(123, "Software Engineer 1", "adfa fdfdsafafadfafasdf afdasf", true);

	@GetMapping("/jobPost")
	public String jobPost(Model model) {
		model.addAttribute("job", jobd);
		return "jobPost";
	}

}