package domain;

public class ListaInt {
    private class NO { // criação de classe NÓ
        int dado;
        NO prox;
    }

    private NO lista = null; // instancia a lista com valor nulo (substitui o init())

    public void insere(int elem) {
        NO novo = new NO(); // cria um novo Nó
        novo.dado = elem; // esse nó recebe o dado passado como arg

        if (lista == null) { // se a lista estiver vazia
            lista = novo; // lista passa a apontar pro nó recém criado
            novo.prox = null; // indica que ainda não há próximo
        } else if (novo.dado < lista.dado) {
            novo.prox = lista;
            lista = novo;
        } else {
            NO aux = lista; // var temporaria
            boolean achou = false; //

            while (aux.prox != null && !achou) { // estrutura de ordenação do Nó
                if (aux.prox.dado < novo.dado)
                    aux = aux.prox;
                else
                    achou = true;
            }

            novo.prox = aux.prox;
            aux.prox = novo;
        }
    }

        public void remove(int elem) {
            if (lista == null) {
                System.out.println("A lista está vazia");
                return;
            } else {
                if (elem == lista.dado) {
                    lista = lista.prox;
                } else {
                    NO aux = lista;
                    boolean achou = false;

                    while (aux.prox != null && !achou) {
                        if (aux.prox.dado == elem)
                            achou = true;
                        else
                            aux = aux.prox;
                    }
                    if (achou)
                        aux.prox = aux.prox.prox;
                    else
                        System.out.println("Valor não encontrado!");
                }
        }
    }

    public void print() {
        NO aux = lista;

        System.out.println("\n============== Listagem dos nós (ordem crescente) ==============");
        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.prox;
        }
        System.out.println("\n================================================================");
    }
}
