package level2;

public enum SpecialPoker {
    redJoker("RED"),blackJoker("BLACK"),emptyCard("WHITE");
    private String specialPoker;
    private SpecialPoker(String specialPoker) {
        this.specialPoker = specialPoker;
    }
    public String getSpecialPoker() {
        return specialPoker;
    }
}
