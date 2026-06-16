import java.util.Scanner;   //imorta o scanner
import java.ultil.ArrayList; // importa a classe ArrayList

public class estoque {  //declara a classe estoque 

   

    public static void main(String[] args) throws Exception { // declara o metodo main

     
        Scanner teclado = new Scanner(System.in); // cria um objeto scanner
         ArrayList<String> descricao = new ArrayList<String>(); // // Cria uma Lista que armazena os produtos (Array e um vetor multidimensional que aloca espacos na memoria)
     
        System.out.println("---Bem Vindo ao Controle de Estoque---");        
        System.out.println("1.Cadastrar Produto");                              
        System.out.println("2.Listar Produtos");                         // menu de navegacao
        System.out.println("3.Excluir Produto");                             
        System.out.println("0.Sair");                                   


        int opcao = teclado.nextInt();  // essa variavel recebe a opcao do usuario, usado para navegacao no menu, e a principal fucao do programa, pois a partir dela o usuario pode escolher o que deseja fazer. seu feio!

        
        switch (opcao) {
            case 1:
                System.out.println("--Cadastrar Produto--");
                System.out.println("Produto:");
                teclado.nextLine();                                             //Eu tenho que fazer ele voltar ao inicio do sistema, pra poder listar os produtos
                                                                                //Ta foda, to com dificuldade em array list e tenha que lembrar com usa o while

                String produto = teclado.nextLine();                                    
                descricao.add(produto); 
            
                System.out.println("Produto cadastrado com sucesso!"); 
              


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
