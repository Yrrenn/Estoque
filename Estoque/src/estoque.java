 import java.util.Scanner;   //imorta o scanner


public class estoque {  //declara a classe estoque 

   

    public static void main(String[] args) throws Exception { // declara o metodo main

        Scanner teclado = new Scanner(System.in); // cria um objeto scanner

        System.out.println("---Bem Vindo ao Controle de Estoque---");        
        System.out.println("1.Cadastrar Produto");                              
        System.out.println("2.Listar Produtos");                         // menu de navegacao
        System.out.println("3.Excluir Produto");                             
        System.out.println("0.Sair");                                   


        int opcao = teclado.nextInt();  // essa variavel recebe a opcao do usuario, usado para navegacao no menu, e a principal fucao do programa, pois a partir dela o usuario pode escolher o que deseja fazer. seu feio!
        String produto; // 
        int quantidade; // 

        
        switch (opcao) {
            case 1:
                System.out.println("--Cadastrar Produto--");

                System.out.println("Produto:");
                String produto = teclado.next();

                System.out.println("Quantidade:");
                int quantidade = teclado.nextInt();

                // Lógica para cadastrar produto
                break;
            case 2:
                System.out.println("Listar Produtos");



                // Lógica para listar produtos
                break;
            case 3:
                System.out.println("Excluir Produto");



                // Lógica para excluir produto
                break;
            case 0:
                System.out.println("Saindo...");


                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        teclado.close();
    }
}
