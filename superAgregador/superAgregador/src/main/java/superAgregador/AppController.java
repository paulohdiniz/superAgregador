package superAgregador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class AppController {
	
	@Autowired
	private BlogRepository blogRepository;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String usersBlogs(Model model){
		List<Blog> blogs = new ArrayList<>();
		blogRepository.findAll().forEach(blogs::add);
		if(blogs != null) {
			model.addAttribute("blogs", blogs);
		}
		return "index";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {
		return "add";
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(Blog blog) {
		blogRepository.save(blog);
		return "redirect:/index";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete() {
		return "delete";
	}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(Blog blog) {
		blogRepository.delete(blog);
		return "redirect:/index";
	}
}
