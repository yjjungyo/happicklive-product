package com.factory.happickliveproduct.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.factory.happickliveproduct.domain.vo.Questioner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok annotation
@AllArgsConstructor //lombok annotation
@NoArgsConstructor //lombok annotation
@Entity
@Table(name="Question")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne // many member to one team
	@JoinColumn(name="product_id")
	private Product product;
	
	@Column(name="questioner")
	@Embedded
	private Questioner questioner;	
	
	@Column(name="title")
	private String title;
	
	@Column(name="question_contents")
	private String questionContents;
	
	
	@Column(name="answer_contents")
	private String answerContents;
	
	
	@Column(name="que_reg_date")
	private Date queRegDate;
	
	@Column(name="ans_reg_date")
	private Date ansRegDate;	
	
}
