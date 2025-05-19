package Livraria;

import java.util.Scanner;

public class SistemaLivraria {


    //Array para armazenar cadastrar clientes
    String[] customerName = new String[50]; /*Nome dos clientes*/
    int numberOfCustomers = 0; /*Contador de clientes*/

    //Array para armazenar livros
    Livro[] books = new Livro[200]; /*Livros*/
    int numberOfBooks = 0; /*Contador de livros*/

    //Metodo para cadastrar clientes
    public void registerCustomers(Scanner scanner){
        if (numberOfCustomers >= customerName.length){
            System.out.println("Capacidade máxima de clientes atingida.");
            return;
        }

        System.out.println("Digite o nome do cliente: ");
        String newName = scanner.nextLine();
        customerName[numberOfCustomers] = newName; //Add nome no array
        numberOfCustomers++;
        System.out.println("Cliente cadastrado com sucesso!");
    }

    //Metodo para cadastrar livros
    public void registerBook (Scanner scanner){
        if (numberOfBooks >= books.length){
            System.out.println("Capacidade máxima de livros atingida!");
            return;
        }

        Livro newBook = new  Livro(); //criar novo objeto da classe livro /*Novo Livro*/
        System.out.println("Digite o titulo do livro");
        newBook.title = scanner.nextLine();
        System.out.println("Digite o autor do livro");
        newBook.author = scanner.nextLine();
        System.out.println("Digite o ISBN");
        newBook.isbn = scanner.nextLine();
        books[numberOfBooks] = newBook; //Armazenar novo objeto ao array
        numberOfBooks++;
        System.out.println("Livro cadastrado com sucesso!");
    }

    //Metodo para listar todos os livros disponiveis para alugar
    public void listAvailableBooks(){ /*ListarLivrosDisponiveis*/

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("\nLivros disponivel para alugar:");
            if (!books[i].isRented){ //false
                books[i].displayDetails(); //Chamando metodo para apresentar ao usuario /*exibirDetalhes()*/
            }else {
                System.out.println("Nenhum livro disponivel no momento.");
            }
        }
    }

    //Metodo para alugar um livro
    public void rentBook(Scanner scanner){
        System.out.println("Digite o ISBN do livro que deseja alugar: ");
        String searchIsbn = scanner.nextLine(); /*searchIsbn = IsbnEncontrado*/
        boolean isFound = false; /*isEncontrado*/

        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].isbn.equals(searchIsbn)) {
                isFound = true;
                if (!books[i].isRented){
                    books[i].isRented = true;
                    System.out.println("Livro alugado com sucesso!");
                }else {
                    System.out.println("Este livro ja esta alugado!");
                }
                break;
            }

        }
        if (!isFound){
            System.out.println("Livro não encontrado.");
        }

    }

}
