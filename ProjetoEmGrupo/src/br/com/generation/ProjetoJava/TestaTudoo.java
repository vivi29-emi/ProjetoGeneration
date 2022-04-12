package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class TestaTudoo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boasvindas();
		//recebendo o nome
		System.out.println("Digite seu nome: ");
		String n = input.nextLine();
		//verificando se o usuario nao esta digitando numeros 
		while(!matchesOnlyText(n)){
			System.out.println("Você não pode inserir números ou caracteres especiais no nome.");
			System.out.println("Digite seu nome: ");
			n = input.nextLine();
		}
			System.out.println("Qual sua idade?");
			int i = input.nextInt();
		//criando objeto com os parametros do método construtor Usuario()
		Usuario u1 = new Usuario(n,i);
		
		//indo para a primeira pergunta
		System.out.println("Vamos para a primeira pegunta...");
		//perguntando se fuma
		System.out.println(u1.getNome() + ", você fuma? Digite '1' para sim, e digite '2' para não.");
		int fumoint = input.nextInt();
		double gastofumo = 0.0;
		if(fumoint == 1) {
			System.out.println(u1.getNome() + ", quanto em dinheiro você gasta com cigarros por dia?");
			gastofumo = input.nextDouble();
		}
		//criando objeto para classe recebendo os dados de quem fuma
		Pesquisaa f1 = new Pesquisaa();
			f1.verificafuma(fumoint,gastofumo);
			
		//indo para a segunda pergunta
			System.out.println("Vamos para a segunda pergunta...");
		//perguntando se bebe
			System.out.println(u1.getNome()+", você costuma beber bebidas alcóolicas? Digite '1' para sim e '2' para não? ");
			int bebe = input.nextInt();
			String naobebe = "";
			//criando objeto para bebe
			Pesquisaa b1 = new Pesquisaa();
			 if (bebe == 1) {
				 System.out.println("Quantas latas de cerveja por dia?(o ideal é 2 latas)");
				 int latas = input.nextInt();
					System.out.println("Quantos MLs de destilado por dia?(o ideal é 35ml)");
					int mlsdes = input.nextInt();
					System.out.println("Quantas taças de vinho por dia?(o ideal é 90 ml)");
					int taca = input.nextInt();
					//puxando metodo verificabebe()
					b1.verificabebe(latas, mlsdes, taca);
			 }else if(bebe == 2) {
				 naobebe ="Desse jeito evitamos o desenvolvimento de doenças crônicas, incluindo hipertensão arterial, doença cardíaca, acidente vascular cerebral, doença hepática e problemas digestivos, e problemas de saúde/mental causados pelo álcool,incluindo depressão e ansiedade";
			 }
		//indo para a terceira pegunta
		System.out.println("Vamos para a terceira pergunta...");
		System.out.println(u1.getNome()+", quantas horas por dia você fica nas redes sociais?");
		int horasr = input.nextInt();
		System.out.println("É por trabalho ou lazer? '1'-lazer/'2'-trabalho");
		int redetrab = input.nextInt();
		//criando objeto para rede social
		Pesquisaa r1 = new Pesquisaa();
		//puxando metodo verificarede()
		r1.verificaredes(horasr,redetrab);
		
		//indo para a quarta pergunta
		System.out.println("Vamos para a quarta pergunta...");
		System.out.println(u1.getNome()+" quantas horas por dia você passa jogando jogos eletrônicos?");
		int horasj = input.nextInt();
		System.out.println("É por trabalho ou lazer? '1'-lazer/'2'-trabalho");
		int jogostrab = input.nextInt();
		//criando objeto para jogos
		Pesquisaa j1 = new Pesquisaa();
		//puxando metodo verificajogos()
		j1.verificarjogos(horasj, jogostrab);
		//printando as respostas para o usuario
		f1.respostafumo();
		System.out.println();
		if(bebe ==1) {
			System.out.println("-------Feedback sobre beber--------");
			b1.respostabebe();
		}else if(bebe==2) {
			System.out.println("-------Feedback sobre beber--------");
			System.out.println(naobebe);
		}else {System.out.println("-------Feedback sobre beber--------");
			System.out.println("Você digitou uma opção inválida por isso não fizemos nenhuma verificação(beber)");
		}
		System.out.println();
		r1.respostaredes();
		System.out.println();
		j1.respostajogos();
		
		System.out.println("--------------------------------------------------");
		System.out.println("Obrigado(a) por participar de nossas pesquisas "+u1.getNome()+ ", espero que nosso programa ajude.");
input.close();

}
	
	public static boolean matchesOnlyText(String text) {
	    return text.matches("[a-zA-Z\\s]+");
	}

	static void boasvindas() {
		System.out.println("=============================================================");
		System.out.println("====                                                      ===");
		System.out.println("====                                                      ===");
		System.out.println("====              SEJA BEM VINDE!!!                       ===");
		System.out.println("====                <Habtour/>                            ===");
		System.out.println("====                                                      ===");
		System.out.println("====                                                      ===");
		System.out.println("=============================================================");
		
		System.out.println();
	}
	

		
	}





