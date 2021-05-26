package com.kgc.blog.web.dto;

import java.time.LocalDateTime;

import com.kgc.blog.domain.posts.Posts;

import lombok.Getter;

@Getter
public class PostsListResponseDto {

	private Long id;
	
	private String title;
	
	private String content;
	
	private LocalDateTime modifiedDate;

	public PostsListResponseDto(Posts entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.content = entity.getContent();
		this.modifiedDate = entity.getModifiedTime();
	}
	
	
}
