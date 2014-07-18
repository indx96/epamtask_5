package com.epam.webparsers.commands;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ivan on 7/16/14.
 */
public class CommandFactory {

    public static Command defineCommand(HttpServletRequest request){
        String commandName = request.getParameter("command");
        Command command = CommandEnum.valueOf(commandName.toUpperCase()).getCommand();
        return command;
    }
}
