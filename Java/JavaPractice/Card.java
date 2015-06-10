public class Card {
   public static final int numSuits = 4;
   public static final int numRanks = 13;

   // Rank runs 2 to 10, 11J, 12Q, 13K, 14A
   private int rank;
   // Suits are 1H, 2D, 3S, 4C   
   private int suit;
    
   public Card(int rank, int suit) {
      assert isValidRank(rank);
      assert isValidSuit(suit);
      this.rank = rank;
      this.suit = suit;
   }

   public int getRank() {
      return this.rank;
   }

   public void setRank(int rank) {
      assert isValidRank(rank);
      this.rank = rank;
   }

   public int getSuit() {
      return this.suit;
   }

   public void setSuit(int suit) {
      assert isValidSuit(suit);
      this.suit = suit;
   }

   public String toString() {
      return "Rank: " + this.rank + ", Suit: " + this.suit;
   }
   
   private boolean isValidRank(int rank) {
      return (rank > 0 && rank < numRanks);
   }

   private boolean isValidSuit(int suit) {
      return (suit > 0 && suit < numSuits);
   }
}