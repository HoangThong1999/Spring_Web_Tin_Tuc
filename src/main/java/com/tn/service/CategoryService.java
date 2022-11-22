package com.tn.service;

import com.tn.entity.Account;
import com.tn.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    Category save(Category category);

    void delete(Integer id);

    Category update(Category category,String categoryName,Integer id);
}
