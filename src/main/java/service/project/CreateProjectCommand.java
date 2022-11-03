package service.project;

import service.Command;

public class CreateProjectCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Create project");
    }

    @Override
    public String getClearName() {
        return "Create project";
    }
}
