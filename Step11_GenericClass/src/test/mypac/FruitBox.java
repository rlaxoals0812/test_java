package test.mypac;

public class FruitBox<t> {
	private t item;
	
	public void pack(t item) {
		this.item = item;
	}
	
	public t unPack() {
		return item;
	}
}
