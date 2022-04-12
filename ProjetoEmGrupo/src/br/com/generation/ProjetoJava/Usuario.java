package br.com.generation.ProjetoJava;

public class Usuario {

	//atributos
			private String nome;
			private int idade;
			
			//metodo construtor para receber os dados do usuario
			Usuario(String nome,int idade){
				this.nome = nome;
				this.idade = idade;
			}
			
			//getter and setters

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public int getIdade() {
				return idade;
			}

			public void setIdade(int idade) {
				this.idade = idade;
			}


}
