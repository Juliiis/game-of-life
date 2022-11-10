package gradle.java;

public class OriginalGeneration {
  static PrintNextGeneration printNextGeneration = new PrintNextGeneration();
  static Grid getGrid = new Grid();
  static MagicalStrings magicalStrings = new MagicalStrings();

  static void printOriginalGeneration() {
    int M = 10, N = 10;
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (getGrid.grid[i][j] == 0)
          System.out.print(magicalStrings.DOT);
        else
          System.out.print(magicalStrings.STAR);
      }
      System.out.println();
    }
    System.out.println();
    printNextGeneration.printNextGeneration(getGrid.grid, M, N);
  }
}
