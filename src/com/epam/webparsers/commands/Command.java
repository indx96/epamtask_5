package com.epam.webparsers.commands;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ivan on 7/16/14.
 */
public interface Command {
    public String execute(HttpServletRequest request);
}
