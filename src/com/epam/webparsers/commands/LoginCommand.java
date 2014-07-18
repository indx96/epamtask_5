package com.epam.webparsers.commands;

import com.epam.webparsers.logic.LoginLogic;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ivan on 7/16/14.
 */
public class LoginCommand implements Command {

    private final String LOGIN_NAME = "login";
    private final String PASSWORD_NAME = "password";

    @Override
    public String execute(HttpServletRequest request) {
        String login = request.getParameter(LOGIN_NAME);
        String password = request.getParameter(PASSWORD_NAME);
        if (LoginLogic.checkLoginAndPassword(login, password)) {
            request.setAttribute("username", login);
            return "/jsp/view/chooseparser.jsp";
        } else {
            String errorMessage = request.getServletContext().getInitParameter("loginerrormessage");
            request.setAttribute("errorMessage", errorMessage);
            return "/jsp/authentication/login.jsp";
        }
    }
}
