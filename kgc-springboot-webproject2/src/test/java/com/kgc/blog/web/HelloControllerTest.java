//package com.kgc.blog.web;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = HelloController.class)
//public class HelloControllerTest {
//
//	@Autowired
//	private MockMvc mvc;
//	
//	@Test
//	public void hello_return() throws Exception{
//		String hello = "hello";
//		
//		mvc.perform(get("/hello"))
//			.andExpect(status().isOk());
//			
//	}
//	
//	@Test
//	public void helloDto_return() throws Exception{
//		String name = "test";
//		int amount = 1000;
//		
//		mvc.perform(
//				get("/hello/dto")
//					.param("name", name)
//					.param("amount", String.valueOf(amount)))
//					.andExpect(jsonPath("$.name", is(name)))
//					.andExpect(jsonPath("$.amount", is(amount)));
//	}
//}
