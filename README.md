# PJBL02 - Árvore Binária de Busca 
Trabalho da máteria de Estrutura de Dados, 4° perido do curso de Eng. de Software da PUCPR - , feito por Breno Rocha, Vittorio Caprioli. A implementação de uma árvore de busca binária, seguindo  os princípios de POO, isto é, 
que foi modulado pelas classes Main, ArvoreBuscaBinaria, No e TreeFormatter.

## Explicando as Classes

### No 
Essa classe é fundamental para criar a árvore, contém os atributos **valor** que armazena o número do no, **no esquerdo** e  **no direito** que aponta para esquerda e direita na árvore. 
Mantém uma referência ao valor de cada nó e aos nós filhos de cada nó, permitindo uma estrutura encadeada simples da classe de árvore.

### ArvoreBuscaBinaria
Essa é a classe da árvore bínaria de busca, é nela que contém os algoritmos de inserção, remoção, busca e impressão. E apenas têm o atributo privado **no raiz** que é o primeiro elemento da árvore.

#### Inserção
Temos dois métodos aqui, o primeiro **insersao(int valor)** que apenas chama o outro método privado **insercaoRecursiva** que realiza a inserção de forma recursiva, seguindo as própriedades da árvore binária 
Criando um novo nó quando necessário e ajustando os ponteiros esquerda ou direita, conforme apropriado.

#### Busca 
Para o algoritmo de busca, temos o método **busca(int valor)** busca uma valor na árvore e retorna verdadeiro se o valor for encontrado, senão retorna falso. Ele chama o método privado **buscaRercusiva**
que realiza a busca de forma recursiva, comparando o valor atual com o valor desejado e navegando para esquerda ou direita

#### Remoção
O método **remocao(int valor)** remove um valor da árvore. Ele chama o métado privado **remocaoRecursiva** para realizar a remoção de forma recursiva, considerando os casos de remoção de nós com nenhum, um ou dois filhos. Além de ter o método privado **encontrarMenorValor** que auxilia encontrar o menor valor da sub-árvore a partir de um nó dado. 

#### Impressão
Método de impressão da árvore em um formato fisial usando a classe TreeFormatter 

### TreeFormatter 
Código copido do stack overflow, indicado pelo monitor da máteria. Que foi adaptado para a classe de ArvoreBuscaBinaria, assim a árvore ao ser impressa fica com sua formatação correta. 

## Como usar 
1. Na classe **Main**, crie uma instância da classe **ArvoreBuscaBinaria**:

   ![image](https://github.com/brenors/pjbl-02-bst/assets/107329789/59b53b40-4a11-4a46-bc21-26917dd2db1a)

2. Insira elementos na árvore usando o método **insercao**:

   ![image](https://github.com/brenors/pjbl-02-bst/assets/107329789/28f561aa-8d3f-4ffc-8e54-67270a240ea3)

3. Chame o método de **impressao** para visualizar a árvore:

  ![image](https://github.com/brenors/pjbl-02-bst/assets/107329789/c7ed50cf-b3ab-4dbc-a36d-fc23206c5a7c)

  ![image](https://github.com/brenors/pjbl-02-bst/assets/107329789/209fc132-c626-4906-af06-24e244d7463a)

4. Remova elementos da árvore usando o método **remocao**:

   ![image](https://github.com/brenors/pjbl-02-bst/assets/107329789/1fe57cc0-5b85-4a73-8a90-329664b22d3f)

   ![image](https://github.com/brenors/pjbl-02-bst/assets/107329789/500d2456-5d93-4074-a590-a6f65a54c8ee)

5. Busque elementos na árvore usando o método **busca**:

   ![image](https://github.com/brenors/pjbl-02-bst/assets/107329789/28864d89-1a02-4afb-8e75-d5ebc80286a9)

   ![image](https://github.com/brenors/pjbl-02-bst/assets/107329789/4664fc17-7b31-468f-a78d-3989691ed4ed)

