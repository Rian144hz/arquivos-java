package arquivos;

import java.io.File;
import java.util.Scanner;

public class CaminhoArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o camninho dos arquivos: ");

        String strfile = sc.nextLine();

        File path = new File(strfile);
        System.out.println("Apenas o nome do arquivo: "+path.getName());
        System.out.println("Apenas o caminho do arquivo: "+path.getParent());
        System.out.println("Apenas o caminho do arquivo todo: "+path.getPath());

        System.out.println("Apenas os nomes dos arquivos: "+path.getName());

        sc.close();
    }
}
