public class BingoCard {
    private int[][] grid;

    // Get 5x5 grid from BingoGame
    public BingoCard(int[][] initialGrid) {
        this.grid = new int[5][5];

        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                this.grid[r][c] = initialGrid[r][c];
            }
        }
    }

    // Print to console
    public void printCard() {
        System.out.println(" B   I   N   G   O");
        System.out.println("-------------------");

        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (r == 2 && c == 2) {
                    System.out.print("FR ");
                } else {
                    int num = grid[r][c];
                    // Add space for single digit numbers
                    if (num < 10) {
                        System.out.print(" " + num + " ");
                    } else {
                        System.out.print(num + " ");
                    }
                }

                if (c < 4) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
}
