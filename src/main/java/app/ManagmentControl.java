package app;

import exception.NoSuchOptionException;
import io.files.ConsolePrinter;
import io.files.DataReader;
import service.BackCommand;
import service.Command;
import service.document.*;
import service.project.*;
import service.user.AddUserCommand;
import service.user.GiveUserRoleCommand;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ManagmentControl {
    private ConsolePrinter printer = new ConsolePrinter();
    private DataReader dataReader = new DataReader(printer);

    public List<Command> listOfProjectCommands(){
        List<Command> projectCommands = new ArrayList();
        projectCommands.add(new CreateProjectCommand());
        projectCommands.add(new DeleteProjectCommand());
        projectCommands.add(new ListAllProjectsCommand());
        projectCommands.add(new ListProjectsCommand());
        projectCommands.add(new ShowProjectDetailsCommand());
        projectCommands.add(new BackCommand());
        return projectCommands;
    }
    public List<Command> listOfUserCommands() {
        List<Command> userCommands = new ArrayList();
        userCommands.add(new AddUserCommand());
        userCommands.add(new GiveUserRoleCommand());
        userCommands.add(new BackCommand());
        return userCommands;
    }
    public List<Command> listOfDocumentCommands() {
        List<Command> docCommands = new ArrayList();
        docCommands.add(new CreateDocumentCommand());
        docCommands.add(new DeleteDocumentCommand());
        docCommands.add(new EditDocumentCommand());
        docCommands.add(new ListDocumentsCommand());
        docCommands.add(new ShowDocumentDetailsCommand());
        docCommands.add(new BackCommand());
        return docCommands;
    }
    public void getOptions(List<Command> commands) {
        printListofOptions(commands);
        chooseOption(commands);
    }
    public void printListofOptions(List<Command> commands){
        for (Command command : commands) {
            System.out.println(commands.indexOf(command) + " - " + command.getClearName());
        }
    }
    private void chooseOption(List<Command> commands) {
        try {
            int choice = new Scanner(System.in).nextInt();
            Command command = commands.get(choice);
            command.execute();
        }
        catch(IndexOutOfBoundsException  e1){
            System.out.println("THERE IS NO SUCH OPTION,PLEASE RE-ENTER: ");
            getOptions(commands);
        }
        catch(InputMismatchException e1){
            System.out.println("ONLY NUMBERS, PLEASE RE-ENTER: ");
            getOptions(commands);
        }
    }

    public void controlLoop() {
        Option option;
        do {
            printOptions();
            option = getOption();
            switch (option) {
                case EXIT -> exit();
                case USER -> getOptions(listOfUserCommands());
                case PROJECT -> getOptions(listOfProjectCommands());
                case DOCUMENT -> getOptions(listOfDocumentCommands());
                default -> printer.printLine("THERE IS NO SUCH OPTION,PLEASE RE-ENTER: ");
            }
        } while (option != Option.EXIT);

    }

    private void printOptions() {
        printer.printLine("CHOOSE OPTION: ");
        for (Option option : Option.values()) {
            printer.printLine(option.toString());
        }
    }
    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage() + ", RE-ENTER:");
            } catch (InputMismatchException ignored) {
                printer.printLine("ENTERED VALUE IS NOT A NUMBER, RE-ENTER: ");
            }
        }

        return option;
    }
    private enum Option {
        EXIT(0, "Exit"),
        USER(1, "User panel"),
        PROJECT(2, "project panel"),

        DOCUMENT(3, "Document panel ");

        private int value;
        private String description;

        Option(int value, String desc) {
            this.value = value;
            this.description = desc;
        }
        @Override
        public String toString() {
            return value + " - " + description;
        }

        static Option createFromInt(int option) throws NoSuchOptionException {
            try {
                return Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchOptionException("No such option with this id" + option);
            }
        }
    }

    private void exit() {
        printer.printLine("Bye!");
        System.exit(0);
    }



}
