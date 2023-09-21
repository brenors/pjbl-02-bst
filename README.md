# PJBL02 - Árvore Binária de Busca 
Trabalho da máteria de Estrutura de Dados, 4° perido do curso de Eng. de Software da PUCPR - , feito por Breno Rocha, Vittorio Caprioli. A implementação de uma árvore de busca binária, seguindo  os princípios de POO, isto é, 
que foi modulado pelas classes Main, ArvoreBuscaBinaria, No e TreeFormatter.
## Explicando as Classes
### No 
Essa classe é fundamental para criar a árvore, contém os atribusos **valor** que armazena o número do no, **no esquerdo** e  **no direito** que aponta para esquerda ou direita na árvore. 
Mantém uma referência ao valor de cada nó e aos nós filhos de cada nó, permitindo uma estrutura encadeada simples da classe de árvore.
### ArvoreBuscaBinaria
Essa é a classe da árvore bínaria de busca, é nela que contém os algoritmos de inserção, remoção e busca. E apenas têm o atributo privado **no raiz** que é o primeiro elemento da árvore. 
#### Inserção
Temos dois métodos aqui, o primeiro **insersao(int valor)** que apenas chama o outro método **insercaoRecursiva** que realiza a inserção de forma recursiva, seguindo as própriedades da árvore binária 
Criadno um novo nó quando necessário e ajustando os ponteiros esquerda ou direita, conforme apropriado.

