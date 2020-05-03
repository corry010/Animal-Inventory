import java.util.ArrayList;

public class Main {




	public static void main(String[] args){


		ArrayList<Animal> myAnimals =  new ArrayList<Animal>();

		myAnimals.add(new Animal("cow",43.8, 125.50));
		myAnimals.add(new Animal("chicken", 3.6, 5.75));

		for(Animal animals: myAnimals){
			System.out.println(animals);
		}


		

	}
}