package Bomboniere.model;

public class Produto {

	private String nome;
	private int id;
	private int tipo;
	
	public Produto(String nome, int id, int tipo) {
		this.nome = nome;
		this.id = id;
		this.tipo = tipo;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1: 
			tipo = "Bala";
			break;
		case 2:
			tipo = "Pirulito";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("\n\n*********************DOCES*********************************");
		System.out.print("| Nome: " + this.nome+ "\n|");
		System.out.print("| Id: " + this.id+ "\n");
		System.out.print("| Tipo da Doce: " +tipo+ "\n|");
		System.out.print("|-----------------------------\n|");
		

	}
	
}
