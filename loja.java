//Você foi contratado para desenvolver um sistema que auxilia na análise de preços de produtos em uma loja de
//calçados. Seu objetivo é criar um programa em Java que armazene os preços dos produtos da loja, sendo que a loja
//possui 10 produtos diferentes. Após armazenar os preços, o programa deve solicitar ao usuário um valor de desconto
//que deve ser aplicado ao valor de todos os produtos. Por fim, apresente os valores dos novos preços.

import java.util.Scanner;

public class loja{
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        //declaração
        double [] produtos = new double[10];
        for (int i=0; i<produtos.length; i++){
            System.out.printf(" Digite o preço dos produtos %d:", i+1);
            produtos [i]= entrada.nextDouble();
        }

        System.out.println("Aplique o valor do desconto:");
        double desconto = entrada.nextDouble();
        for ( int i=0; i<produtos.length; i++){
            double descontar = produtos[i] * (desconto /100);
            produtos[i] -= descontar;
            System.out.printf("Produto %d com desconto: R$ %.2f%n", i + 1, produtos[i]);

        }

        entrada.close();
    }
}