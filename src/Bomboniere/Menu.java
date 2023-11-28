package Bomboniere;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int opcao;
		
		
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  Bomboniere                         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Novo Produto                         ");
			System.out.println("            2 - Listar produtos por ID               ");
			System.out.println("            3 - Deletar produto                      ");
			System.out.println("            4 - Atualizar produto                    ");
			System.out.println("                                                     ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("     Entre com a opção desejada:                     ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
		
			if (opcao == 5) {
				System.out.println( "\n Obrigada por passar na nossa Bomboniere!! ");
				sobre();
			leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println( "\n Adicionar Produto \n ");			
				break;
			case 2:
				System.out.println( "\n Buscar produto \n");				
				break;
			case 3:
				System.out.println( "\nListar produtos por ID \n");		
				break;
			case 4:
				System.out.println("\nAtualizar produto \n");		
				break;
			case 5:
				System.out.println( "\nCancelar Pedido \n");	
				break;
			default:
				System.out.println( "\nOpção Inválida!\n");
				break;	
			}
		}
		
	}
	public  static void sobre() {
		System.out.println("\n**********************************************");
		System.out.println("                                        	    ");
		System.out.println("Projeto Desenvolvido por: Aluna da Generation   ");
		System.out.println("Wendy Eugenia -  wendy.t.n@hotmail.com"           );
		System.out.println("https://github.com/WendyEugenia");
		System.out.println("\n**********************************************");

  }
}