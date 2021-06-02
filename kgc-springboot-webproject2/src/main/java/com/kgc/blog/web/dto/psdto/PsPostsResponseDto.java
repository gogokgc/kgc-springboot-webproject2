package com.kgc.blog.web.dto.psdto;

import com.kgc.blog.domain.posts.PsPosts;

import lombok.Getter;

@Getter
public class PsPostsResponseDto {

	private Long id;

	private String title;
	
	private String content;
	
	private String author;

	public PsPostsResponseDto(PsPosts entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.content = entity.getContent();
		this.author = entity.getAuthor();
	}
	
}
