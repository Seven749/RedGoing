package level2;

public enum Info {
    _2("POKER_2"),_3("POKER_3"),_4("POKER_4"),_5("POKER_5"),
        _6("POKER_6"),_7("POKER_7"),_8("POKE_8"), _9("POKER_9"),
        _X("POKER_10"),_J("POKER_J"),_Q("POKER_Q"),_K("POKER_K"),
        _A("POKER_A");
    private String pokerShow;
    private Info(String pokerShow) {
        this.pokerShow = pokerShow;
    }
    public String getPokerShow() {
        return pokerShow;
    }
}
