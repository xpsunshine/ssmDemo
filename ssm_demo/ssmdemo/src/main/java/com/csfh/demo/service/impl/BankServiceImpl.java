package com.csfh.demo.service.impl;

import com.csfh.demo.dao.BankInfoDao;
import com.csfh.demo.entity.BankInfo;
import com.csfh.demo.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
    private BankInfoDao bankInfoDao;

    @Override
    public List<BankInfo> listAll() {
        return bankInfoDao.listAll();
    }
}
