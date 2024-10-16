package com.wesleywesp.job_ap.controllers;

import com.wesleywesp.job_ap.model.JobPost;
import com.wesleywesp.job_ap.model.JodPostDTO;
import com.wesleywesp.job_ap.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home(){
        System.out.println("test");
        return"home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }


    @PostMapping("handleForm")
    public  String handlrForm(JobPost dados){
        service.addJob(dados);
        return "success";

    }
    @GetMapping("viewalljobs")
    public String viewalljobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";

    }

}
