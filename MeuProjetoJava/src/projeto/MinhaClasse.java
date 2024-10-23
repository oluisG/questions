package projeto;

import java.util.Scanner;

public class MinhaClasse  {
	

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int pontos = 0;
		System.out.println("Todas as respostas devem ser com letras minúsculas e sem acento.");
		System.out.println("===============");
		 System.out.println("Digite *sim* para continuar");
		String string = scanner.nextLine();
		if(string.equals("sim")) {
			System.out.println("===============");
			
			//Primeira  pergunta	
			System.out.println("Como é chamado um Array?");	
			string = scanner.nextLine();
			if(string.equals("vetor")) {
				pontos++;
				System.out.println("===============");
				System.out.println("Você pontuou !");
				System.out.println("Você deseja continuar? (sim) ou (nao)");
			    string = scanner.nextLine();
				if(string.equals("sim")) {
					System.out.println("===============");
					
				//Segunda pergunta	
					System.out.println("Qual linguagem é mais antiga: c ou java? ");
					string = scanner.nextLine();
					if(string.equals("c")){
						pontos++;
						System.out.println("===============");
						System.out.println("Você pontuou !");
						System.out.println("Você deseja continuar? (sim) ou (nao)");
					    string = scanner.nextLine();
						if(string.equals("sim")) {
							System.out.println("===============");
							
							//Terceira pergunta	
							System.out.println("Quais dígitos o sistema binário utiliza?");
							string = scanner.nextLine();
							if(string.equals("01")){
								pontos++;
								System.out.println("===============");
								System.out.println("Você pontuou !");
								System.out.println("Você deseja continuar? (sim) ou (nao)");
							    string = scanner.nextLine();
								if(string.equals("sim")) {
									System.out.println("===============");
									
									//Quarta pergunta
									System.out.println("Qual a abreviação de inteligência artificial?");
									string = scanner.nextLine();
									if(string.equals("ia")) {
										pontos++;
										System.out.println("===============");
										System.out.println("Você pontuou !");
										System.out.println("Você deseja continuar? (sim) ou (nao)");
										string =  scanner.nextLine();
										if(string.equals("sim")) {
											System.out.println("===============");
											
											
											//Quinta pergunta
											System.out.println("Qual a linguagem de programação mais usada atualmente?");
											string = scanner.nextLine();
											if(string.equals("javascript")) {
												pontos++;
												System.out.println("===============");
												System.out.println("Você ganhou !");
												System.out.println("Sua pontuação final foi de: " + pontos);
												System.out.println("===============");
												
											}else {
												System.out.println("Você Perdeu ! Sua pontuação foi de: " + pontos);
												System.out.println("===============");
											}
										}else {
											System.out.println("Você Perdeu ! Sua pontuação foi de: " + pontos);
											System.out.println("===============");
										}
									}else {
										System.out.println("Você Perdeu ! Sua pontuação foi de: " + pontos);
										System.out.println("===============");
									}		
								}else {		
									System.out.println("Você Perdeu ! Sua pontuação foi de: " + pontos);
									System.out.println("===============");
								}
							}else {
								System.out.println("Você Perdeu ! Sua pontuação foi de: " + pontos);
								System.out.println("===============");
							}
						}else {
							System.out.println("Você Perdeu ! Sua pontuação foi de: " + pontos);
							System.out.println("===============");
						}
					}else {
						System.out.println("Você Perdeu ! Sua pontuação foi de: " + pontos);
						System.out.println("===============");
					}
				}else {
					System.out.println("Você Perdeu ! Sua pontuação foi de: " + pontos);
					System.out.println("===============");
				}
			}else {
				System.out.println("Você Perdeu ! Sua pontuação foi de : " + pontos);
				System.out.println("===============");
			}
		}else {
			System.out.println("===============");
			System.out.println("Acabou o jogo... Você pontuou 0");
		}

	}

}





	

	
	
