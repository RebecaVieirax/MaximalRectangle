public class MaiorRetangulo {

    public static int maiorRetangulo(char[][] matriz) {
        // Retorna 0 se a matriz for nula ou vazia.
        if (matriz == null || matriz.length == 0) {
            return 0;
        }

        int colunas = matriz[0].length;
        // 'alturas' guarda a altura de '1's contínuos para cada coluna.
        int[] alturas = new int[colunas];
        int maiorArea = 0; // Armazena a maior área encontrada.

        // passa por cada linha da matriz.
        for (int linha = 0; linha < matriz.length; linha++) {
            // Atualiza as alturas com base na linha atual.
            for (int c = 0; c < colunas; c++) {
                if (matriz[linha][c] == '1') {
                    alturas[c]++; // Incrementa se for '1'.
                } else {
                    alturas[c] = 0; // Zera se for '0'.
                }
            }

            // Para cada linha, calcula o maior retângulo usando as alturas como histograma.
            for (int i = 0; i < colunas; i++) {
                if (alturas[i] == 0) {
                    continue; // Pula se a altura for 0.
                }

                int alturaAtual = alturas[i];
                int larguraAtual = 1;

                // Expande para a esquerda.
                for (int j = i - 1; j >= 0 && alturas[j] >= alturaAtual; j--) {
                    larguraAtual++;
                }

                // Expande para a direita.
                for (int j = i + 1; j < colunas && alturas[j] >= alturaAtual; j++) {
                    larguraAtual++;
                }

                // Calcula e atualiza a maior área.
                int areaAtual = alturaAtual * larguraAtual;
                if (areaAtual > maiorArea) {
                    maiorArea = areaAtual;
                }
            }
        }

        return maiorArea; 

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
