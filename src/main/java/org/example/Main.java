package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        double deposito;
        double saque;
        double saldo = 0.0;
        int escolha = 0;
        while(escolha != 4){
            System.out.println("==== Seja bem-vindo ao Simulador de caixa eletrônico ====");
            System.out.println("Opções disponíveis: ");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar um depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção escolhida: ");
            escolha = entrada.nextInt();
            System.out.println("");

            if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4){
                System.out.println("Opção inválida!");
                System.out.println("");
            }

            if (escolha == 1){
                System.out.println("O seu saldo disponível é de: R$"+ saldo);
                System.out.println("");
            } else if (escolha == 2){
                System.out.println("Digite o valor a ser depositado: ");
                deposito = entrada.nextDouble();
                if (deposito > 0){
                    saldo += deposito;
                    System.out.println("Valor depositado com sucesso!");
                    System.out.println("");
                }else{
                    System.out.println("Valor inválido!");
                    System.out.println("");
                }
            }else if (escolha == 3){
                System.out.println("Digite o valor que deseja sacar: ");
                saque = entrada.nextDouble();
                if (saque > saldo){
                    System.out.println("Valor inválido!");
                    System.out.println("");
                }else{
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("");
                }
            }else if(escolha == 4){
                System.out.println("Saindo do sistema...");
            }else{
                System.out.println("Opção inválida!");
                System.out.println("");
            }
        }
    }
}
