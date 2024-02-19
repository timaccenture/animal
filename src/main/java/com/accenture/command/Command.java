package com.accenture.command;

public interface Command {

    void execute();

    boolean shouldRun(String command);
}
