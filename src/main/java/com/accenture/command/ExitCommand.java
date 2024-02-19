package com.accenture.command;

public class ExitCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Exiting programm ...");
        System.exit(0);
    }

    @Override
    public boolean shouldRun(String command) {
        return "exit".equals(command);
    }
}
