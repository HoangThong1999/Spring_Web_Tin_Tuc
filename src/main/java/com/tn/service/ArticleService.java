package com.tn.service;

import com.tn.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAll();

    Article save(Article article);

    void delete(Integer id);

    Article update(Article article,String content,Integer id);
}
