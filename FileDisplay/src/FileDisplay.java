/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDisplay {
    private String fileName;
    private File file;

    ArrayList<Long> fileContent;

    //constructor with file name and init Arraylist
    public FileDisplay(String fileName) {
        this.fileName = fileName;
        fileContent = new ArrayList<>();
    }

    /*
     * display first 5 lines in the file
     * if less than 5 show all
     * */
    public void displayHead() throws IndexOutOfBoundsException, NullPointerException{
        // checking if the file has less than 5 lines
        int lines = fileContent.size() < 6 ? fileContent.size() : 5;
        for (int i = 0; i < lines; i++) {
            System.out.printf("%d\n", fileContent.get(i));
        }
    }
    /*
     * display All lines in the file
     * */
    public void displayContents()throws IndexOutOfBoundsException, NullPointerException {
        for (Long line : fileContent) {
            System.out.printf("%d\n", line);
        }
    }
    /*
     * display All lines in the file
     * with numbers followed by coma
     * */
    public void displayWithLineNumbers()throws IndexOutOfBoundsException, NullPointerException {
        for (int i = 0; i < fileContent.size(); i++) {
            System.out.printf("%d. %d,\n", (i + 1), fileContent.get(i));
        }
    }

    /*
    * reading the file
    * */
    public void readFile() throws FileNotFoundException, IndexOutOfBoundsException, NullPointerException {
        String path = ".\\data\\";
        file = new File(path + fileName);
        Scanner fileReader;

        fileReader = new Scanner(file);
        while (fileReader.hasNext()) {
            this.fileContent.add(fileReader.nextLong());
        }
    }
}
