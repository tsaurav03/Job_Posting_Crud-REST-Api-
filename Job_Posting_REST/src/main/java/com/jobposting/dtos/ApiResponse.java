package com.jobposting.dtos;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ApiResponse {
         
	private String message;
	private LocalDateTime ts;
	
	public ApiResponse(String message) {
		super();
		this.message=message;
		this.ts=LocalDateTime.now();
		
	}
}
