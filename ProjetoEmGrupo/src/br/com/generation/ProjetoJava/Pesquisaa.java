package br.com.generation.ProjetoJava;

public class Pesquisaa {
	
	//verifica fumar é receber dados
			private int fumoint;
			private double gastofumo;
			void verificafuma(int _fumoint, double _gastofumo) {
				this.fumoint = _fumoint;
				this.gastofumo = _gastofumo;
				}
			//resposta para quem fuma
					void respostafumo() {
						if(fumoint == 1) {
							malfumo();
					}else if (fumoint == 2) {
						parabensfumo();
					}else {
						System.out.println("Você digitou uma opção inválida por isso não fizemos a verificação(fumo)");
					}
					}
			
			//verifica  beber
			private int latas;
			private int mlsdes;
			private int taca;
			void verificabebe(int _latas, int _mlsdes,int _taca) {	
					//recebendo se a pessoa bebe ou nao
					this.latas = _latas;
					this.mlsdes = _mlsdes;
					this.taca = _taca;		
			}
			//resposta para quem bebe
					void respostabebe() {
						if(latas > 2) {
						latas = latas - 2;
							malbebecerveja();
						}else if(latas <= 2 && latas >0) {
							idealbebecerveja();
						}
						if(mlsdes > 35){
							mlsdes = mlsdes - 35;
							malbebedestilado();
						}else if(mlsdes <=35 && mlsdes > 0){
							idealbebedestilado(); 
						}
						if(taca > 90) {
							taca = taca-90;
							malbebevinho();
						}else if(taca <=90 && taca >0) {
							idealbebevinho();
						}
					}
					private int horasr;
					private int redetrab;
			//verfica redes
					void verificaredes(int _horasr,int _redetrab) {
						this.horasr = _horasr;
						this.redetrab = _redetrab;
					}
			//resposta redes
					void respostaredes() {
						if(redetrab == 1) {
							if(horasr == 0 ) {
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Pelo visto você não usa redes sociais, portanto não há riscos a sua saúde em relação a isso (Redes sociais)");
							}else if(horasr >=1 && horasr <=3) {
								aceitavelrede();
							}else if(horasr >3 && horasr <=7) {
								alertarede();
							}else if(horasr>7) {
								malrede();
							}
						}else if(redetrab ==2) {
							if(horasr == 0 ) {
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Pelo visto você não usa redes sociais, portanto não há riscos a sua saúde em relação a isso (Redes sociais)");
							}else if(horasr >= 1 && horasr <=3) {
								aceitavelredetrab();
							}else if(horasr >=3 && horasr <=7) {
								alertaredetrab();
							}else if(horasr>7) {
								malredetrab();
							}
						}else {
							System.out.println("parece que você digitou uma opção inválida, portanto não fizemos a verificação(redes)");
						}
					}
			
			//verifica jogos
			private int horasj;
			private int jogostrab;
			int exchorasj;
				void verificarjogos(int _horasj, int _jogostrab) {
					this.horasj=_horasj;
					this.jogostrab=_jogostrab;
				}
				
				//resposta jogos
				void respostajogos() {
					if(jogostrab == 1) {
						if(horasj == 0) {
							System.out.println("Parece que você não joga, portanto nao terá nenhum risco a saúde em relação a isso.");
						}else if(horasj >2 ) {
							 exchorasj = horasj-2;
							 maljogos();
						}else {
							idealjogos();
						}
					}else if(jogostrab ==2) {
						if(horasj == 0) {
							System.out.println("Parece que você não joga, portanto não terá nenhum risco a saúde em relação a isso.");
						}else if(horasj >2 ) {
							 exchorasj = horasj-2;
							maljogostrabalha();
						}else {
							idealjogostrabalha();
						}
					}else {
						System.out.println("Parece que voce digitou uma opção inválida, portanto não fizemos a verificação(jogos).");
					}
				}
			
			//mal fumo
			void malfumo() {
				System.out.println("-------Feedback sobre Cigarro-------");
				System.out.println("É bom repensar aquele cigarro diário se você quer melhorar o seu sistema imunológico. Segundo o INCA, "
						+ "o tabagismo surge como um dos inimigos das defesas do corpo e propicia aos fumantes uma chance bem maior de adoecer quando comparados aos não-fumantes."
						+ " Não importa sua idade, parar de fumar sempre vale a pena. Parar aumenta a expectativa e a qualidade de vida.\r\n"
						+ "Os benefícios podem ser percebidos em qualquer faixa etária, mas quanto mais cedo o fumante parar, mais saúde ele terá, como reforça o Ministério da Saúde.");
				this.gastofumo = this.gastofumo *365;
				System.out.println("Essa é a quantia por ano gasta em cigarros: " + this.gastofumo);
			}
			void parabensfumo(){
				System.out.println("-------Feedback sobre Cigarro-------");
				System.out.println("Continue assim, você evitará inúmeros riscos a sua saúde e é importante lembrar que o tabaco causa não apenas câncer,"
						+ " mas uma série de outras doenças crônicas que também podem levar à morte, como doenças cardiovasculares, respiratórias, enfisemas, bronquite crônica.");
			}

			//mal bebe
			void malbebecerveja(){
				System.out.println("Voce está bebendo "+ latas + " De acordo com pesquisas da BVS,"
						+ " é recomendado que homens e mulheres não excedam uma quantidade de até duas latas ( 350ml ) de cerveja por dia");
			}
			void idealbebecerveja() {
				System.out.println("Você está na media de beber cerveja,De acordo com pesquisas da BVS,"
						+ " é recomendado que homens e mulheres não excedam uma quantidade de até duas latas ( 350ml ) de cerveja por dia ");
			}
			void malbebedestilado() {
				System.out.println("Voce está bebendo " + mlsdes+ " De acordo com pesquisas da BVS,"
						+ " é recomendado que homens e mulheres não excedam uma quantidade de até uma dose ( 35ml ) de destilados por dia.");
			}
			void idealbebedestilado() {
				System.out.println("Você está na média de beber destilados, De acordo com pesquisas da BVS,"
						+ " é recomendado que homens e mulheres não excedam uma quantidade de até uma dose ( 35ml ) de destilados por dia.");
			}
			void malbebevinho() {
				System.out.println("Voce está bebendo "+ taca + " De acordo com pesquisas da BVS,"
						+ " é recomendado que homens e mulheres não excedam uma quantidade de até um cálice ( 90 ml ) de vinho por dia");
			}
			void idealbebevinho() {
				System.out.println("Você está na media de beber vinho, De acordo com pesquisas da BVS, é recomendado que homens e mulheres não excedam uma quantidade de até uma dose ( 35ml ) de destilados por dia.");
			}
			//maljogos
			void maljogos() {
				System.out.println("-------Feedback Sobre jogos-------");
				System.out.println("Alerta! Você está dentro do que é considerado além do seguro. Verifique se esse hábito não está prejudicando suas relações interpessoais (Deixando de interagir com família e amigos)."
						+ " O excesso também pode fazer com que deixe de realizar outras atividades e prejudique o seu sono." + "O ideal é 2 horas por dia ou menos e você está " + exchorasj+" horas acima do ideal.");
			}
			void idealjogos() {
				System.out.println("-------Feedback Sobre jogos-------");
				System.out.println("Muito bem! Você está dentro do que é considerado tranquilo. Lembrando que, segundo alguns estudos, jogar videogames faz bem ao cérebro, desde que não seja em excesso.");
			}
			void maljogostrabalha() {
				System.out.println("-------Feedback Sobre jogos-------");
				System.out.println("Sabemos que você trabalho com isso,mas alerta! Você está dentro do que é considerado além do seguro. Verifique se esse hábito não está prejudicando suas relações interpessoais (Deixando de interagir com família e amigos)."
						+ " O excesso também pode fazer com que deixe de realizar outras atividades e prejudique o seu sono." + "O ideal é 2 horas por dia ou menos e você está " + exchorasj+" horas acima do ideal.");
			}
			void idealjogostrabalha() {
				System.out.println("-------Feedback Sobre jogos-------");
				System.out.println("Muito bem! Você está dentro do que é considerado tranquilo mesmo que você trabalhe com isso. Lembrando que, segundo alguns estudos, jogar videogames faz bem ao cérebro, desde que não seja em excesso.");
			}
			//malredes
			void aceitavelrede() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Muito bem! você está dentro do aceitável.\r\n"
						+ "Um estudo publicado pelo Journal of Social and Clinical Psychology, que concluiu que utilizar as redes sociais por até 30 minutos por dia pode trazer bons resultados à saúde mental, mas passar até 3h não afeta tanto.\r\n");
			}
			void alertarede() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Cuidado! Você está em estado de alerta. Passar mais de 3 horas nas redes sociais afeta o sono, induz um comportamento mais sedentário durante o dia,aponta estudo na BVS(Biblioteca Virtual em Saúde).");
			}
			void malrede() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("\r\n"
						+ "Atenção! O uso das redes sociais em grande escala pode afetar a baixa autoestima, a insatisfação pessoal, a depressão ou hiperatividade e, inclusive, a falta de afeto.\r\n"
						+ "O psiquiatra Cristiano Nabuco, coordenador do grupo de Dependências Tecnológicas do Instituto de Psiquiatria do Hospital das Clínicas da USP, informa que, quanto mais se busca a perfeição nas redes sociais e se negligencia a vida real, mais infeliz o usuário pode se sentir. “Oitenta e cinco por cento de todas as fotografias que são postadas são editadas. Isso é um problema, porque se desenvolve uma autoestima virtual e não pessoal, e quanto mais o indivíduo busca se equiparar a essa vida paralela, mais infeliz ele vai se sentir na vida real.” Tira um tempo para respirar da tecnologia e vai interagir pessoalmente com outro.\r\n"
						+ "Fica a dica:\r\n"
						+ "O tempo é algo que não podemos nos dar ao luxo de desperdiçar. Então, o que você acha de planejar como usá-lo, assim como faria com dinheiro? \r\n"
						+ " \r\n"
						+ "*Escreva quanto tempo acha que seria razoável gastar numa rede social. Depois, veja como se saiu durante um mês. Se você ultrapassou sua meta, faça ajustes onde necessário.\r\n"
						+ "*Concentre-se no que vai fazer no momento.\r\n"
						+ "*Desligue os seus alertas e notificações.\r\n"
						+ "* Escolha momentos para verificar e-mails e redes sociais.\r\n"
						+ "Espero que goste!!\r\n"
						+ "");
			}
			void aceitavelredetrab() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Muito bem!Mesmo trabalhando você está dentro do aceitável.\r\n"
						+ "Um estudo publicado pelo Journal of Social and Clinical Psychology, que concluiu que utilizar as redes sociais por até 30 minutos por dia pode trazer bons resultados à saúde mental, mas passar até 3h não afeta tanto.\r\n");
			}
			void alertaredetrab() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Sabemos que você está trabalhando,mas Cuidado! Passar mais de 3 horas nas redes sociais afeta o sono, induz um comportamento mais sedentário durante o dia,aponta estudo na BVS(Biblioteca Virtual em Saúde).\r\n"
						+ " ");
			}
			void malredetrab() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Tome muito cuidado,sabemos que é por causa do trabalho mas Atenção! O uso das redes sociais em grande escala pode afetar a baixa autoestima, a insatisfação pessoal, a depressão ou hiperatividade e, inclusive, a falta de afeto.\r\n"
						+ "O psiquiatra Cristiano Nabuco, coordenador do grupo de Dependências Tecnológicas do Instituto de Psiquiatria do Hospital das Clínicas da USP, informa que, quanto mais se busca a perfeição nas redes sociais e se negligencia a vida real, mais infeliz o usuário pode se sentir. “Oitenta e cinco por cento de todas as fotografias que são postadas são editadas. Isso é um problema, porque se desenvolve uma autoestima virtual e não pessoal, e quanto mais o indivíduo busca se equiparar a essa vida paralela, mais infeliz ele vai se sentir na vida real.” Tira um tempo para respirar da tecnologia e vai interagir pessoalmente com outro.\r\n"
						+ "Fica a dica:\r\n"
						+ "O tempo é algo que não podemos nos dar ao luxo de desperdiçar. Então, o que você acha de planejar como usá-lo, assim como faria com dinheiro? \r\n"
						+ " \r\n"
						+ "*Escreva quanto tempo acha que seria razoável gastar numa rede social. Depois, veja como se saiu durante um mês. Se você ultrapassou sua meta, faça ajustes onde necessário.\r\n"
						+ "*Concentre-se no que vai fazer no momento.\r\n"
						+ "*Desligue os seus alertas e notificações.\r\n"
						+ "* Escolha momentos para verificar e-mails e redes sociais.\r\n"
						+ "Espero que goste!!\r\n"
						+ "");
			}
		
}
