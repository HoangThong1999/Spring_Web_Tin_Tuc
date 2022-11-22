package com.tn.controller;

import com.tn.dto.CategoryDTO;
import com.tn.entity.Account;
import com.tn.entity.Category;
import com.tn.repository.CategoryRepository;
import com.tn.service.CategoryService;
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
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public String getAll(Model model){
        List<Category> categories = categoryService.getAll();
        List<CategoryDTO> categoryDTOS = new ArrayList<>();
        categories.forEach(obj ->{
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(obj.getId());
            categoryDTO.setCategoryName(obj.getCategoryName());
            categoryDTO.setDescription(obj.getDescription());
            categoryDTOS.add(categoryDTO);

        });
        System.out.println(categoryDTOS);

        model.addAttribute("listCategory",categoryDTOS);
        return "category-list";
    }
//    @PostMapping()
//    public String save(@RequestBody Category category){
//        categoryService.save(category);
//        return "save success";
//    }

    @GetMapping("deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        System.out.println(id);
        categoryService.delete(id);
        return "redirect:/category";
    }
//    @Transactional
//    @PutMapping("updateById/{categoryName}/{id}")
//    public ResponseEntity<?> updateById(@PathVariable String categoryName,
//                                        @PathVariable Integer id,
//                                        Category category){
//        categoryService.update(category,categoryName,id);
//        return new ResponseEntity<>("Update success",HttpStatus.OK);
//    }
}
