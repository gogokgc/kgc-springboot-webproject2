//package com.kgc.blog.domain.posts;
//
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//public class PostsRepositoryTest {
//
//	@Autowired
//	PostsRepository postsRepository;
//	
//	@AfterEach
//	public void cleanup() {
//		postsRepository.deleteAll();
//	}
//	
//	@Test
//	public void postSave_read() {
//		String title = "test title";
//		String content = "test content";
//
//		postsRepository.save(Posts.builder()
//				.title(title)
//				.content(content)
//				.author("gogokgc@gmail.com")
//				.build());
//		
//		List<Posts> postsList = postsRepository.findAll();
//		
//		Posts posts = postsList.get(0);
//		assertThat(posts.getTitle()).isEqualTo(title);
//		assertThat(posts.getContent()).isEqualTo(content);
//	}
//	
//	@Test
//	public void BaseTimeEntityTest() {
//		
//		LocalDateTime now = LocalDateTime.of(2021, 5, 25, 0, 0, 0);
//		postsRepository.save(Posts.builder()
//				.title("title")
//				.content("content")
//				.author("author")
//				.build());
//		//
//		
//		List<Posts> postsList = postsRepository.findAll();
//		
//		//
//		
//		Posts posts = postsList.get(0);
//		
//		System.out.println(">>>>>>>>>> createDate = " + posts.getCreateDate() + ", modifiedDate = " + posts.getModifiedTime());
//		
//		assertThat(posts.getCreateDate()).isAfter(now);
//		assertThat(posts.getModifiedTime()).isAfter(now);
//	}
//}
