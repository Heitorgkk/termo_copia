package utilidade;

import java.util.Random;

public class Rnd {

    private static final Random rnd = new Random();

    public static int rnd_int(int range){
        return rnd.nextInt(range);
    }

}
