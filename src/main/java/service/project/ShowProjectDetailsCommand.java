package service.project;

import service.Command;

public class ShowProjectDetailsCommand implements Command {
    @Override
    public void execute() {
        System.out.println("ShowProjectDetailsCommand");
    }

    @Override
    public String getClearName() {
        return "Show project details command";
    }

}
