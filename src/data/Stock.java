package data;

import java.util.Date;

public class Stock {

	private int stockId;
	private Item item;
	private Price price;
	private Date date;
	private int qty;
	private double amount;
	
	public Stock( int id, Item item, Date date, int qty, double amount, Price price){
		this.stockId = id;
		this.item = item;
		this.price = price;
		this.date = date;
		this.qty = qty;
		this.amount = amount;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getQty() {
		int count = 0;
		qty += count;
		count ++;
		return count;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getAmount() {
		amount = qty * Price.getPrice;
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
    public String toString() {
        return "Item{" +
        		"SaleId= " + stockId + 
                "ItemName= " + item +
                "ItemPrice= " + price +
                "total stock= " + qty +
                "total amount=" + amount +
                "date added=" + date +
                '}';
    }
}
