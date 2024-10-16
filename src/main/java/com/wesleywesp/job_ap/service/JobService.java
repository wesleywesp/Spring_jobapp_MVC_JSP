package com.wesleywesp.job_ap.service;

import com.wesleywesp.job_ap.model.JobPost;
import com.wesleywesp.job_ap.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Provider;
import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepository repository;

    public void  addJob(JobPost jobPost){
        repository.addJob(jobPost);

    }
    public List<JobPost> getAllJobs(){
        return repository.getAllJobs();
    }
}
