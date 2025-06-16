public class MaiorRetangulo {

    public static int maiorRetangulo(char[][] matriz) {
        // Trata casos de matriz nula ou vazia
        if (matriz == null || matriz.length == 0) {
            return 0;
        }

        int colunas = matriz[0].length;
        // 'alturas' armazena a altura de '1's contínuos para cada coluna,
        // como se fosse um histograma para a linha atual.
        int[] alturas = new int[colunas];
        int maiorArea = 0; // Armazena a maior área encontrada até agora

        // Itera sobre cada linha da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            // Atualiza o array 'alturas' com base nos '1's da linha atual
            for (int c = 0; c < colunas; c++) {
                if (matriz[linha][c] == '1') {
                    alturas[c]++; // Incrementa a altura se for '1'
                } else {
                    alturas[c] = 0; // Zera a altura se for '0' (interrompe a sequência)
                }
            }

            // Para cada linha, tratamos 'alturas' como um histograma e
            // encontramos o maior retângulo dentro dele.
            // Esta parte tem complexidade O(N^2) para cada linha.
            for (int i = 0; i < colunas; i++) {
                // Se a altura for 0, não há retângulo para formar a partir desta coluna
                if (alturas[i] == 0) {
                    continue;
                }

                int alturaAtual = alturas[i];
                int larguraAtual = 1;

                // Expande para a esquerda: encontra quantas colunas à esquerda
                // têm altura maior ou igual à 'alturaAtual'.
                for (int j = i - 1; j >= 0 && alturas[j] >= alturaAtual; j--) {
                    larguraAtual++;
                }

                // Expande para a direita: encontra quantas colunas à direita
                // têm altura maior ou igual à 'alturaAtual'.
                for (int j = i + 1; j < colunas && alturas[j] >= alturaAtual; j++) {
                    larguraAtual++;
                }

                // Calcula a área do retângulo formado e atualiza a maior área geral
                int areaAtual = alturaAtual * larguraAtual;
                if (areaAtual > maiorArea) {
                    maiorArea = areaAtual;
                }
            }
        }

        return maiorArea; // Retorna a maior área encontrada em toda a matriz
    }

    public static void main(String[] args) {
        char[][] matriz = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };

        int resultado = maiorRetangulo(matriz);
        System.out.println("Maior área: " + resultado); // Deve imprimir 6
    }
}
