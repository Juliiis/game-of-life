package gradle.java;

import static gradle.java.OriginalGeneration.printOriginalGeneration;

public class App {
    static Grid getGrid = new Grid();
    public static void main(String[] args) {
        System.out.println("Original Generation");
        printOriginalGeneration();
    }

}
