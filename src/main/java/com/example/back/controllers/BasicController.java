package com.example.back.controllers;

import com.example.back.pojos.Card;
import com.example.back.pojos.Video;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/basic")
@Slf4j
public class BasicController {

    @GetMapping(value = "/getNews", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Card> getNews(){
        log.info("llamada.");
        List<Card> list = new ArrayList<>();
        list.add(new Card("Jimmie Strimell abandona DBA", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.\n","1",null));
        list.add(new Card("Titulo 2", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.\n","2",null));
        list.add(new Card("Titulo 3", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.\n","3","https://wallpaperaccess.com/full/1078158.jpg"));
        list.add(new Card("Titulo 4", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.\n","25",null));
        list.add(new Card("Titulo 5", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.\n","4",null));
        list.add(new Card("Titulo 6", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.\n","8", null));

        return list;
    }

    @GetMapping(value = "/getVideos", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Video> getVideos(){
        log.info("llamada.");
        List<Video> list = new ArrayList<>();
        list.add(new Video("Jimmie Strimell abandona DBA", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit","url","https://wallpaperaccess.com/full/1078158.jpg",""));
        list.add(new Video("Jimmie Strimell abandona DBA", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit","url","https://wallpaperaccess.com/full/1078158.jpg",""));
        list.add(new Video("Jimmie Strimell abandona DBA", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit","url","https://wallpaperaccess.com/full/1078158.jpg",""));
        return list;
    }

    @GetMapping(value = "/getUsers", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Video> getUsers(){
        log.info("llamada.");
        List<User> list = new ArrayList<>();
        list.add(new Video("Jimmie Strimell abandona DBA", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit","url","https://wallpaperaccess.com/full/1078158.jpg",""));
        list.add(new Video("Jimmie Strimell abandona DBA", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit","url","https://wallpaperaccess.com/full/1078158.jpg",""));
        list.add(new Video("Jimmie Strimell abandona DBA", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit","url","https://wallpaperaccess.com/full/1078158.jpg",""));
        return list;
    }


}
