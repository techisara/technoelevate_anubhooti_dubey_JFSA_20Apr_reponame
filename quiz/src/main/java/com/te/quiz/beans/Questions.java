package com.te.quiz.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Questions implements Serializable {
@Id
private int id;
private String ques;
private String optionA;
private String optionB;
private String optionC;
private String optionD;
private String correctOption;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="cid")
private Category category;



}
