package com.tn.controller;

import com.tn.dto.AccountDTO;
import com.tn.entity.Account;
import com.tn.repository.AccountRepository;
import com.tn.service.AccountService;
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
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping()
    public String getAll(Model model){
        List<Account> accounts = accountService.getAll();
        List<AccountDTO> accountDTOS = new ArrayList<>();
        accounts.forEach(obj ->{
            AccountDTO accountDTO = new AccountDTO();
            accountDTO.setId(obj.getId());
            accountDTO.setUserName(obj.getUserName());
            accountDTO.setFullName(obj.getFullName());
            accountDTO.setEmail(obj.getEmail());

            accountDTOS.add(accountDTO);
        });
        System.out.println(accountDTOS);

        model.addAttribute("listAccount",accountDTOS);

        return "account-list";
    }

//    @PostMapping()
//    public String save(@RequestBody Account account){
//        accountService.save(account);
//        return "save success";
//    }

    @GetMapping("deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        System.out.println(id);
        accountService.delete(id);
        return "redirect:/account";
    }

//    @Transactional
//    @PutMapping("updateById/{userName}/{id}")
//    public ResponseEntity<?> updateById(@PathVariable String userName,
//                                        @PathVariable Integer id,
//                                         Account account){
//        accountService.update(account, userName, id);
//        return new ResponseEntity<>("Update success",HttpStatus.OK);
//    }

}
