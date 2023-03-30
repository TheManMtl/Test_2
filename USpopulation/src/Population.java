/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Population {
    private String fileName;
    private ArrayList<Long> population;

    private ArrayList<Long> yearlyChange;// stores yearly change of population
    private File file;

    public Population(String fileName) {
        this.fileName = fileName;
        population = new ArrayList<>();
        yearlyChange = new ArrayList<>();
    }

    /*
    * reads the file to Arraylist
    * */
    public void readFile() throws FileNotFoundException, IndexOutOfBoundsException, NullPointerException {
        String path = ".\\data\\";
        file = new File(path + fileName);
        Scanner fileReader;
        fileReader = new Scanner(file);
        while (fileReader.hasNext()) {
            this.population.add(fileReader.nextLong());
        }
    }

    /*
    * adds every year change of population to arraylist
    * */
    public void getChanges() throws FileNotFoundException, IndexOutOfBoundsException, NullPointerException {
        readFile();
        long change;
        for (int i = 0; i < population.size() - 1; i++) {
            change = population.get(i + 1) - population.get(i);
            yearlyChange.add(change);
        }
    }
    /*
    * finds the lowest change
    * */
    public long getLowest() {
        long min = yearlyChange.get(0);
        for (int i = 1; i < yearlyChange.size(); i++) {
            if (min > yearlyChange.get(i)) {
                min = yearlyChange.get(i);
            }
        }
        return min;
    }
    /*
     * finds the average change
     * */
    public Double getAverage() {
        float total = 0;
        for (int i = 0; i < yearlyChange.size(); i++) {
            total += yearlyChange.get(i);
        }
        return (double) total / yearlyChange.size();
    }

    /*
     * finds the highest change
     * */
    public long getHighest() {
        long max = yearlyChange.get(0);
        for (int i = 1; i < yearlyChange.size(); i++) {
            if (max < yearlyChange.get(i)) {
                max = yearlyChange.get(i);
            }
        }
        return max;
    }
}
