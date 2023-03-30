/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberAnalysis {
    private String fileName;
    private float[] numbers;
    private File file;

    /*
     * constructs with a sile name
     * inits array
     * */
    public NumberAnalysis(String fileName) {
        this.fileName = fileName;
        //numbers = new float[12];
    }

    /*
     * finds the lowest number
     * */
    public float getLowest() {
        float min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    /*
     * finds the highest number
     * */
    public float getHighest() {
        float max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    /*
     * calculates the sum of all number
     * */
    public float getSumAll() {
        float total = 0;
        for (float number : numbers) {
            total += number;
        }
        return total;
    }

    /*
     * finds the average number
     * */
    public float getAverage() {
        return getSumAll() / numbers.length;
    }

    /*
     * reads the file
     * */
    public void readNumbersFromFile() throws FileNotFoundException, IndexOutOfBoundsException, NullPointerException {
        int arraySize = getLinesNumber();
        numbers = new float[arraySize]; // array created based on the number of lines
        String path = ".\\data\\";
        File numbersFile = new File(path + fileName);
        Scanner fileReader;
        int i = 0;
        fileReader = new Scanner(numbersFile);
        while (fileReader.hasNext()) {
            this.numbers[i] = fileReader.nextFloat();
            i++;
        }
    }

    /*
     * finding the line amount in file
     * */
    public int getLinesNumber() throws FileNotFoundException, IndexOutOfBoundsException, NullPointerException {
        String path = ".\\data\\";
        File numbersFile = new File(path + fileName);
        Scanner fileReader;
        int i = 0;
        fileReader = new Scanner(numbersFile);
        while (fileReader.hasNext()) {
            fileReader.nextFloat();
            i++;
        }
        return i;
    }
}
