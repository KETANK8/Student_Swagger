package com.studentswagger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stId;
	private String stFirstName;
	private String stLastName;
	private String stUserName;
	private String stPassWord;
	private String stDomain;
	private String stEmail;
	private String stContact;
	private int stAge;

}
