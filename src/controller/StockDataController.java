package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import data.Item;
import data.Sale;

public class StockDataController implements StockManagement{

	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Sale> sales = new ArrayList<Sale>();
	
	public StockDataController(){
		//Sale sl = new Sale(new Integer(001),new Item(), 500.00, 4, 600.00);
		
		Item good = new Item(new Integer(001), "Yanki", "Long and cruly", 10, 500.00, 600.00);
		Item good1 = new Item(new Integer(002), "chocolate Hair", "long and straight", 55, 8000.00, 9500.00);
		Item good2 = new Item(new Integer(003), "chocolate Hair", "short and curly", 70, 7000.00, 8000.00);
		Item good3 = new Item(new Integer(004), "Brazilian hairs", "description2", 20, 1200.00, 1500.00);
		Item good4 = new Item(new Integer(005), "Daniella Hair", "Brazilian 16 inches long", 100, 10000.00, 15000.00);
		Item good5 = new Item(new Integer(006), "Daniella Hair", "Xpression long", 15, 500.00, 600.00);
		
		items.add(good);
		items.add(good1);
		items.add(good2);
		items.add(good3);
		items.add(good4);
		items.add(good5);
	}
	
	@Override
	public List<Item> getAllGoods() {
		// TODO Auto-generated method stub
		return items;
	}
	
	@Override
	public Item getItem(int id){
		for(Item i : items){
			if(i.getItemID() == id)
				return i;
		}
		return null;
	}

	@Override
	public Sale getSale(int id) {
		for(Sale s: sales){
			if (s.getSaleId() ==id)
				return s;
		}
		return null;
	}

	@Override
	public void saveSale(Sale sale) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy");
		sale.setSaleId(getnewSaleId(df.format(sale.getSaleDate())));
		sales.add(sale);		
	}

	private int getnewSaleId(String format) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void saveItem(Item item) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy");
		//item.setId(getnewItemId(df.format(event.getStartDate())));
		items.add(item);		
	}

	@Override
	public void saveSale(Sale sale, Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateItem(Sale sale, Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSale(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSale(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Sale> getsoldItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
