package com.jobposting.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobposting.dtos.JobPostingDTO;
import com.jobposting.entites.JobPosting;
import com.jobposting.repository.JobPostingRepository;

@Service
@Transactional
public class JobPostingServiceImpl implements JobPostingService {
	@Autowired
	private JobPostingRepository jobPostingRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<JobPostingDTO> getAllJobPostings() {

		return jobPostingRepository.findAll().stream().map(entity -> mapper.map(entity, JobPostingDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public JobPostingDTO createJobPosting(JobPostingDTO jobPostingDTO) {
		JobPosting jobPosting = mapper.map(jobPostingDTO, JobPosting.class);
		jobPosting.setPostingDate(LocalDate.now());

		JobPosting savedPosting = jobPostingRepository.save(jobPosting);
		return mapper.map(savedPosting, JobPostingDTO.class);

	}

	@Override
	public Optional<JobPostingDTO> updateJobPosting(Long jobId, JobPostingDTO jobPostingDTO) {
	
		return jobPostingRepository.findById(jobId).map(jobPosting->{
			mapper.map(jobPostingDTO, jobPosting);
			JobPosting updatJobPosting = jobPostingRepository.save(jobPosting);
			return mapper.map(updatJobPosting, JobPostingDTO.class);
		});
	}

	@Override
	public void deleteJobPosting(Long jobId) {
		jobPostingRepository.deleteById(jobId);
		
	}

}
