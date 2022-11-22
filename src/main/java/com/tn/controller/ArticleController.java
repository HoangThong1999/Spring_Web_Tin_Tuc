package com.tn.controller;

import com.tn.dto.ArticleDTO;
import com.tn.entity.Account;
import com.tn.entity.Article;
import com.tn.repository.ArticleRepository;
import com.tn.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping()
    public String getAll(Model model){
        List<Article> articles = articleService.getAll();
        List<ArticleDTO> articleDTOS = new ArrayList<>();
        articles.forEach(obj ->{
            ArticleDTO articleDTO = new ArticleDTO();
            articleDTO.setId(obj.getId());
            articleDTO.setTitle(obj.getTitle());
            articleDTO.setContent(obj.getContent());
            articleDTO.setCreatedDate(obj.getCreatedDate());
            articleDTO.setUpdatedDate(obj.getUpdatedDate());
            articleDTO.setImage(obj.getImage());

            articleDTO.setCategoryName(obj.getCategory().getCategoryName());

            articleDTOS.add(articleDTO);

        });
        System.out.println(articleDTOS);
        model.addAttribute("listArticle",articleDTOS);
        return "article-list";
    }

//    @PostMapping()
//    public String save(@RequestBody Article article){
//        articleService.save(article);
//        return "save success";
//    }


    @GetMapping("deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        System.out.println(id);
        articleService.delete(id);
        return "redirect:/article";
    }

//    @Transactional
//    @PutMapping("updateById/{content}/{id}")
//    public ResponseEntity<?> updateById(@PathVariable String content,
//                                        @PathVariable Integer id,
//                                        Article article){
//        articleService.update(article,content,id);
//        return new ResponseEntity<>("Update success",HttpStatus.OK);
//    }
}
