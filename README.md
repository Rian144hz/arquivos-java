# Processamento de Arquivos - Java

Repositório destinado ao estudo de manipulação de fluxos de leitura e escrita (I/O), criação de diretórios e tratamento de dados estruturados em arquivos CSV.

## Funcionalidades

- Leitura de arquivos utilizando BufferedReader para maior eficiência de memória.
- Escrita de dados formatados com BufferedWriter.
- Criação dinâmica de pastas no sistema operacional utilizando a classe File.
- Processamento de strings e conversão de tipos (Parsing).

## Lógica do Exercício Prático

O programa principal executa as seguintes operações:
1. Recebe o caminho de um arquivo .csv de entrada.
2. Lê cada linha do arquivo, separando os dados por vírgulas.
3. Valida se a linha contém dados válidos para evitar erros de índice (ArrayIndexOutOfBoundsException).
4. Calcula o valor total (Preço * Quantidade).
5. Cria uma subpasta chamada "out" no mesmo diretório do arquivo original.
6. Gera um arquivo "summary.csv" contendo apenas o nome do produto e o valor total calculado.

## Conceitos Técnicos Aplicados

- Try-with-resources: Garantia de fechamento de buffers de entrada e saída.
- Estruturas de repetição: Uso de loops while para percorrer arquivos de tamanho variável.
- Manipulação de caminhos: Uso de getParent() para gestão de diretórios no Linux.
- Localidade: Configuração de Locale para garantir a formatação correta de casas decimais.

---
Desenvolvido como parte dos estudos de Programação Orientada a Objetos.
