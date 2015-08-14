package data;

public class Price {
	private int id;
	private double UnitPrice;
	private double price;
public Price() {
	// TODO Auto-generated constructor stub
}
public Price(int id, double unitPrice, double price) {
	super();
	this.id = id;
	UnitPrice = unitPrice;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getUnitPrice() {
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
public String toString() {
    return "Item{" +
            "PriceId=" + id +
            ", cost price='" + UnitPrice + '\'' +
            ", sellPrice='" + price + '\'' +
            '}';
}

}
