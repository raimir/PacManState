package estados;
import pacman.Comida;
import pacman.PacMan;

public interface IEstado {
	
	public void mudarEstado(Comida comida, PacMan p);
}