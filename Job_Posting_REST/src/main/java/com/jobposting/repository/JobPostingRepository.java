package com.jobposting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobposting.entites.JobPosting;

@Repository
public interface JobPostingRepository extends JpaRepository<JobPosting, Long>{

}
