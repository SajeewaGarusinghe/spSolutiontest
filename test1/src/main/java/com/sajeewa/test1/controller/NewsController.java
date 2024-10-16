package com.sajeewa.test1.controller;


import com.sajeewa.test1.entity.News;
import com.sajeewa.test1.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<News>> getNewsByCategory(@PathVariable Long categoryId) {
        List<News> newsList = newsService.getNewsByCategory(categoryId);
        return ResponseEntity.ok(newsList);
    }

    @GetMapping("/{newsId}")
    public ResponseEntity<News> getNewsById(@PathVariable Long newsId) {
        News news = newsService.getNewsById(newsId);
        return ResponseEntity.ok(news);
    }
}
