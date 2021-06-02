package com.kgc.blog.domain.posts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PsPostsRepository extends JpaRepository<PsPosts, Long>{

//	@Query("SELECT p FROM Posts p ORDER BY p.id DESC")
//	List<PsPosts> findAllDesc();
}
