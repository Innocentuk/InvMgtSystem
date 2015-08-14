package data;

public class Item {
	
	private int itemID;
	private String name;
	private String description;
	private Price price;
	//int qty;
	//private double UnitPrice;
	//private double price;
	//private double totalAmount;
	
	public Item(int id, String name, String dscp, Price price){
		this.itemID = id;
		this.name = name;
		this.description = dscp;
		this.price = price;
		/*this.qty = qty;
		this.UnitPrice = UPrice;
		this.price = price;*/
	}
	public Item(){
		
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	/*public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}*/
	/*public double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double TotalCostPrice(){
		return qty * UnitPrice;
		
	}
	public double TotalSellingPrice(){
		return qty * price;
	}*/
	@Override
    public String toString() {
        return "Item{" +
                "ItemId=" + itemID +
                ", Name='" + name + '\'' +
                ", ItemDescription='" + description + '\'' +
               /* ", Quantity='" + qty + '\'' +
                ", UnitPrice='" + UnitPrice + '\'' +
                ", Price='" + price + '\'' +
                ", TotalAmount='" + totalAmount + '\'' +*/
                '}';
    }
	
}
