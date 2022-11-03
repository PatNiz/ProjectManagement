package service.user;

import service.Command;

public class GiveUserRoleCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Give User Role");
    }

    @Override
    public String getClearName() {
        return "Give user role";
    }

}
