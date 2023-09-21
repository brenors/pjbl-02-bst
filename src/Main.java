public class Main {
    public static void main(String[] args) {
        ArvoreBuscaBinaria arvore = new ArvoreBuscaBinaria();
        arvore.insercao(24);
        arvore.insercao(31);
        arvore.insercao(17);
        arvore.insercao(24);
        arvore.insercao(35);
        arvore.insercao(8);
        arvore.insercao(44);
        arvore.insercao(45);
        arvore.insercao(41);
        arvore.insercao(13);
        arvore.insercao(19);
        arvore.impressao();

        arvore.insercao(24);
        arvore.impressao();

        arvore.remocao(24);
        arvore.impressao();
    }
}