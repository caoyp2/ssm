package com.ssm.action;

import com.ssm.domain.UserCard;

import com.ssm.service.UserCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/userCard")
public class UserCardController {

    @Autowired
    UserCardService userCardService;

    @GetMapping("/findAll")
    public String findAll(){
        System.out.println("Controller试图层。。。。。");
        List<UserCard> all = userCardService.findAll();
        System.out.println(all);
        return "success";
    }

}
