package com.jobposting.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobposting.dtos.JobPostingDTO;
import com.jobposting.service.JobPostingService;

@RestController
@RequestMapping("/jobPostings")
public class JobPostingController {
 @Autowired
 private JobPostingService jobPostingservice;
 
 @PostMapping
 public ResponseEntity<?>createJobPosting(@RequestBody JobPostingDTO jobPostingDTO){
	 JobPostingDTO createdJobPostingDTO =jobPostingservice.createJobPosting(jobPostingDTO);
	 return ResponseEntity.status(201).body(createdJobPostingDTO);
		 
 }
 
 @GetMapping
 public ResponseEntity<?>getAllJobPosting(){
	 List<JobPostingDTO> jobPostings=jobPostingservice.getAllJobPostings();
	 return ResponseEntity.ok(jobPostings);
 }
 
 @PutMapping("/{jobId}")
 public ResponseEntity<?> updateJobPosting(@PathVariable Long jobId,@RequestBody JobPostingDTO jobPostingDTO){
	Optional<JobPostingDTO> updatedJobPostingDTO=jobPostingservice.updateJobPosting(jobId, jobPostingDTO);
	  return updatedJobPostingDTO.map(ResponseEntity::ok)
			  .orElseGet(()-> ResponseEntity.notFound().build());
	  
	
 }
  @DeleteMapping("/{jobId}")
  public ResponseEntity<?>deleteJobPosting(@PathVariable Long jobId){
	  jobPostingservice.deleteJobPosting(jobId);
	  return ResponseEntity.noContent().build();
	  
  }
}
