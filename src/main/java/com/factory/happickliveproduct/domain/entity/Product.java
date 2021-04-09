package com.factory.happickliveproduct.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.factory.happickliveproduct.domain.enums.ProductStatus;
import com.factory.happickliveproduct.domain.vo.LiveBooking;
import com.factory.happickliveproduct.domain.vo.ProductImage;
import com.factory.happickliveproduct.domain.vo.Seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok annotation
@AllArgsConstructor //lombok annotation
@NoArgsConstructor //lombok annotation
@Entity
@Table(name="product")
public class Product {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;	

	@Column(name="keyword")
	private String keyword;
	

//	@Column(name="liveBooking")
	@Embedded
	private LiveBooking liveBooking;
	
	@Column(name="seller")
	@Embedded
	private Seller seller;	
	
	@Column(name="location")
	private String location;
	
	@Column(name="price")
	private Long price;
	
	@Column(name="product_image")
	@Embedded
	private ProductImage productImage;		
	
//	@Column(name="questions")
//	private List<Question> questions;
	
	@Column(name="product_status")
	@Enumerated(EnumType.STRING)
	private ProductStatus productStatus;	
	
	@Column(name="reg_date")
	private Date regdate;
	
	//	
//	@ManyToOne // many member to one team
//	@JoinColumn(name="team_id")
//	private Team team;
//	
//	@Column(name="role")
//	@Enumerated(EnumType.STRING) // order 가 아닌 string 자체로 값을 저장 
//	private Role role;
	
	//variable Object로 변경하였음
//	@Column(name="email")
//	private String email;
//	@Column(name="mobile")
//	private String mobile;
//	
//	@Column(name="contact")
//	@Embedded
//	private Contact contact;
	
	
}
