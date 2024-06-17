package com.jobposting.dtos;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobPostingDTO extends BaseDTO {
	private String title;
	private String companyName;
	private String location;
	private String description;
	private String requirements;
	private Double salary;
	private LocalDate postingDate;
}
