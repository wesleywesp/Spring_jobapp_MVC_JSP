package com.wesleywesp.job_ap.repository;

import com.wesleywesp.job_ap.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {

    List<JobPost> jobs =new ArrayList<>(Arrays.asList(
            new JobPost(1, "java developer","must have experiencia"
                    , 1, List.of("Java", "CSS"))

    ));

    public List<JobPost> getAllJobs(){
        return jobs;

    }
    public void addJob(JobPost job){
        jobs.add(job);
    }
}
