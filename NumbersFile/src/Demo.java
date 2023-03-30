/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.io.FileNotFoundException;

public class Demo {

    public static void main(String[] args) {
        String fileName = "Numbers.txt";
        NumberAnalysis na = new NumberAnalysis(fileName);
        try {
            na.readNumbersFromFile();
            System.out.printf("The lowest is: %.2f\n", na.getLowest());
            System.out.printf("The Highest is: %.2f\n", na.getHighest());
            System.out.printf("The Total is: %.2f\n", na.getSumAll());
            System.out.printf("The Average is: %.2f\n", na.getAverage());
        } catch (FileNotFoundException fnfe) {
            System.out.println("Provided file not exists!");
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Array error!!");
        } catch (NullPointerException npe) {
            System.out.println("empty!");
        }
    }
}
