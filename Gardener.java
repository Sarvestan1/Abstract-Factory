package Garden;

public class Gardener {
	
	private Tree tree;
	private Flower flower;
	
	public Gardener(GardenFactory gardenFactory) {
		flower = gardenFactory.plantFlower();
		tree = gardenFactory.plantTree();
		
	}

	
	public void demo_Garden() {
		flower.print();
		tree.print();
	}

}
