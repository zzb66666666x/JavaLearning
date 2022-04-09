package person;

import animal.abstractclass.Dog;

public class SingingDog extends Dog implements Singable {

	@Override
	public void sing() {
		System.out.println("The dog sings. The crowd applaud.");
	}

}
