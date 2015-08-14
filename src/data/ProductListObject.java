package data;

public class ProductListObject {
	
	private Item item;
	//private String type;
	public ProductListObject(Item item){
		this.item = item;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String toString(){
		return item.toString();
	}
}
