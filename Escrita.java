package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {
    public static void main(String[] args) {

        String[] linhas = new String[]{"Oi","Boa noite","será que","Vou comer","Essa xota","Hoje ?"};
        String path = "/home/matheus-souza/Área de trabalho/out.txt";
        try(BufferedWriter brw = new BufferedWriter(new FileWriter(path))){
            for(String l: linhas){
                brw.write(l);
                brw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
