public class ArvoreBuscaBinaria {
    private No raiz;

    public ArvoreBuscaBinaria() {
        this.raiz = null;
    }

    //chama o método recursivo de inserção, passando a raiz como nó atual e o valor que deseja inserir
    public void insercao(int valor) {
        raiz = insercaoRecursiva(raiz, valor);
    }
    
    //por se tratar de um método recursivo, não seria possível passar o nó raiz direto como parâmetro, pois no looping de verificação, o nó atual seria sempreo nó raiz
    private No insercaoRecursiva(No atual, int valor) {
        //caso a árvore ainda não tenha nenhum elemento, ele cria um novo nó, no qual será o nó raiz
        if (atual == null) {
            return new No(valor);
        }

        //faz a verificação da regra de inserção de um elemento na árvore, caso seja maior que o nó atual, insere a esquerda, se não a direita
        if (valor < atual.getValor()) {
            atual.setEsquerda(insercaoRecursiva(atual.getEsquerda(), valor));
        } else {
            atual.setDireita(insercaoRecursiva(atual.getDireita(), valor));
        }

        return atual;
    }

    //método de busca que utiliza a mesma lógica do método de inserção e remoção, sendo necessário passar o nó raiz como valor do nó atual, sendo o parâmetro do método recusrivo propriamente dito
    public boolean busca(int valor) {
        return buscaRecursiva(raiz, valor);
    }

    private boolean buscaRecursiva(No atual, int valor) {
        //essa seria a verificação final do método de busca, retornando true caso ache o elemento desejado ou false caso não encontre.
        if (atual == null) {
            System.out.println(false);
            return false;
        } else if (valor == atual.getValor()) {
            System.out.println(true);
            return true;
        }

        //verifica para qual lado da árvore a busca deve seguir, seguindo a regra de isnerção utilizada na construção da árvore 
        if (valor < atual.getValor()) {
            return buscaRecursiva(atual.getEsquerda(), valor);
        } else {
            return buscaRecursiva(atual.getDireita(), valor);
        }
    }

    //método de remoção recursiva utilizando a mesma lógica de passar o nó raiz como valor do nó atual, parâmetro do método remocaoRecursiva em si, utilizado nas ações de busca e inserção
    public void remocao(int valor) {
        raiz = remocaoRecursiva(raiz, valor);
    }

    private No remocaoRecursiva(No atual, int valor) {
        if (atual == null) {
            return null;
        }

        //caso o valor do nó atual seja igual ao valor de remoção do parâmetro, ocorre uma série de verificações necessárias:
        if (valor == atual.getValor()) {
            //retorna nulo, pois não existe um valor de substituição possível
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                return null;
            }
            //caso não tenha nenhum valor menor q o valor do nó atual, o nó de substituição é o da direita do nó atual
            if (atual.getEsquerda() == null) {
                return atual.getDireita();
            }
            //caso não tenha nenhum valor maior q o valor do nó atual, o nó de substituição é o da esquerda do nó atual
            if (atual.getDireita() == null) {
                return atual.getEsquerda();
            }
                
            //nessa etapa, o método chama outro método para buscar o menor sucessor possivel, seguindo o macete 'um passo para a direita e tudo para a esquerda' :)
            int menorValor = encontrarMenorValor(atual.getDireita());
            atual.setValor(menorValor);
            //nessa etapa ocorre a substituição do valor do nó pelo menor sucessor possível encontrado, removendo da árvore o valor que foi substituído
            atual.setDireita(remocaoRecursiva(atual.getDireita(), menorValor));
            return atual;
        }

        //faz a verificação da direção que a remoção deve serguir, seguindo a regra de remoção da árvore: segue em direção a esqeurda cado o valor seja menor que o valor do no atual, do contrário segue a direita
        if (valor < atual.getValor()) {
            atual.setEsquerda(remocaoRecursiva(atual.getEsquerda(), valor));
        } else {
            atual.setDireita(remocaoRecursiva(atual.getDireita(), valor));
        }

        return atual;
    }
    
    //essa é a parte do código que realiza 'pega tudo da esquerda' do macete de remoção
    private int encontrarMenorValor(No no) {
        //ternário que verifica se o nó atual não possíu mais nenhum nó a esquerda dele, retornando o valor do nó atual caso, caso contrário, ele chama o próprio método novamente para continuardo o ciclo de busca pelo menor sucessor possível
        return no.getEsquerda() == null ? no.getValor() : encontrarMenorValor(no.getEsquerda());
    }

    //método de impressão retirado da internet :)
    public void impressao() {
        TreeFormatter formatter = new TreeFormatter();
        System.out.println(formatter.topDown(raiz));
    }
}
