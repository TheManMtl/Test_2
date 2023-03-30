/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) {
        String fileName = "USPopulation.txt";
        Population pop = new Population(fileName);

        try{
            pop.getChanges();
            System.out.printf("The Average is: %.2f\n",pop.getAverage());
            System.out.printf("The lowest is: %d\n",pop.getLowest());
            System.out.printf("The Highest is: %d\n",pop.getHighest());
        }catch (FileNotFoundException fnfe) {
            System.out.println("Provided file not exists!");
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Array error!!");
        } catch (NullPointerException npe) {
            System.out.println("Numbers are empty!");
        }



    }
}
