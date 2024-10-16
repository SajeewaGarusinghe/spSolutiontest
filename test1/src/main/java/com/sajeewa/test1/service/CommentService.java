package com.sajeewa.test1.service;


import com.sajeewa.test1.entity.Comment;
import com.sajeewa.test1.entity.News;
import com.sajeewa.test1.entity.User;
import com.sajeewa.test1.repo.CommentRepository;
import com.sajeewa.test1.repo.NewsRepository;
import com.sajeewa.test1.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final NewsRepository newsRepository;
    private final UserRepository userRepository;

    public CommentService(CommentRepository commentRepository, NewsRepository newsRepository, UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.newsRepository = newsRepository;
        this.userRepository = userRepository;
    }

    public List<Comment> getCommentsByNewsId(Long newsId) {
        return commentRepository.findByNewsId(newsId);
    }

    public Comment addComment(Long newsId, Long userId, String content) {
        News news = newsRepository.findById(newsId).orElseThrow(() -> new RuntimeException("News not found"));
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));

        Comment comment = new Comment();
        comment.setNews(news);
        comment.setAppUser(user);
        comment.setContent(content);

        return commentRepository.save(comment);
    }
}
