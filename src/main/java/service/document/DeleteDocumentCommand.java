package service.document;

import service.Command;

public class DeleteDocumentCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Delete Document");
    }

    @Override
    public String getClearName() {
        return "Delete document";
    }
}
