package service;

import app.ManagmentControl;

public class BackCommand implements Command {
    ManagmentControl managment = new ManagmentControl();

    @Override
    public void execute() {
        managment.controlLoop();
    }

    @Override
    public String getClearName() {
        return "Back";
    }
}
