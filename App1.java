package app1;
import java.util.Scanner;

public class App1 {

	static String dinheiro, cartao, resultado;
	static double extra;

	public static void main(String[] args) {

		int opcao, escolhafim = 0;
		try (Scanner dados = new Scanner(System.in)) {
			System.out.println("Ola! Seja Bem Vindo(a).");
			System.out.println("----------------------");
			System.out.println("");
			System.out.println("Escolha uma das opcoes a seguir.");
			System.out.println("                                ");
			
			//inicio do programa

			do {
				System.out.print("Opcoes: \n 1: Hamburguer. \n 2: Pizza. \n 3: Sair do menu.");

				opcao = dados.nextInt();

				switch (opcao) {

				case 1:
					resultado = ("Hamburguer.");
					break;
				case 2:
					resultado = ("Pizza.");
					break;
				case 3:
					resultado = ("Sair do menu.");
					System.out.println("Voce escolheu sair do menu.");
					System.exit(3);
					break;
				}
				System.out.println("");
				if(opcao>3 || opcao==0){
					System.out.println("Voce escolheu uma opcao invalida!");
					System.out.println("                                 ");
				}
			}while(opcao>3 || opcao==0);

			System.out.print("Entendi! a opcao escolhida foi " + resultado);
			System.out.println("                                         ");

			// Montando o Hamburguer - escolha da carne.
			
			if(opcao == 1)
				do {
				System.out.print("Agora, iremos montar seu hamburguer.");
				System.out.println("                                  ");
				System.out.println("Comece escolhendo a carne. \n 1: Blend da casa. \n 2: Maminha. \n 3: Picanha. \n 4: Sair do menu.");

				opcao = dados.nextInt();
				switch (opcao) {

				case 1:
					resultado = ("Blend da casa");
					break;
				case 2:
					resultado = ("Maminha");
					break;
				case 3:
					resultado = ("Picanha");
					break;
				case 4:
					resultado = ("Sair do menu");
					System.out.println("Voce escolheu sair do menu.");
					System.exit(4);
					break;
				}
				System.out.println("");
				if(opcao>4 || opcao==0){
					System.out.println("Opcao invalida!");
					System.out.println(" ");
				}
			}while(opcao>4 || opcao==0);
			System.out.print(resultado + "? Excelente escolha!");
			System.out.println("                                         ");

			// escolha do pão

			System.out.println("Agora, escolha o pao. \n 1: Pao bola padrao. \n 2: Pao Brioche. \n 3: Pao Australiano. \n 4: Sair do menu.");
			System.out.println("                                     ");
			opcao = dados.nextInt();
			switch (opcao) {

			case 1:
				resultado = ("Pao bola padrao");
				break;
			case 2:
				resultado = ("Pao Brioche");
				break;
			case 3:
				resultado = ("Pao Australiano");
				break;
			case 4:
				resultado = ("Sair do menu.");
				System.out.println("Voce escolheu sair do menu.");
				System.exit(4);
				break;
			}
			System.out.println("");
			if(opcao>4 || opcao==0){
				System.out.println("Opcao invalida!");
				System.out.println(" ");
			}

			while(opcao>4 || opcao==0);
			System.out.print("Excelente! O " + resultado + " e um dos mais pedidos.");
			System.out.println("                                         ");

			// escolha do queijo.

			System.out.println("Agora, escolha o queijo. \n 1: Mussarela. \n 2: Cheddar. \n 3: Suico. \n 4: Sair do menu.");

			opcao = dados.nextInt();
			switch (opcao) {

			case 1:
				resultado = ("Mussarela");
				break;
			case 2:
				resultado = ("Cheddar");
				break;
			case 3:
				resultado = ("Suico");
				break;
			case 4:
				resultado = ("Sair do menu");
				System.out.println("Voce escolheu sair do menu.");
				System.exit(4);
				break;
			}
			System.out.println("");
			if(opcao>4 || opcao==0){
				System.out.println("Opcao invalida!");
				System.out.println(" ");
			}

			while(opcao>4 || opcao==0);
			System.out.print("Voce tem bom gosto hein! o queijo " + resultado + " combina bem com a carne escolhida.");
			System.out.println("                                         ");

			// adicionar salada sim ou nao?

			System.out.println("Deseja adicionar salada?  \n 1: Sim. \n 2: Nao. \n 3: Sair do menu.");

			opcao = dados.nextInt();
			switch (opcao) {

			case 1:
				resultado = ("Sim");
				break;
			case 2:
				resultado = ("Nao");
				break;
			case 3:
				resultado = ("Sair do menu");
				System.out.println("Voce escolheu sair do menu.");
				System.exit(4);
				break;
			}
			System.out.println("                               ");
			if(opcao>3 || opcao==0){
				System.out.println("Opcao invalida!");
				System.out.println("                           ");
			}

			if(opcao>=1); {
				System.out.println(resultado + "? Tudo bem.");
			}

			// remover algum ítem?

			System.out.println("Deseja remover algum item da salada? \n 1: Alface. \n 2: Tomate. \n 3: Cebola. \n 4: Picles. \n 5: Nao. \n 6: Sair do menu.");

			opcao = dados.nextInt();
			switch (opcao) {

			case 1:
				resultado = ("Alface");
				break;
			case 2:
				resultado = ("Tomate");
				break;
			case 3:
				resultado = ("Cebola");
				break;
			case 4:
				resultado = ("Picles");
				break;
			case 5:
				resultado = ("Nao");
				break;
			case 6:
				resultado = ("Sair do menu");
				System.out.println("Voce escolheu sair do menu.");
				System.exit(4);
				break;
			}
			System.out.println("");
			if(opcao>6 || opcao==0){
				System.out.println("Opcao invalida!");
				System.out.println(" ");
			}

			while(opcao>6 || opcao==0);
			System.out.print("ok!");
			System.out.println("");

			if(opcao == 1/2/3/4); {
				System.out.println("voce escolheu " + resultado);
			}
			if(opcao == 5); {
				System.out.println("Seu Hamburguer sera completo.");
				System.out.println("                             ");


				// molhos.

				System.out.println("Escolha seu molho. \n 1: Barbecue. \n 2: Quatro queijos. \n 3: Chipottle. \n 4: Sair do menu.");

				opcao = dados.nextInt();
				switch (opcao) {

				case 1:
					resultado = ("Barbecue");
					break;
				case 2:
					resultado = ("Quatro queijos");
					break;
				case 3:
					resultado = ("Chipottle");
					break;
				case 4:
					resultado = ("Sair do menu");
					System.out.println("Voce escolheu sair do menu.");
					System.exit(4);
					break;
				}
				System.out.println("");
				if(opcao>4 || opcao==0){
					System.out.println("Opcao invalida!");
					System.out.println(" ");
				}

				while(opcao>4 || opcao==0);
				System.out.print("Entendi! a opcao escolhida foi " + resultado);
				System.out.println("");

				if(opcao == 3); {
					System.out.println("Wow! parece que alguem gosta de molho picante por aqui. ;)");
					System.out.println("                                         ");

					// ecolha dos extras.

					System.out.println("Deseja adicionar algum ingrediente extra?");
					System.out.println("                                         ");
					System.out.println("Selecione a opcao desejada. Voce pode escolher um de cada item.");
					System.out.println("\n 1: queijo. \n 2: Molho. \n 3: Carne. \n 4: Nao.");
					System.out.println("                                         ");

					opcao = dados.nextInt();
					switch (opcao) {

					case 1:
						resultado = ("Queijo");
						break;
					case 2:
						resultado = ("Molho");
						break;
					case 3:
						resultado = ("Carne");
						break;
					case 4:
						resultado = ("Nao");
						System.out.println("Voce escolheu sair do menu.");
						System.exit(4);
						break;
					}
					System.out.println("");
					if(opcao>4 || opcao==0){
						System.out.println("Opcao invalida!");
						System.out.println(" ");
					}

					while(opcao>4 || opcao==0);
					System.out.println("Entendi! a opcao escolhida foi " + resultado);
					System.out.println("                                         ");

					System.out.println("Algo mais?");
					System.out.println("\n 1: sim. \n 2: nao. Finalizar pedido.");

					opcao = dados.nextInt();
					switch(opcao) {

					case 1: 
						resultado = ("sim");
						break;
					case 2:
						resultado = ("nao");
						break;
					}

					if(opcao == 1); {
						System.out.println("escolha o item que deseja incrementar. \n 1: queijo. \n 2: Molho. \n 3: Carne.");
						opcao = dados.nextInt();
						switch(opcao) {
						case 1:
							resultado = ("Queijo");
							break;
						case 2:
							resultado = ("Molho");
							break;
						case 3:
							resultado = ("Carne");
							break;
						}
						System.out.println("");
						if(opcao>3 || opcao==0){
							System.out.println("Opcao invalida!");
							System.out.println(" ");
						}
						while(opcao>3 || opcao==0);
						System.out.print("Entendi! a opcao escolhida foi " + resultado);
						System.out.println("                                         ");

						System.out.println(" ----------------------------------- ");
					}
					if(opcao == 2);{
						System.out.println("Finalize seu pedido. Escolha uma forma de pagamento. \n 1: Dinheiro. \n 2: Cartao de credito. \n 3: Pix.");

						opcao = dados.nextInt();
						switch (opcao) {

						case 1:
							resultado = ("Dinheiro");
							break;
						case 2:
							resultado = ("Cartao de credito");
							break;
						case 3:
							resultado = ("Pix");
							break;
						}
						System.out.println("");
						if(opcao>3 || opcao==0){
							System.out.println("Voce escolheu uma opcao invalida!");
							System.out.println(" ");
						}

						while(opcao>3 || opcao==0);
						System.out.println("Entendi! Voce vai pagar com " + resultado);
						
						//numero do pedido e finalizacao
						int i = 100;
						System.out.println("o numero do seu pedio e - " + i++ + " Dirija-se ao caixa logo em frente. Obrigado!");
						System.exit(escolhafim);
						
					}
				}
			}
		}
	}

}



