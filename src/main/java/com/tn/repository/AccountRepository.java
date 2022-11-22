package com.tn.repository;

import com.tn.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
//    @Query("FROM Account")
//    List<Account> getAllData();
//
//    @Modifying
//    @Query("DELETE FROM Account WHERE id = :id")
//    void deleteAccountById(@Param("id") Integer id);
//
//    @Modifying
//    @Query("UPDATE Account set userName = :userName where id = :id")
//    void updateAccountById(@Param("userName") String userName,
//                           @Param("id") Integer id);



}
