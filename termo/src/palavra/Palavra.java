package palavra;

import java.util.ArrayList;
import utilidade.Read;
import java.io.File;
import utilidade.Rnd;

public class Palavra{

    File wordlist = new File("wordlist.txt");

    public ArrayList<String> palavras = Read.leia_arquivo(wordlist);

    private String palavra;

    public Palavra (){
        this.palavra = palavras.get(Rnd.rnd_int(palavras.size()));
    }

}