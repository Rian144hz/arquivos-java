package arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o camninho das pastas: ");
        String strpath = sc.nextLine();

        File path = new File(strpath);

        File[] pastas = path.listFiles(File::isDirectory);

        System.out.println("PASTAS: ");
        for(File pasta: pastas){
            System.out.println(pasta);
        }
        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS: ");
        for (File arquivo: arquivos){
            System.out.println(arquivo);
        }
        boolean sucesso = new File(strpath+"\\subdir").mkdir();
        System.out.println("Pasta criada com sucesso!"+sucesso);

        sc.close();
    }
}
