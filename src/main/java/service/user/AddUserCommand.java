package service.user;

import service.Command;

public class AddUserCommand implements Command {
    @Override
    public void execute() {
        System.out.println("User added");
    }

    @Override
    public String getClearName() {
        return "Add user";
    }
}
