package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        System.out.println(BuscaBinario(vetor,66));
    }
    /*
    a busca binaria vai sempre te rum ponto inicial, um meio e um fim. exemplo vetor x = [0,1,2,3,4,5,6,7,8,9,10]
    el sempre vai dividir esse vetor pelo inicio e pelo tamanho, no caso esse é 10. pegara a posicao meio q noi caso inicial é 5
    e vai comparar com o valor enviado. se eu enviei 3 então ele vai comporar com o valor da posição meio e se caso o mesmo seja
    menor o fim sera deduzido uma casa caso contrario oinicio adiciona uma. até encontar o valor e retornar o mesmo
     */
    public static int BuscaBinario(int[] x, int value){
        Arrays.sort(x); // ordena o vetor caso não esteja em ordem.
        int inicio = 0;
        int fim = x.length -1;
        int meio;
        while (inicio <= fim){
            meio = (inicio + fim)/2;
            if(x[meio] == value){
                return meio;
            } else if (x[meio] < value) {
                inicio = meio + 1;
            } else if (x[meio] > value) {
                fim = meio -1;
            }
        }
        return -1;
    }
}