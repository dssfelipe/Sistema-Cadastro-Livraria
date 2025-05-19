package Livraria;

public class Livro {

    String title; /*titulo*/
    String author; /*Autor*/
    String isbn;

    //Variavel para representar o status de um livro. Alugado = (sim ou nao)
    boolean isRented = false; //O prefixo is é uma convenção comum para variáveis booleanas /*Por padrao o livro estará disponivel*/

    //Metodo para exibir detalhes de um livro
    public void displayDetails(){ /*exibirDetalhes*/
        System.out.println(" | Titulo: " + title +
                "\n | Autor: " +
                "\n | ISBN: " + isbn +
                "\n Status: " + (isRented ? "Alugado" : "Disponível")
        );
    }


}
