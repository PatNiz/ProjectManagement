package service.project;

import service.Command;

public class ListAllProjectsCommand implements Command {
    @Override
    public void execute() {
        System.out.println("List all projects");
    }

    @Override
    public String getClearName() {
        return "List all projects";
    }
}
