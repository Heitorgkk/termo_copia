package palavra;

import java.util.ArrayList;
import utilidade.Read;
import java.io.File;
import utilidade.Rnd;

public class Palavra{

    File wordlist = new File("C:\\Users\\heitor_klimkowski\\IdeaProjects\\termo_copia\\termo\\src\\wordlist.txt");

    private ArrayList<String> palavras = Read.leia_arquivo(wordlist);

    public ArrayList<String> get_palavras(){
        return palavras;
    }

    public String palavra;

    //cria uma palavra com valor inicial
    public Palavra (){
        this.palavra = palavras.get(Rnd.rnd_int(palavras.size()));
    }

}