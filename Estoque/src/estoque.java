import java.util.Scanner;   //imorta o scanner
import java.util.ArrayList; // importa a classe ArrayList


public class estoque {  //declara a classe estoque 

   

    public static void main(String[] args) throws Exception { // declara o metodo main

        Scanner teclado = new Scanner(System.in);  // cria um objeto scanner
        

        ArrayList<String> descricao = new ArrayList<String>();   // Cria uma Lista que armazena os produtos (Array e um vetor multidimensional que aloca espacos na memoria)
                

        int opcao = -1; // inicializa a variavel opcao com -1, para que o programa entre no loop while, caso escolha 0, o programa termina.

        while (opcao !=0) { // enquanto a opcao for diferente de 0, o programa continua rodando, e o usuario pode escolher o que deseja fazer, caso escolha 0, o programa termina.

        System.out.println("---Bem Vindo ao Controle de Estoque---");        
        System.out.println("1.Cadastrar Produto");                              
        System.out.println("2.Listar Produtos");                         // menu de navegacao
        System.out.println("3.Atualizar Estoque");                      
        System.out.println("0.Sair");                                   
        System.out.println("-------------------------------------");
        System.out.println("Escolha uma opção:"); // pede para o usuario escolher uma opcao
        opcao = teclado.nextInt(); // le a opcao escolhida pelo usuario




        switch (opcao) {
            
            case 1:
                System.out.println("--Cadastrar Produto--");
                System.out.println("Nome do produto:");
                teclado.nextLine();

                String produto = teclado.nextLine();
                descricao.add(produto); 
            
                System.out.println(produto + " cadastrado com sucesso!");
                


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
    }
    
        teclado.close();
    }
}
