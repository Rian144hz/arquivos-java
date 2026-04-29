package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {
        File file = new File("/home/matheus-souza/Área de trabalho/in.txt");
        Scanner sc = null;
       try {
          sc = new Scanner(file);
          while (sc.hasNextLine()){
              System.out.println(sc.nextLine());
          }
       }catch (IOException e){
           System.out.println("Erro: arquivo não encontrado.");
       }finally {
           if (sc!=null){
               sc.close();
           }

       }
    }
}
