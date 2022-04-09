package animal;

public class App {
	public static void main(String[] args) {

		// using abstract class
		animal.abstractclass.Animal[] an1 = { new animal.abstractclass.Cat(), new animal.abstractclass.Dog() };

		for (animal.abstractclass.Animal a : an1) {
			a.sleep();
			a.eat();
			a.makeSound();
		}

		// counts the number of animals created
		System.out.println(animal.abstractclass.Animal.count);

		// using interface
		animal.intrface.Animal[] an2 = { new animal.intrface.Cat(), new animal.intrface.Dog() };

		for (animal.intrface.Animal a : an2) {
			a.sleep();
			a.eat();
			a.makeSound();
		}
	}
}
