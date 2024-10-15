package com.wesleywesp.job_ap.controllers;

import com.wesleywesp.job_ap.model.JobPost;
import com.wesleywesp.job_ap.model.JodPostDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @GetMapping({"/", "home"})
    public String home(){
        System.out.println("test");
        return"home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }


    @PostMapping("hanbleForm")
    public  String handlrForm(JodPostDTO dados){
        var jobpost = dados;
        new JobPost(dados);
        System.out.println("ok");
        return "sucess";

    }

}
