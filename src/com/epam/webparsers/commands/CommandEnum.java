package com.epam.webparsers.commands;

/**
 * Created by ivan on 7/16/14.
 */
public enum CommandEnum {
    LOGIN(new LoginCommand()),
    PARSING(new ParsingCommand());

    private Command command;

    private CommandEnum(Command command) {
        this.command = command;
    }

    public Command getCommand(){
        return command;
    }
}
