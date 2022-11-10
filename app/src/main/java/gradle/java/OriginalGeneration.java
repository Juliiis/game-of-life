package gradle.java;

import static gradle.java.App.getGrid;

public class OriginalGeneration {
  static PrintNextGeneration printNextGeneration = new PrintNextGeneration();

  static void printOriginalGeneration() {
    int M = 10, N = 10;
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
