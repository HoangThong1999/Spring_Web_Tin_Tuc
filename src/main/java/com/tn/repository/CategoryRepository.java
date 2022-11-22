package com.tn.repository;

import com.tn.entity.Account;
import com.tn.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
//    @Query("FROM Category ")
//    List<Category> getAllData();
//
//    @Modifying
//    @Query("DELETE FROM Category WHERE id = :id")
//    void deleteCategoryById(@Param("id") Integer id);
//
//    @Modifying
//    @Query("UPDATE Category set categoryName = :categoryName where id = :id")
//    void updateCategoryById(@Param("categoryName") String categoryName,
//                           @Param("id") Integer id);
}
