package pacman;
import estados.IEstado;


public class PacMan 
{
   private String nome;
   private IEstado estado;
   private int energia;
   private int velocidade;
   
   public PacMan() 
   {    
   }
   
   public String toString() {
	   return "PacMan com energia = " + energia +
	          " e velocidade = " + velocidade;
   }
   
   public void comer(Comida comida){
  		estado.mudarEstado(comida, this);
   }

	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public IEstado getEstado() {
		return estado;
	}
	
	public void setEstado(IEstado estado) {
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
  
}