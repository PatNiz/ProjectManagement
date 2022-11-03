package service.document;

import service.Command;

public class CreateDocumentCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Create document");
    }

    @Override
    public String getClearName() {
        return "Create document";
    }

}
