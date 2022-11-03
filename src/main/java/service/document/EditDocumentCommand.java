package service.document;

import service.Command;

public class EditDocumentCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Edit Document");
    }

    @Override
    public String getClearName() {
        return "Edit document";
    }
}
