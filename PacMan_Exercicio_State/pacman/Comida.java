package pacman;

public class Comida {
	private String nome;
	private int energia;
	
	
	public Comida(String nome, int energia) {
		this.nome = nome;
		this.energia = energia;
	}

	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
