package com.amazon.account;

import com.amazon.user.UserMgmt;

public class AccountMgmt {

    public static void main(String[] args) {

        UserMgmt user = new UserMgmt();

        user.getUserInfo("retail");
    }
}