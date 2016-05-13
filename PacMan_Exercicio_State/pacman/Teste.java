package pacman;

public class Teste {

	public static void main(String[] args) {
		
		PacMan pacman = new PacMan();
		
		Comida biscoito = new Comida("biscoito", 1);
		Comida vitamina = new Comida("vitamina", 10);
		Comida veneno = new Comida("veneno", -1);		
		
		pacman.comer(vitamina);
		System.out.println(pacman);
		pacman.comer(veneno);
		
		System.out.println(pacman);
		pacman.comer(veneno);

		System.out.println(pacman);		
	}

}
