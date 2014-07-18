package com.epam.webparsers.logic;

/**
 * Created by ivan on 7/16/14.
 */
public class LoginLogic {
    private static final String RIGHT_LOGIN = "admin";
    private static final String RIGHT_PASSWORD = "kfnmpa";

    public static boolean checkLoginAndPassword(String login, String password) {
        return RIGHT_LOGIN.equals(login) && RIGHT_PASSWORD.equals(password);
    }
}