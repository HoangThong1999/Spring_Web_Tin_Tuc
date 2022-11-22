package com.tn.repository;

import com.tn.entity.Account;
import com.tn.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {
//    @Query("FROM Article ")
//    List<Article> getAllData();
//
//    @Modifying
//    @Query("DELETE FROM Article WHERE id = :id")
//    void deleteArticleById(@Param("id") Integer id);
//
//    @Modifying
//    @Query("UPDATE Article set content = :content where id = :id")
//    void updateArticleById(@Param("content") String content,
//                           @Param("id") Integer id);

}
