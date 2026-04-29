package arquivos;

import java.io.*;
import java.util.Scanner;

public class ExercicioPratico { // classe do exercicio
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para entrada de dados
        System.out.print("Digite o caminho do arquivo: "); // aqui peço o dado
        String strArquivoPai = sc.nextLine(); // leio o dado

        File caminho = new File(strArquivoPai); // crio um objeto File passando como parâmetro o que o usuário digitou
        System.out.println("caminho do arquivo: " + caminho.getPath()); // pego o caminho do arquivo com caminho.getParent()

        boolean sucesso = new File(caminho.getParent() + "/out").mkdir(); // crio um variável sucesso, somente para ver se funcionou a criação do /out
        try (BufferedReader br = new BufferedReader(new FileReader(strArquivoPai));// aqui fica o try-with-resoruce passando como parâmetro strArquivoPai
             BufferedWriter bw = new BufferedWriter(new FileWriter(caminho.getParent() + "/out/summary.csv"))) {  // aqui digo onde a saída vai ficar

            String linha = br.readLine(); // leio a linha aqui.
            System.out.println("Pasta out criada com sucesso: "+sucesso); // aviso que a pasta foi criada, só para ver o log mesmo
            while (linha != null) { // vejo se ela é null
                if (linha.contains(",")){ // aqui eu vejo se linha, contem "," para evitar o erro de tamanho de ArrayIndexOutOfBoundsException
                    String[] colunas = linha.split(","); // se for nula, crio um vetor de colunas passando o linha.split(",") como divisor
                    // aqui separo por posições no vetor e por nome, preco, e quantidade
                    String nome = colunas[0]; //posição [0] que é a primeira nome;
                    double preco = Double.parseDouble(colunas[1]); //posição [1] que é a segunda preço;
                    int quantidade = Integer.parseInt(colunas[2]);//posição [2] que é a terceira quantidade;

                    double total = preco * quantidade; // calculo para calcular o total.

                    System.out.println(nome + " Total: " + total); // aqui eu printo o total


                    bw.write(nome + "," + String.format("%.2f", total)); // "escrevo formatado
                    bw.newLine();//aqui pulo a linha, pois bw.write não pula sozinho



                }
                linha = br.readLine(); // percorro até a última linha da coluna caso aja algo lá

            }
        } catch (IOException e) { //trato, caso aja alguma excessão
            System.out.println("Erro: " + e.getMessage()); // pego o erro aqui,com o e.getMessage()
        }



        }
    }

