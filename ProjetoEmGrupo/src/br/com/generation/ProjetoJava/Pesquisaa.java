package br.com.generation.ProjetoJava;

public class Pesquisaa {
	
	//verifica fumar � receber dados
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
						System.out.println("Voc� digitou uma op��o inv�lida por isso n�o fizemos a verifica��o(fumo)");
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
								System.out.println("Pelo visto voc� n�o usa redes sociais, portanto n�o h� riscos a sua sa�de em rela��o a isso (Redes sociais)");
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
								System.out.println("Pelo visto voc� n�o usa redes sociais, portanto n�o h� riscos a sua sa�de em rela��o a isso (Redes sociais)");
							}else if(horasr >= 1 && horasr <=3) {
								aceitavelredetrab();
							}else if(horasr >=3 && horasr <=7) {
								alertaredetrab();
							}else if(horasr>7) {
								malredetrab();
							}
						}else {
							System.out.println("parece que voc� digitou uma op��o inv�lida, portanto n�o fizemos a verifica��o(redes)");
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
							System.out.println("Parece que voc� n�o joga, portanto nao ter� nenhum risco a sa�de em rela��o a isso.");
						}else if(horasj >2 ) {
							 exchorasj = horasj-2;
							 maljogos();
						}else {
							idealjogos();
						}
					}else if(jogostrab ==2) {
						if(horasj == 0) {
							System.out.println("Parece que voc� n�o joga, portanto n�o ter� nenhum risco a sa�de em rela��o a isso.");
						}else if(horasj >2 ) {
							 exchorasj = horasj-2;
							maljogostrabalha();
						}else {
							idealjogostrabalha();
						}
					}else {
						System.out.println("Parece que voce digitou uma op��o inv�lida, portanto n�o fizemos a verifica��o(jogos).");
					}
				}
			
			//mal fumo
			void malfumo() {
				System.out.println("-------Feedback sobre Cigarro-------");
				System.out.println("� bom repensar aquele cigarro di�rio se voc� quer melhorar o seu sistema imunol�gico. Segundo o INCA, "
						+ "o tabagismo surge como um dos inimigos das defesas do corpo e propicia aos fumantes uma chance bem maior de adoecer quando comparados aos n�o-fumantes."
						+ " N�o importa sua idade, parar de fumar sempre vale a pena. Parar aumenta a expectativa e a qualidade de vida.\r\n"
						+ "Os benef�cios podem ser percebidos em qualquer faixa et�ria, mas quanto mais cedo o fumante parar, mais sa�de ele ter�, como refor�a o Minist�rio da Sa�de.");
				this.gastofumo = this.gastofumo *365;
				System.out.println("Essa � a quantia por ano gasta em cigarros: " + this.gastofumo);
			}
			void parabensfumo(){
				System.out.println("-------Feedback sobre Cigarro-------");
				System.out.println("Continue assim, voc� evitar� in�meros riscos a sua sa�de e � importante lembrar que o tabaco causa n�o apenas c�ncer,"
						+ " mas uma s�rie de outras doen�as cr�nicas que tamb�m podem levar � morte, como doen�as cardiovasculares, respirat�rias, enfisemas, bronquite cr�nica.");
			}

			//mal bebe
			void malbebecerveja(){
				System.out.println("Voce est� bebendo "+ latas + " De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� duas latas ( 350ml ) de cerveja por dia");
			}
			void idealbebecerveja() {
				System.out.println("Voc� est� na media de beber cerveja,De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� duas latas ( 350ml ) de cerveja por dia ");
			}
			void malbebedestilado() {
				System.out.println("Voce est� bebendo " + mlsdes+ " De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� uma dose ( 35ml ) de destilados por dia.");
			}
			void idealbebedestilado() {
				System.out.println("Voc� est� na m�dia de beber destilados, De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� uma dose ( 35ml ) de destilados por dia.");
			}
			void malbebevinho() {
				System.out.println("Voce est� bebendo "+ taca + " De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� um c�lice ( 90 ml ) de vinho por dia");
			}
			void idealbebevinho() {
				System.out.println("Voc� est� na media de beber vinho, De acordo com pesquisas da BVS, � recomendado que homens e mulheres n�o excedam uma quantidade de at� uma dose ( 35ml ) de destilados por dia.");
			}
			//maljogos
			void maljogos() {
				System.out.println("-------Feedback Sobre jogos-------");
				System.out.println("Alerta! Voc� est� dentro do que � considerado al�m do seguro. Verifique se esse h�bito n�o est� prejudicando suas rela��es interpessoais (Deixando de interagir com fam�lia e amigos)."
						+ " O excesso tamb�m pode fazer com que deixe de realizar outras atividades e prejudique o seu sono." + "O ideal � 2 horas por dia ou menos e voc� est� " + exchorasj+" horas acima do ideal.");
			}
			void idealjogos() {
				System.out.println("-------Feedback Sobre jogos-------");
				System.out.println("Muito bem! Voc� est� dentro do que � considerado tranquilo. Lembrando que, segundo alguns estudos, jogar videogames faz bem ao c�rebro, desde que n�o seja em excesso.");
			}
			void maljogostrabalha() {
				System.out.println("-------Feedback Sobre jogos-------");
				System.out.println("Sabemos que voc� trabalho com isso,mas alerta! Voc� est� dentro do que � considerado al�m do seguro. Verifique se esse h�bito n�o est� prejudicando suas rela��es interpessoais (Deixando de interagir com fam�lia e amigos)."
						+ " O excesso tamb�m pode fazer com que deixe de realizar outras atividades e prejudique o seu sono." + "O ideal � 2 horas por dia ou menos e voc� est� " + exchorasj+" horas acima do ideal.");
			}
			void idealjogostrabalha() {
				System.out.println("-------Feedback Sobre jogos-------");
				System.out.println("Muito bem! Voc� est� dentro do que � considerado tranquilo mesmo que voc� trabalhe com isso. Lembrando que, segundo alguns estudos, jogar videogames faz bem ao c�rebro, desde que n�o seja em excesso.");
			}
			//malredes
			void aceitavelrede() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Muito bem! voc� est� dentro do aceit�vel.\r\n"
						+ "Um estudo publicado pelo Journal of Social and Clinical Psychology, que concluiu que utilizar as redes sociais por at� 30 minutos por dia pode trazer bons resultados � sa�de mental, mas passar at� 3h n�o afeta tanto.\r\n");
			}
			void alertarede() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Cuidado! Voc� est� em estado de alerta. Passar mais de 3 horas nas redes sociais afeta o sono, induz um comportamento mais sedent�rio durante o dia,aponta estudo na BVS(Biblioteca Virtual em Sa�de).");
			}
			void malrede() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("\r\n"
						+ "Aten��o! O uso das redes sociais em grande escala pode afetar a baixa autoestima, a insatisfa��o pessoal, a depress�o ou hiperatividade e, inclusive, a falta de afeto.\r\n"
						+ "O psiquiatra Cristiano Nabuco, coordenador do grupo de Depend�ncias Tecnol�gicas do Instituto de Psiquiatria do Hospital das Cl�nicas da USP, informa que, quanto mais se busca a perfei��o nas redes sociais e se negligencia a vida real, mais infeliz o usu�rio pode se sentir. �Oitenta e cinco por cento de todas as fotografias que s�o postadas s�o editadas. Isso � um problema, porque se desenvolve uma autoestima virtual e n�o pessoal, e quanto mais o indiv�duo busca se equiparar a essa vida paralela, mais infeliz ele vai se sentir na vida real.� Tira um tempo para respirar da tecnologia e vai interagir pessoalmente com outro.\r\n"
						+ "Fica a dica:\r\n"
						+ "O tempo � algo que n�o podemos nos dar ao luxo de desperdi�ar. Ent�o, o que voc� acha de planejar como us�-lo, assim como faria com dinheiro? \r\n"
						+ " \r\n"
						+ "*Escreva quanto tempo acha que seria razo�vel gastar numa rede social. Depois, veja como se saiu durante um m�s. Se voc� ultrapassou sua meta, fa�a ajustes onde necess�rio.\r\n"
						+ "*Concentre-se no que vai fazer no momento.\r\n"
						+ "*Desligue os seus alertas e notifica��es.\r\n"
						+ "* Escolha momentos para verificar e-mails e redes sociais.\r\n"
						+ "Espero que goste!!\r\n"
						+ "");
			}
			void aceitavelredetrab() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Muito bem!Mesmo trabalhando voc� est� dentro do aceit�vel.\r\n"
						+ "Um estudo publicado pelo Journal of Social and Clinical Psychology, que concluiu que utilizar as redes sociais por at� 30 minutos por dia pode trazer bons resultados � sa�de mental, mas passar at� 3h n�o afeta tanto.\r\n");
			}
			void alertaredetrab() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Sabemos que voc� est� trabalhando,mas Cuidado! Passar mais de 3 horas nas redes sociais afeta o sono, induz um comportamento mais sedent�rio durante o dia,aponta estudo na BVS(Biblioteca Virtual em Sa�de).\r\n"
						+ " ");
			}
			void malredetrab() {
				System.out.println("-------Feedback Sobre as redes sociais-------");
				System.out.println("Tome muito cuidado,sabemos que � por causa do trabalho mas Aten��o! O uso das redes sociais em grande escala pode afetar a baixa autoestima, a insatisfa��o pessoal, a depress�o ou hiperatividade e, inclusive, a falta de afeto.\r\n"
						+ "O psiquiatra Cristiano Nabuco, coordenador do grupo de Depend�ncias Tecnol�gicas do Instituto de Psiquiatria do Hospital das Cl�nicas da USP, informa que, quanto mais se busca a perfei��o nas redes sociais e se negligencia a vida real, mais infeliz o usu�rio pode se sentir. �Oitenta e cinco por cento de todas as fotografias que s�o postadas s�o editadas. Isso � um problema, porque se desenvolve uma autoestima virtual e n�o pessoal, e quanto mais o indiv�duo busca se equiparar a essa vida paralela, mais infeliz ele vai se sentir na vida real.� Tira um tempo para respirar da tecnologia e vai interagir pessoalmente com outro.\r\n"
						+ "Fica a dica:\r\n"
						+ "O tempo � algo que n�o podemos nos dar ao luxo de desperdi�ar. Ent�o, o que voc� acha de planejar como us�-lo, assim como faria com dinheiro? \r\n"
						+ " \r\n"
						+ "*Escreva quanto tempo acha que seria razo�vel gastar numa rede social. Depois, veja como se saiu durante um m�s. Se voc� ultrapassou sua meta, fa�a ajustes onde necess�rio.\r\n"
						+ "*Concentre-se no que vai fazer no momento.\r\n"
						+ "*Desligue os seus alertas e notifica��es.\r\n"
						+ "* Escolha momentos para verificar e-mails e redes sociais.\r\n"
						+ "Espero que goste!!\r\n"
						+ "");
			}
		
}
