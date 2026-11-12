public class BingoGame {
    private BingoCard card;

    public BingoGame() {
        int[][] nums = new int[5][5]; // Grid of 5x5

        for (int col = 0; col < 5; col++) {
            int min = col * 15 + 1; // Generates the minimum for each col (1-15, 16-30, 31-45, 46-60, 61-75)

            for (int row = 0; row < 5; row++) {
                if (row == 2 && col == 2) { // Set the freespot to 0
                    nums[row][col] = 0;
                    continue;
                }

                int rand = (int) (Math.random() * 15) + min; // Gives random number for the col it is iterated in
                
                // make sure there are no duplicates in the column
                for (int prev = 0; prev < row; prev++) {
                    if (nums[prev][col] == rand) {
                        rand = (int) (Math.random() * 15) + min;
                        prev = -1; // restart the check
                    }
                }

                nums[row][col] = rand; // Set the pos to an int
            }
        }

        card = new BingoCard(nums); // Pass data to BingoCard
    }

    public void start() { // Method to run game
        card.printCard();
    }
}