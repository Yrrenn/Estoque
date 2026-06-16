 import java.util.Scanner;


public class estoque {

   

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("---Bem Vindo ao Controle de Estoque---");
        System.out.println("1.Cadastrar Produto");
        System.out.println("2.Listar Produtos");
        System.out.println("3.Excluir Produto");
        System.out.println("0.Sair");


        int opcao = teclado.nextInt();
        String produto;
        int quantidade;

        
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
