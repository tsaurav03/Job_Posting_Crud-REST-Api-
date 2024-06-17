package com.jobposting.service;

import java.util.List;
import java.util.Optional;

import com.jobposting.dtos.JobPostingDTO;

public interface JobPostingService {
	List<JobPostingDTO> getAllJobPostings();
	JobPostingDTO createJobPosting(JobPostingDTO jobPosting);
	Optional<JobPostingDTO> updateJobPosting(Long jobId,JobPostingDTO jobPostingDTO);
	void deleteJobPosting(Long jobId);
}
