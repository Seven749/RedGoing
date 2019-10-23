package level2;

public enum Type {
    SPADES("S"),CLUBS("C"),HEARTS("H"),DIAMONDS("D");

    private String pokerType;
    public String getPokerType() {
        return pokerType;
    }
    private Type(String pokerType) {
        this.pokerType = pokerType;
    }
}
