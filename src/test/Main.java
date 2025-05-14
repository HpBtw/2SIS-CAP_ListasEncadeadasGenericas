package test;

import domain.ListaInt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ListaInt lista = new ListaInt();

        System.out.print("\nInforme um valor positivo para inserir ou um valor negativo para encerrar: ");
        int valor = kb.nextInt();

        while (valor >= 0) {
            lista.insere(valor);
            lista.print();
            System.out.print("\nInforme um valor positivo para inserir ou um valor negativo para encerrar: ");
            valor = kb.nextInt();
        }

        System.out.println("Programa finalizado!");
        lista.print();
    }
}