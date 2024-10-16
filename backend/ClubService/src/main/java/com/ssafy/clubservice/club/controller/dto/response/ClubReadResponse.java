package com.ssafy.clubservice.club.controller.dto.response;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class ClubReadResponse {
    private Long clubId;
    private String clubImage;
    private Long dues;
    private String clubCode;
    private String clubName;
    private String clubIntro;
    private LocalDate createdDate;
    private List<ParticipantReadResponse> participants = new ArrayList<>();
}
