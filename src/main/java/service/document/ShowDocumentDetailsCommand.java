package service.document;

import service.Command;

public class ShowDocumentDetailsCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Document Details");
    }

    @Override
    public String getClearName() {
        return "Show document details";
    }
}
