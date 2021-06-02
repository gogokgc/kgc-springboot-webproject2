//package com.kgc.blog.web;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.List;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.kgc.blog.domain.posts.Posts;
//import com.kgc.blog.domain.posts.PostsRepository;
//import com.kgc.blog.web.dto.PostsSaveRequestDto;
//import com.kgc.blog.web.dto.PostsUpdateRequestDto;
//
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//public class PostsApiCOntrollerTest {
//
//	@LocalServerPort
//	private int port;
//	
//	 @Autowired
//	 private TestRestTemplate restTemplate;
//
//	 @Autowired
//	 private PostsRepository postsRepository;
//
//	 @Autowired
//	 private WebApplicationContext context;
//
//	 private MockMvc mvc;
//	 
//	 @AfterEach
//	 public void tearDown() throws Exception {
//	        postsRepository.deleteAll();
//	 }
//	 
//	 @Test
//	 public void Posts_put() throws Exception{
//		 String title = "title";
//		 String content = "content";
//		 PostsSaveRequestDto requestDto = PostsSaveRequestDto.builder()
//				 .title(title)
//				 .content(content)
//				 .author("author")
//				 .build();
//		 String url = "http://localhost:" + port + "/api/v1/posts";
//		 
//		 ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, requestDto, Long.class);
//		 
//		 assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
//		 assertThat(responseEntity.getBody()).isGreaterThan(0L);
//		  List<Posts> all = postsRepository.findAll();
//		  assertThat(all.get(0).getTitle()).isEqualTo(title);
//		  assertThat(all.get(0).getContent()).isEqualTo(content);
//	 }
//	
//	 @Test
//	 public void Posts_edit() throws Exception{
//		 
//		 Posts savedPosts = postsRepository.save(Posts.builder()
//				 .title("title")
//				 .content("content")
//				 .author("author")
//				 .build());
//		 
//		 Long updateId = savedPosts.getId();
//		 String expectedTitle = "title2";
//		 String expectedContent = "content2";
//		 
//		 PostsUpdateRequestDto requestDto = PostsUpdateRequestDto.builder()
//				 .title(expectedTitle)
//				 .content(expectedContent)
//				 .build();
//		 
//		 String url = "http://localhost:" + port + "/api/v1/posts/" + updateId;
//		 
//		 HttpEntity<PostsUpdateRequestDto> requestEntity = new HttpEntity<>(requestDto);
//		 
//		 //
//		 ResponseEntity<Long> responseEntity = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, Long.class);
//		 
//		 assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
//		 assertThat(responseEntity.getBody()).isGreaterThan(0L);
//		  List<Posts> all = postsRepository.findAll();
//		  assertThat(all.get(0).getTitle()).isEqualTo(expectedTitle);
//		  assertThat(all.get(0).getContent()).isEqualTo(expectedContent);
//	 }
//}
