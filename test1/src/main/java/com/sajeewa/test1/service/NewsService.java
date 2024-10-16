package com.sajeewa.test1.service;

import com.sajeewa.test1.entity.News;
import com.sajeewa.test1.repo.NewsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<News> getNewsByCategory(Long categoryId) {
        return newsRepository.findByCategoriesId(categoryId);
    }

    public News getNewsById(Long newsId) {
        return newsRepository.findById(newsId).orElseThrow(() -> new RuntimeException("News not found"));
    }
}
