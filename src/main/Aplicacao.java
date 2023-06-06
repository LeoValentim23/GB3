package main;

import doaçao.DEmpresa;
import doaçao.DPessoa;

import java.util.Scanner;

public class Aplicacao {
    public  void realizarDoacao(Scanner scanner) {
        System.out.println("Selecione o tipo de doação:");
        System.out.println("1. Pessoa");
        System.out.println("2. Empresa");

        int tipoDoacao = scanner.nextInt();
        scanner.nextLine();

        if (tipoDoacao == 1) {
            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite a quantidade que deseja doar:");
            double quantidade = scanner.nextDouble();
            scanner.nextLine();

            DPessoa doacaoPessoa = new DPessoa(nome, quantidade);

            System.out.println("Muito obrigado pela doação, " + doacaoPessoa.getNome() + "!");
            System.out.println("Quantidade doada: " + doacaoPessoa.getQuantidade());
        } else if (tipoDoacao == 2) {
            System.out.println("Digite o nome da empresa:");
            String nomeEmpresa = scanner.nextLine();

            System.out.println("Digite a quantidade que a empresa deseja doar:");
            double quantidade = scanner.nextDouble();
            scanner.nextLine();

            DEmpresa doacaoEmpresa = new DEmpresa(nomeEmpresa, quantidade);

            System.out.println("Muito obrigado pela doação da empresa " + doacaoEmpresa.getNomeEmpresa() + "!");
            System.out.println("Quantidade doada: " + doacaoEmpresa.getQuantidade());
        } else {
            System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
        }
    }
}
