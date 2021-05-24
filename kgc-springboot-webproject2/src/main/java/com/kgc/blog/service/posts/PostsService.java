package com.kgc.blog.service.posts;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kgc.blog.domain.posts.Posts;
import com.kgc.blog.domain.posts.PostsRepository;
import com.kgc.blog.web.dto.PostsResponseDto;
import com.kgc.blog.web.dto.PostsSaveRequestDto;
import com.kgc.blog.web.dto.PostsUpdateRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostsService {

	private final PostsRepository postsRepository;
	
	@Transactional
	public Long save(PostsSaveRequestDto requestDto) {
		
		return postsRepository.save(requestDto.toEntity()).getId();
	}

	@Transactional
	public Long update(Long id, PostsUpdateRequestDto requestDto) {
		
		Posts posts = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("There is No Posting. id : " + id)); 
		
		posts.update(requestDto.getTitle(),	requestDto.getContent());
		
		return id;
	}

	public PostsResponseDto findById(Long id) {
		
		Posts entity = postsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("There is No Posting. id : " + id));
		
		return new PostsResponseDto(entity);
	}

}
