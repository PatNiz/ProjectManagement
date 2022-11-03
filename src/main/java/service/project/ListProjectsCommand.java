package service.project;

import service.Command;

public class ListProjectsCommand implements Command {
    @Override
    public void execute() {
        System.out.println("List Projects");
    }

    @Override
    public String getClearName() {
        return "List projects";
    }
}
