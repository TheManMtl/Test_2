/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.io.FileNotFoundException;

public class Demo {

    public static void main(String[] args) {
        String fileName = "USPopulation.txt";
        FileDisplay fd = new FileDisplay(fileName);
        try{
            fd.readFile();
            System.out.println("First 5 line in File: ");
            fd.displayHead();
            System.out.println("Display all contents ");
            fd.displayContents();
            System.out.println("Display all contents with line numbers");
            fd.displayWithLineNumbers();
        }catch (FileNotFoundException fnfe) {
            System.out.println("Provided file not exists!");
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Array error!!");
        } catch (NullPointerException npe) {
            System.out.println("empty!");
        }


    }
}
