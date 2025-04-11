package com.example.demo.controller;

import com.example.demo.Repository.CommentsRepository;
import com.example.demo.Repository.VideoRepository;
import com.example.demo.entity.Comments;
import com.example.demo.entity.Video;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/comments")
public class CommentController {
   final private CommentsRepository commentsRepository;
   final private VideoRepository videoRepository;

    public CommentController(CommentsRepository commentsRepository, VideoRepository videoRepository) {
        this.commentsRepository = commentsRepository;
        this.videoRepository = videoRepository;
    }
    @PostMapping
    public ResponseEntity<Comments> createComment(
            @RequestBody Comments comments
            ) {//FK
        commentsRepository.save(comments);
        return new ResponseEntity<>(comments, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Comments>> getAllListComments(
            @RequestParam Long videoId
    ) {
        Video video = videoRepository.findById(videoId).get();
        List<Comments> comments = commentsRepository.findByVideo(video);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
}
