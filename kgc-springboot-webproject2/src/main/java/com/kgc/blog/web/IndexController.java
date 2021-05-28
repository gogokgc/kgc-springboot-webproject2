package com.kgc.blog.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kgc.blog.config.auth.dto.SessionUser;
import com.kgc.blog.service.posts.PostsService;
import com.kgc.blog.web.dto.PostsResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class IndexController {
	
	private final PostsService postsService;
	
	private final HttpSession httpSession;

	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("posts", postsService.findAllDesc());
		
		SessionUser user = (SessionUser) httpSession.getAttribute("user");
		
		if(user != null) {
			model.addAttribute("userName", user.getName());
		}
		
		return "index";
	}
	
	@GetMapping("/auth/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/posts/save")
	public String postsSave(Model model) {
		SessionUser user = (SessionUser) httpSession.getAttribute("user");
		
		if(user != null) {
			model.addAttribute("userName", user.getName());
		}
		
		return "postsSave";
	}
	
	@GetMapping("/posts/update/{id}")
	public String postsUpdate(@PathVariable Long id, Model model) {
		
		PostsResponseDto dto = postsService.findById(id);
		model.addAttribute("post", dto);
		
		return "postsUpdate";
	}
	
	@GetMapping("/auth/kakao/callback")
	public @ResponseBody String kakaoCallback(String code) {
	
		return "kakao : code : " + code;
	}
	
}
