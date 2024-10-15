package com.wesleywesp.job_ap.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobPost {

    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    public JobPost(JodPostDTO dados) {
        this(dados.postId(), dados.postProfile(), dados.postDesc(), dados.reqExperience()
        ,dados.postTechStack());
    }
}
