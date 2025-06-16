# Encontrando o Maior Bloco de '1's em uma Tabela

Imagine que você tem uma tabela cheia de quadradinhos marcados com `'1'` (preenchido) ou `'0'` (vazio).  
(Essa tabela pode ser chamada de matriz, mas vamos tratá-la como "tabela" para facilitar a compreensão.)

Nosso objetivo é encontrar o **maior bloco retangular** que seja formado apenas por quadradinhos `'1'`.  
No final, precisamos saber **qual é a área** desse maior bloco.

---

### 💡 Exemplo:

| Linha | Tabela          | Alturas acumuladas por coluna |
|-------|------------------|-------------------------------|
| 1     | 1 0 1 0 0        | [1, 0, 1, 0, 0]               |
| 2     | 1 0 1 1 1        | [2, 0, 2, 1, 1]               |
| 3     | 1 1 1 1 1        | [3, 1, 3, 2, 2]               |
| 4     | 1 0 0 1 0        | [4, 0, 0, 3, 0]               |



Nesse exemplo, o maior bloco de `'1'` que conseguimos formar tem uma **área de 6**.

---

## Acumulando Blocos Por Coluna  
### Usando Um Contador de Altura Para Cada Linha da Tabela

Para encontrar a solução, lemos a tabela **linha por linha**, de cima para baixo.  
A cada linha, olhamos para cada coluna separadamente e **contamos quantos `'1'` seguidos** aparecem, de cima para baixo.

- Se encontramos um `'1'`, somamos 1 à contagem daquela coluna.
- Se encontramos um `'0'`, a contagem daquela coluna volta a zero (pois ele interrompe a sequência de `'1'`).

Isso nos dá a "**altura**" de `'1'` contínuos para cada coluna em cada linha.

| Linha | Tabela         | Alturas para cada coluna     |
|-------|----------------|------------------------------|
| 1     | 1 0 1 0 0      | [1, 0, 1, 0, 0]              |
| 2     | 1 0 1 1 1      | [2, 0, 2, 1, 1]              |
| 3     | 1 1 1 1 1      | [3, 1, 3, 2, 2]              |
| 4     | 1 0 0 1 0      | [4, 0, 0, 3, 0]              |

---

## Calculando a Maior Área em Cada Linha

Depois de definir as alturas para a linha atual, analisamos coluna por coluna.  
Cada coluna com altura maior que zero pode ser a **base de um retângulo**.

A partir da coluna atual, tentamos **estender o retângulo** para a esquerda e para a direita, incluindo apenas colunas com **altura igual ou maior** que a altura atual.

Com isso, calculamos a **área = altura × largura**, e guardamos a maior encontrada até o momento.

---

## Por Que Essa Abordagem Funciona?

Essa estratégia é eficaz porque **transforma um problema 2D complexo**  
(em busca do maior retângulo de `'1'`s) em **vários problemas 1D mais simples**,  
(analisar um histograma de alturas por linha).

Ao fazer isso para **cada linha** e guardar a maior área possível, garantimos que nenhuma solução seja perdida.

---

## ✅ Conclusão

Este algoritmo é uma forma **direta e eficaz** de resolver o problema:

- Ele simula a contagem de `'1'` em cada coluna, linha por linha;
- Usa essas contagens como "alturas" de prédios em um histograma;
- Calcula o maior retângulo possível a partir dessas alturas;
- E encontra a **maior área de `'1'`s** da tabela de forma clara e confiável.

---
