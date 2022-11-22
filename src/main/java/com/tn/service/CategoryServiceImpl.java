package com.tn.service;

import com.tn.entity.Category;
import com.tn.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository categoryRepo;
    @Override
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public void delete(Integer id) {
        categoryRepo.deleteById(id);

    }

    @Override
    public Category update(Category category, String categoryName, Integer id) {
        return categoryRepo.save(category);
    }
}
