package utilidade;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Read {

    private static final Scanner sc = new Scanner(System.in);

    public static int leia_int() {

        int entrada = sc.nextInt();
        sc.nextLine();

        return entrada;
    }

    public static ArrayList<String> leia_arquivo(File arquivo){

        ArrayList<String> conteudo = new ArrayList<>();

        try(Scanner sc = new Scanner(arquivo)){

            while(sc.hasNextLine()){

                String word = sc.nextLine();
                conteudo.add(word);

            }

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        return conteudo;
    }
}