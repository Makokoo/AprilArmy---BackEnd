package com.example.back.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    private String title;
    private String description;
    private String url;
    private String image;
    private String publishDate;
}
