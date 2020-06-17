package Garden;

public class PersianGardenMaker implements GardenFactory {

	@Override
	public Flower plantFlower() {	
		return new Jasmine();
	}

	@Override
	public Tree plantTree() {
		return new Cypress();
	}

}
