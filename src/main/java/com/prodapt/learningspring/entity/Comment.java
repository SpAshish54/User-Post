package com.prodapt.learningspring.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String comment;
	
	@ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "author_id", referencedColumnName = "id")
	  private User author;
	
	@ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "post_id", referencedColumnName = "id")
	  private Post post;
	
}

