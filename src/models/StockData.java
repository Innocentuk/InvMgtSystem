package models;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import data.Item;


public class StockData {

			// with a Map you use put to insert a key, value pair
			 // and get(key) to retrieve the value associated with a key
			 private static Map<String, Item> stock = new HashMap<String, Item>();// check product list
			 private ArrayList<Item> itemList = new ArrayList<Item>();// added product list
			 private String stockDate;
			 private String supplier;
				
			 public StockData() {
				 Date date = new Date();
					//DateFormat idFormat = new SimpleDateFormat("yyMMddHHmm");
					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy, HH:mm");
					//setCustomerId(Long.parseLong(idFormat.format(date)));
					setStockDate(dateFormat.format(date));
			}

			 static {
			 // all keys are 3 digit Strings
				 stock.put("001", new Item(1, "Yanki", "Long and cruly", 10, 500.00, 600.00));
				 stock.put("002", new Item(2, "chocolate Hair", "long and straight", 55, 8000.00, 9500.00));
				 stock.put("003", new Item(3, "chocolate Hair", "short and curly", 70, 7000.00, 8000.00));
				 stock.put("004", new Item(4, "Brazilian hairs", "description2", 20, 1200.00, 1500.00));
				 stock.put("005", new Item(5, "Daniella Hair", "Brazilian 16 inches long", 100, 10000.00, 15000.00));
				 stock.put("006", new Item(6, "Daniella Hair", "Xpression long", 15, 500.00, 600.00));
			 }
			 
			 public String getStockDate(){
					return this.stockDate;
			}
				
			public void setStockDate(String value){
					this.stockDate = value;
			}
			
			public void setSupplier(String name) {
				this.supplier = name;
			}
			
			public String getSupplier(){
				return supplier;
			}
			
			public void addItem(Item item) {
				itemList.add(item);
			}
			
			public ArrayList<Item> getItemList() {
				return this.itemList;
			}
			
			/*public double getNumOfItems(){
				this.numOfItems = 0;
				for(Item item : itemList){
					numOfItems += item.getTotalAmount();
				}
				return numOfItems;
			}*/
			
			 public static String getName(String key) {
				 Item item = stock.get(key);
				 if (item == null) return null; // null means no such item
				 else return item.getName();
				}
			 
			 public static String getDescription(String key) {
				 Item item = stock.get(key);
				 if (item == null) return null; // null means no such item
				 else return item.getDescription();
				}
			 
			 public static double getUnitPrice(Integer key) {
				 Item item = stock.get(key);
				 if (item == null) return -1.0; // negative price means no such item
				 else return item.getUnitPrice();
				 }

				public static double getPrice(String key) {
				 Item item = stock.get(key);
				 if (item == null) return -1.00; // negative price means no such item
				 else return item.getPrice();
				 }

				 public static int getQuantity(String key) {
				 Item item = stock.get(key);
				 if (item == null) return -1; // negative quantity means no such item
				 else return item.getQty();
				 }
				 public static double getTotalAmount(String key) {
					 Item item = stock.get(key);
					 if (item == null) return -1.00; // negative price means no such item
					 else return item.TotalSellingPrice();
					 }
				// update stock levels
				 // extra is +ve if adding stock
				 // extra is -ve if selling stock
				 public static void update(String key, int extra) {
				 Item item = stock.get(key);
				 if (item != null) item.setQty(item.getQty() + extra);
				 }
				 
				 public static void close() {
					 // Does nothing for this static version.
					 // Write a statement here to close the
					 // database or file as and when you use one.
						 //System.exit(0);
					 }
}
