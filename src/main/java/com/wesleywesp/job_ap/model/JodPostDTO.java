package com.wesleywesp.job_ap.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public record JodPostDTO(int postId,
                         String postProfile,
                         String postDesc,
                         int reqExperience,
                         List<String> postTechStack ) {
}
