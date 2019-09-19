package com.csfh.demo.entity;

public class BankInfo {
    private String BankInfo;
    private Integer PersonCount;
    private Integer ChildBankCount;

    void setBankInfo(String bankInfo) {
        this.BankInfo = bankInfo;
    }

    String getBankInfo() {
        return this.BankInfo;
    }

    void setPersonCount(Integer personCount) {
        this.ChildBankCount = personCount;
    }

    Integer getPersonCount() {
        return PersonCount;
    }

    void setChildBankCount(Integer childBankCount){
        this.ChildBankCount = childBankCount;
    }

    Integer getChildBankCount() {
        return ChildBankCount;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
