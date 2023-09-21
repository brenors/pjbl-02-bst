public class ArvoreBuscaBinaria {
    private No raiz;

    public ArvoreBuscaBinaria() {
        this.raiz = null;
    }

    public void insercao(int valor) {
        raiz = insercaoRecursiva(raiz, valor);
    }

    private No insercaoRecursiva(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.getValor()) {
            atual.setEsquerda(insercaoRecursiva(atual.getEsquerda(), valor));
        } else {
            atual.setDireita(insercaoRecursiva(atual.getDireita(), valor));
        }

        return atual;
    }

    public boolean busca(int valor) {
        return buscaRecursiva(raiz, valor);
    }

    private boolean buscaRecursiva(No atual, int valor) {
        if (atual == null) {
            System.out.println(false);
            return false;
        } else if (valor == atual.getValor()) {
            System.out.println(true);
            return true;
        }

        if (valor < atual.getValor()) {
            return buscaRecursiva(atual.getEsquerda(), valor);
        } else {
            return buscaRecursiva(atual.getDireita(), valor);
        }
    }

    public void remocao(int valor) {
        raiz = remocaoRecursiva(raiz, valor);
    }

    private No remocaoRecursiva(No atual, int valor) {
        if (atual == null) {
            return null;
        }

        if (valor == atual.getValor()) {
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                return null;
            }
            if (atual.getEsquerda() == null) {
                return atual.getDireita();
            }
            if (atual.getDireita() == null) {
                return atual.getEsquerda();
            }

            int menorValor = encontrarMenorValor(atual.getDireita());
            atual.setValor(menorValor);
            atual.setDireita(remocaoRecursiva(atual.getDireita(), menorValor));
            return atual;
        }

        if (valor < atual.getValor()) {
            atual.setEsquerda(remocaoRecursiva(atual.getEsquerda(), valor));
        } else {
            atual.setDireita(remocaoRecursiva(atual.getDireita(), valor));
        }

        return atual;
    }

    private int encontrarMenorValor(No no) {
        return no.getEsquerda() == null ? no.getValor() : encontrarMenorValor(no.getEsquerda());
    }

    public void impressao() {
        TreeFormatter formatter = new TreeFormatter();
        System.out.println(formatter.topDown(raiz));
    }
}
