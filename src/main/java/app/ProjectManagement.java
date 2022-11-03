package app;

import service.user.AddUserCommand;
import service.Command;
import service.user.GiveUserRoleCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProjectManagement {
    private static final String APP_NAME = "Project management 1.0";

    public static void main(String[] args) {

        System.out.println(APP_NAME);
        ManagmentControl managment = new ManagmentControl();
        managment.controlLoop();

    }
}
