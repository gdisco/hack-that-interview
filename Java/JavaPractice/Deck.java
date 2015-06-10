public class Deck {
   private Card[] cards;
   private final int numCards;

   public Deck() {
      numCards = Card.numSuits * Card.numRanks;
      this.cards = new Card[numCards];
      int cardsIndex = 0;
      for (int suit = 0; suit < Card.numSuits; suit++) {
      	 for (int rank = 0; rank < Card.numRanks; rank++) {
	    cards[cardsIndex++] = new Card(rank, suit);     
         }
      }         
   }

   public String toString() {
      String deckString = "";
      for (int i = 0; i < this.numCards; i++) {
          deckString += "\n";
	  deckString += this.cards[i];
      }
      return deckString;
   }
   
}