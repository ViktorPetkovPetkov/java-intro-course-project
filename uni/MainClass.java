package uni;

public class MainClass {

    public static void main(String[] Args) {

        PlayField malkokote = new PlayField();
        malkokote.RandomizeField(malkokote.Field());
        malkokote.printField(malkokote.Field());

        Chance.BadGood();
        PartyHard.PH();
    }


}
