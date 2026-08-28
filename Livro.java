/*
 Cria a classe livro
*/

public class Livro{
    String titulo;
    String autor;
   double preco;
   int quantidade;

   // Cria o construtor

    public Livro(String titulo, String autor, double preco, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    // metodo para exibir informação

    public void exibirInformacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Preco R$: " + preco);
        System.out.println("Quantidade: " + quantidade);

    }

    public double calcularValorEstoque(){
        return preco * quantidade;
    }



}