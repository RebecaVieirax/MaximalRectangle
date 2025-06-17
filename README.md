# 📐 Maior Retângulo Binário

Este projeto foi desenvolvido como parte de um desafio técnico do processo seletivo para a **Atech**, empresa do grupo Embraer. O objetivo é implementar uma solução eficiente, em Java, para identificar a maior área retangular composta apenas por `'1'`s em uma matriz binária.

---

## 🎯 Objetivo do Desafio Técnico

Implementar um algoritmo que, dada uma matriz binária (`char[][]`), identifique a maior área possível formada apenas por `'1'`s consecutivos, considerando regiões retangulares.

---

## 💡 Descrição da Solução

A cada linha da matriz, o algoritmo constrói um histograma com base na altura de `'1'`s consecutivos em cada coluna. Com esse histograma, calcula-se a maior área retangular possível para aquela linha. Esse processo se repete para todas as linhas. A complexidade do algoritmo é $\mathcal{O}(N^2)$ por linha, oferecendo uma boa performance para matrizes moderadamente grandes.

---

## 🛠 Tecnologias Utilizadas

- Java 17 (ou compatível)
- Nenhuma biblioteca externa

---

## ▶️ Como Executar

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/seu-usuario/maior-retangulo-binario.git](https://github.com/RebecaVieirax/MaximalRectangle.git)
    ```

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






---

