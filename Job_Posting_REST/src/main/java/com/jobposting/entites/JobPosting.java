package com.jobposting.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Job_Posting")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class JobPosting extends BaseEntity {

	 @Column(length = 50,unique = true)
	 private String title;
	 private String companyName;
	 private  String location;
	 private String description;
	 private String requirements;
	 private Double salary;
	 private LocalDate postingDate;
	 
}
