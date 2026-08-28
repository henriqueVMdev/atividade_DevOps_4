public class Main {
    public static void main(String[] args) {
        System.out.println("==== livraria DevOps ====");

        Livro livro1 = new Livro("Java para iniciantes", "Ana Silva", 80.00, 5);
        Livro livro2 = new Livro("DevOps na prática", "Carlos Souza", 120.00, 3);


        System.out.println("\n Livro 1");
        livro1.exibirInformacoes();
        System.out.println("Valor total em estoque R$: "+ livro1.calcularValorEstoque());

        System.out.println("\n Livro 2");
        livro2.exibirInformacoes();
        System.out.println("Valor total em estoque R$: " + livro2.calcularValorEstoque());
        System.out.println("Aplicação executada com sucesso");
        System.out.println("");
    }
    
}
