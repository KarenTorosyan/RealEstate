package com.realestate.demo.repository;

import com.realestate.demo.model.BlogComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCommentRepository extends JpaRepository<BlogComment,Integer> {
}
