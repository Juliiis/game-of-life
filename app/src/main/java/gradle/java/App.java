package gradle.java;

public class App {
    static Grid getGrid = new Grid();
    static PrintNextGeneration printNextGeneration = new PrintNextGeneration();
    public static void main(String[] args) {
        int M = 10, N = 10;

        // Displaying the grid
        System.out.println("Original Generation");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (getGrid.grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        printNextGeneration.printNextGeneration(getGrid.grid, M, N);
    }

}
