package com.kgc.blog.web.dto.psdto;

import java.time.LocalDateTime;

import com.kgc.blog.domain.posts.PsPosts;

import lombok.Getter;

@Getter
public class PsPostsListResponseDto {

	private Long id;
	
	private String title;
	
	private String content;
	
	private String author;
	
	private LocalDateTime modifiedDate;

	public PsPostsListResponseDto(PsPosts entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.content = entity.getContent();
		this.author = entity.getAuthor();
		this.modifiedDate = entity.getModifiedTime();
	}
	
	
}
