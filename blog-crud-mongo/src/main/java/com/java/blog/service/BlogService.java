/*
 * Copyright (C) TALYS ™ - All Rights Reserved Unauthorized copying of this file, via any medium is
 * strictly prohibited Proprietary and confidential
 */
package com.java.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.blog.entity.Blog;
import com.java.blog.repository.BlogRepository;

/**
 * {@link } class.
 *
 * @author hp
 * @since 0.1.0
 */
@Service
public class BlogService {
	@Autowired
	BlogRepository blogRepository;

	public Blog addBlog(Blog b) {

		return blogRepository.save(b);

	}

	public List<Blog> fecthBlogs() {

		return (List<Blog>) blogRepository.findAll();

	}

	public Blog getBlogById(int id) {

		Blog blog = blogRepository.findById(id).get();
		return blog;

	}

}
