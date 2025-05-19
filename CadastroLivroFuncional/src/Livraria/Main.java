package Livraria;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variavel de controle do meu menu

        int menuOption; // opcao para menu

        SistemaLivraria sistema = new SistemaLivraria();

        // loop do menu principal
        do {
            //Exibir opcoes para o usuario
            System.out.println("\\n====== SISTEMA LIVRARIA ======");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Livro");
            System.out.println("3 - Listar Livros Disponiveis");
            System.out.println("4 - Alugar Livro");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            menuOption = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            // De acordo com a escolha, chama Métodos do SistemaLivraria
            switch (menuOption){
                case 1:
                    sistema.registerCustomers(scanner);
                    break;

                case 2:
                    sistema.registerBook(scanner);
                    break;

                case 3:
                    sistema.listAvailableBooks();
                    break;

                case 4:
                    sistema.rentBook(scanner);
                    break;

                case 5:
                    System.out.println("Saindo do sistema... Até mais!");

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (menuOption != 5);


        scanner.close();
    }

}
