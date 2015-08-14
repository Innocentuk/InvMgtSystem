package data;
import java.util.Date;



public class Sale {
	
	private Item item;
	private int saleId;
	private Date saleDate;
	private int qty;
	private double price;
	double totalAmount;
	
	public Sale (int id, Item item, int qty, double price, double totalAmount, Date saleDate) {
		
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	public double getTotalAmount() {
		return totalAmount = qty * price;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
    public String toString() {
        return "Item{" +
        		"SaleId= " + saleId + 
                "ItemName=" + item +
                '}';
    }
	
	
}
