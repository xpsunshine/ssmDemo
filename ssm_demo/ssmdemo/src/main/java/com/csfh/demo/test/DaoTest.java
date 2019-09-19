package com.csfh.demo.test;

import com.csfh.demo.dao.BankInfoDao;
import com.csfh.demo.entity.BankInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DaoTest extends BaseTest {
    @Autowired
    private BankInfoDao bankInfoDao;

    @Test
    public void selectFromTable() {
        List<BankInfo> list = bankInfoDao.listAll();
        System.out.println("Test Dao ... ");
        for(BankInfo bankInfo : list) {
            System.out.println(bankInfo);
        }
    }
}
