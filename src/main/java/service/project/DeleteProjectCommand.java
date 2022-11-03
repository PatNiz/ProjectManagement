package service.project;

import service.Command;

public class DeleteProjectCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Delete project");
    }

    @Override
    public String getClearName() {
        return "Delete project";
    }
}
