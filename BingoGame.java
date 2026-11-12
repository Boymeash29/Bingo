public class BingoGame {
    private BingoCard card;

    public BingoGame() {
        // Basic 5x5 grid with standard BINGO column ranges (0 is the FREE space)
        int[][] boardNumbers = {
            { 4, 18, 33, 49, 62 },
            { 12, 24, 41, 53, 70 },
            { 7, 16,  0, 58, 65 },
            { 15, 29, 36, 47, 74 },
            { 2, 21, 44, 60, 68 }
        };

        // Pass the data into BingoCard
        this.card = new BingoCard(boardNumbers);
    }

    public void start() {
        card.printCard();
    }
}
