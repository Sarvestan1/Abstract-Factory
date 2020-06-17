package Garden;

public class JapaneseGardenMaker implements GardenFactory{

	@Override
	public Flower plantFlower() {
		return new Hibiscus();
	}

	@Override
	public Tree plantTree() {
		return new Elm();
	}

}
