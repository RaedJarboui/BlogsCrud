
package com.java.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.java.blog.entity.Blog;
import com.java.blog.service.BlogService;

/**
 * {@link } class.
 *
 * @author hp
 * @since 0.1.0
 */
@RestController
@CrossOrigin
public class BlogController {

	@Autowired
	BlogService blogService;

	@PostMapping("/add/blog")
	@ResponseStatus(HttpStatus.OK)
	public Blog addBlog(@RequestBody Blog b) {

		return blogService.addBlog(b);

	}

	@GetMapping("/blogs")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Blog>> FecthBlogs() {

		return new ResponseEntity<>(blogService.fecthBlogs(), HttpStatus.OK);
	}

	@GetMapping("/blog/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Blog> getBlogById(@PathVariable("id") int id) {

		return new ResponseEntity<>(blogService.getBlogById(id), HttpStatus.OK);

	}

}
