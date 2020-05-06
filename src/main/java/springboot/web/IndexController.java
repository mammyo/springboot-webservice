package springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import springboot.service.PostsService;
import springboot.web.dto.PostsResponseDto;

@RequiredArgsConstructor
@Controller
public class IndexController {
	private final PostsService postsService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("posts", postsService.findAllDesc());
		return "index";    
	}


//	@GetMapping("/")
//	public String index() {
//		return "index";    // <== src/main/resources/templates/index.mustache 파일을 반환
//	}
//	
	@GetMapping("/posts/save")
	public String postsSave() {
		return "posts-save";
	}
	
	@GetMapping("/posts/update/{id}")
	public String postsUpdate(@PathVariable Long id, Model model) {
		PostsResponseDto dto = postsService.findById(id);
		model.addAttribute("post", dto);
		return "posts-update";
	}



}
