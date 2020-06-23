package uni;

import java.util.Random;

public class PlayField {

    String[] array = new String[]{"|S |", "|T |", "|T |", "|T |", "|T |", "|T |", "|T |", "|T |", "|P |", "|P |", "|P |", "|I |", "|I |", "|I |", "|ST|", "|ST|", "|ST|", "|C |", "|C |", "|C |",};

    public String[] Field() {

        return array;

    }

    public void RandomizeField(String[] array) {

        Random rand = new Random();

        for (int i = 1; i < 20; i++) {
            int rndIndex = rand.nextInt(19) + 1;
            String smth = array[rndIndex];
            array[rndIndex] = array[i];
            array[i] = smth;
        }
    }
            public void printField(String[] array){
                System.out.println(array[10] + array[11] + array[12] + array[13] + array[14] + array[15] + array[16] + array[17]);
                System.out.println(array[9] + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + array[18]);
                System.out.println(array[8] + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + array[19]);
                System.out.println(array[7] + array[6] + array[5] + array[4] + array[3] + array[2] + array[1] + array[0]);
        }
}



