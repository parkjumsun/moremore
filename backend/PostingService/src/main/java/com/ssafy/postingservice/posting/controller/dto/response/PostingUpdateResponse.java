package com.ssafy.postingservice.posting.controller.dto.response;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class PostingUpdateResponse {

    private Long memberId;
    private Long accountHistoryId;
    private String postingContent;
    private List<String> imageUrls;

}
