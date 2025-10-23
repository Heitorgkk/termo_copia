package utilidade;

public class Wait {
    public static void espera(int millis) {

        try{
            Thread.sleep(millis);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
