package com.csfh.demo.controller;

import com.csfh.demo.entity.BankInfo;
import com.csfh.demo.service.impl.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class BankController {
    @Autowired
    private BankServiceImpl bankService;

    @GetMapping("/selectFromTable")
    public Object selectFromTable() {
        List<BankInfo> list = bankService.listAll();
        if(null == list) {
            System.out.println("无数据！");
            return "无数据！";
        }

        System.out.println("selectFromTable .... ");
        return list;
    }
}
