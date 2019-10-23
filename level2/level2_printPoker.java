package level2;

public class level2_printPoker {
    public static void main(String[] args) {
        Poker poker = new Poker();
        for (Info info : poker.infoList) {
            for (Type type : poker.typeList) {
                System.out.print(type);
                System.out.print(info + "\t");
            }
            System.out.println();
        }
        for (SpecialPoker specialPoker : poker.specialPokersList) {
            System.out.print(specialPoker + "\t");
        }
    }
}
