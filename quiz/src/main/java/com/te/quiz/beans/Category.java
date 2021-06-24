package com.te.quiz.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Category implements Serializable{
	@Id
	private int cid;
	private String cname;
	@OneToMany(mappedBy = "category",cascade ={CascadeType.ALL})
	private List<Questions> questions;
	@Autowired
	private Questions que;
	
	
	

}
