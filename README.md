# 📐 Maior Retângulo Binário

Este projeto foi desenvolvido como parte de um desafio técnico do processo seletivo para a **Atech**, empresa do grupo Embraer. O objetivo é implementar uma solução eficiente, em Java, para identificar a maior área retangular composta apenas por `'1'`s em uma matriz binária.

---

## 🎯 Objetivo do Desafio Técnico

Implementar um algoritmo que, dada uma matriz binária (`char[][]`), identifique a maior área possível formada apenas por `'1'`s consecutivos, considerando regiões retangulares.

---

## 💡 Descrição da Solução

Para cada linha da matriz, o algoritmo analisa a altura das sequências de '1's em cada coluna para descobrir a maior área retangular possível naquela linha. Esse processo se repete para todas as linhas. O tempo para processar cada linha aumenta rapidamente com o tamanho dela, mas o desempenho geral é bom para matrizes de tamanho moderado.

---

## 🛠 Tecnologias Utilizadas

- Java 17 (ou compatível)
- Nenhuma biblioteca externa

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/RebecaVieirax/MaximalRectangle.git

2.  Compile e execute:
    ```bash
    javac MaiorRetangulo.java
    java MaiorRetangulo
    ```

3.  Saída esperada:
    ```
    Maior área: 6
    ```

## 📥 Entrada

A matriz é definida diretamente no método `main`, no formato `char[][]`, utilizando `'0'`s e `'1'`s.


## 📤 Saída

A aplicação imprime no terminal o valor inteiro correspondente à maior área retangular composta apenas por '1's consecutivos.

✏️ Exemplo

Entrada:

```java
char[][] matriz = {
    {'1','0','1','0','0'},
    {'1','0','1','1','1'},
    {'1','1','1','1','1'},
    {'1','0','0','1','0'}
};
Saída:

Maior área: 6
```





---

