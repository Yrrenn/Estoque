import java.util.Scanner;   //imorta o scanner
import java.util.ArrayList; // importa a classe ArrayList


public class estoque {  //declara a classe estoque 

   

    public static void main(String[] args) throws Exception { // declara o metodo main

        Scanner teclado = new Scanner(System.in);  // cria um objeto scanner

        ArrayList<String> descricao = new ArrayList<String>();   // Cria uma Lista que armazena os produtos (Array e um vetor multidimensional que aloca espacos na memoria)
       ArrayList<Integer> qtd = new ArrayList<Integer>();         

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
            
            case 1:  // Lógica para cadastrar produto

                System.out.println("--Cadastrar Produto--");
                System.out.println("Nome do produto:");
                teclado.nextLine();                                             //add o produto na lista
                String produto = teclado.nextLine();
                descricao.add(produto); 


                System.out.println("Adicione a quantidade de " + produto + " desejado(a) no estoque:");
                int qtdProduto = teclado.nextInt();                                                             //add a quantidade do produto
                qtd.add(qtdProduto);
                System.out.println(produto + " cadastrado com sucesso!");
                
                break;

            case 2: // Lógica para listar produtos

                System.out.println("--- Em estoque ---");
 
                if (descricao.isEmpty()) {                                           //Aqui o if verifica se a lista de produtos esta vazia
                    System.out.println("Nenhum produto em estoque ;-;");

                } else {                                                            //Aqui caso o lista nao esteja vaazia, o "else" percorre e imprime os produtos e as quantiodade, o "for" faz esse trabalho

                   for (int i = 0; i < descricao.size(); i++) {                     //O loop percorrer a lista de produtos, o "i" inicia em 0, e enquanto for menor que o tamanho da lista, ele incrementa o "i" em 1, ou seja, ele percorre toda a lista.

            System.out.println(
                descricao.get(i) + " - " +
                qtd.get(i) + " unidades"                                            //
            );

                    }
                }

                System.out.println("-------------------------------------");
                break;

            case 3: // Lógica para Atualizar estoque
                System.out.println("--- Atualizar estoque ---");
                System.out.println("Qual produto deseja atualizar?");
                teclado.nextLine();
               
                       System.out.println("Nova quantidade:");

                       
                       System.out.println("Estoque atualizado com sucesso!");

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
