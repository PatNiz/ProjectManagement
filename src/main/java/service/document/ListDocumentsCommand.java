package service.document;

import service.Command;

public class ListDocumentsCommand implements Command {
    @Override
    public void execute() {
        System.out.println("List Documents");
    }

    @Override
    public String getClearName() {
        return "List of documents";
    }
}
