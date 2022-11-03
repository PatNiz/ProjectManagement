package app;



public class ProjectManagement {
    private static final String APP_NAME = "Project management 1.0";

    public static void main(String[] args) {

        System.out.println(APP_NAME);
        ManagmentControl managment = new ManagmentControl();
        managment.controlLoop();

    }
}
