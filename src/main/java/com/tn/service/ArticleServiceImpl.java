package com.tn.service;

import com.tn.entity.Article;
import com.tn.repository.AccountRepository;
import com.tn.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    ArticleRepository articleRepo;

    @Override
    public List<Article> getAll() {
        return articleRepo.findAll();
    }

    @Override
    public Article save(Article article) {
        return articleRepo.save(article);
    }

    @Override
    public void delete(Integer id) {
        articleRepo.deleteById(id);

    }

    @Override
    public Article update(Article article, String content, Integer id) {
        return articleRepo.save(article);
    }
}
