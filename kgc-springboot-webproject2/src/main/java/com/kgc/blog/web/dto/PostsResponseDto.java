package com.kgc.blog.web.dto;

import com.kgc.blog.domain.posts.Posts;

import lombok.Getter;

@Getter
public class PostsResponseDto {

	private Long id;

	private String title;
	
	private String content;
	
	private String author;

	public PostsResponseDto(Posts entity) {
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.content = entity.getContent();
		this.author = entity.getAuthor();
	}
	
}