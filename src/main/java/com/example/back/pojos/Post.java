package com.example.back.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private String title;
    private String content;
    private Integer userId;
    private Integer postId;
    private String postDate;
    private String modDate;
}
