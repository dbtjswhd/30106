package test_0315;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemom pikachu = new Pokemom("피카츄", 4, "물");
		Pokemom pairi = new Pokemom("파이리", 4, "불");
		pikachu.showInformation();
		pairi.showInformation();
	}

}
class Pokemom {
	String PokeName="";
	int legs=0;
	String skill="";
	public Pokemom(String PokeName,int legs,String skill) {}
	public void showInformation() {
		System.out.println(PokeName);
		System.out.println(legs);
		System.out.println(skill);
	}
	
	
}
