package io.files;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }
    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

}
