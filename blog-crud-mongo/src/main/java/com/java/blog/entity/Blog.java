package com.java.blog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Blogs")
public class Blog {

	@Id
	private long id;
	private String title;
	private String content;
	private String author;
	private int upvote;
	private int downvote;

	/**
	 * @return the id
	 */
	public long getId() {

		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {

		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {

		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {

		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {

		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {

		this.content = content;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {

		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {

		this.author = author;
	}

	/**
	 * @return the upvote
	 */
	public int getUpvote() {

		return upvote;
	}

	/**
	 * @param upvote the upvote to set
	 */
	public void setUpvote(int upvote) {

		this.upvote = upvote;
	}

	/**
	 * @return the downvote
	 */
	public int getDownvote() {

		return downvote;
	}

	/**
	 * @param downvote the downvote to set
	 */
	public void setDownvote(int downvote) {

		this.downvote = downvote;
	}

}
