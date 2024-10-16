package com.sajeewa.test1.controller;

import com.sajeewa.test1.entity.Comment;
import com.sajeewa.test1.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/news/{newsId}")
    public ResponseEntity<List<Comment>> getCommentsByNewsId(@PathVariable Long newsId) {
        List<Comment> comments = commentService.getCommentsByNewsId(newsId);
        return ResponseEntity.ok(comments);
    }

    @PostMapping("/news/{newsId}/user/{userId}")
    public ResponseEntity<Comment> addComment(@PathVariable Long newsId, @PathVariable Long userId, @RequestBody String content) {
        Comment comment = commentService.addComment(newsId, userId, content);
        return ResponseEntity.ok(comment);
    }
}

