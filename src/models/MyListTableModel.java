package models;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.table.AbstractTableModel;

import data.Item;

public class MyListTableModel extends AbstractTableModel {

	private static final int ITEM_INSTOCK = 0;
	private static final int ITEM_DAMAGED = 1;
	private static final int ITEM_SOLD = 2;
	private static final int ON_CREDIT = 3;
	
	private String[] header = {"Id", "Product name", "Description", "Unit price", "Qty", "Selling Price"};
	private int dataState = ITEM_INSTOCK;
	private ArrayList<Item> instock;
	private ArrayList <Item> damaged;
	private ArrayList <Item> soldItem;
	private ArrayList <Item> boughtOnCredit;

	public void setDataState(int state){
        this.dataState = state;
   }
	 public MyListTableModel(ArrayList<Item> inStock, /*ArrayList <Item> damaged, ArrayList <Item> soldItem, ArrayList <Item> boughtOnCredit,*/ String[] header)
	 {
	 this.instock = inStock;
	 /*this.damaged = damaged;
	 this.soldItem = soldItem;
	 this.boughtOnCredit = boughtOnCredit;*/
	 this.header = header; 
	 }
	 
	 public int getRowCount()
	 {
		/* if(dataState == ITEM_INSTOCK){  // unfiltered data
	            return  allInstock.size();
	        } else if(dataState == ITEM_DAMAGED){
	            return  damaged.size();
	        }else if(dataState == ITEM_SOLD){
	            return soldItem.size();
	        }else if(dataState == ON_CREDIT){
	            return boughtOnCredit.size();
	        }*/
	 return instock.size();
	 }

	 public int getColumnCount()// column number
	 {
	 return header.length;
	 }
	 
	 //@Override
	    public Class<?> getColumnClass(int columnIndex) {
	        return Object.class;  //all indexes will be displayed as label
	    }
	   // @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	        return false;
	    }

	 public Object getValueAt(int rowIndex, int columnIndex) {
		// do whatever you want to display in table
		 Item goods = null;
	        if(dataState == ITEM_INSTOCK){  // unfiltered data
	        	goods = instock.get(rowIndex);
	        } else if(dataState == ITEM_DAMAGED){
	        	goods = damaged.get(rowIndex);
	        }else if(dataState == ITEM_SOLD){
	        	goods = soldItem.get(rowIndex);
	        }else if(dataState == ON_CREDIT){
	        	goods = boughtOnCredit.get(rowIndex);
	        }
	        /*String key = idField.getText();
			 String name = StockData.getName(key);
			 String description = StockData.getDescription(key)
			 
		information.setText(name);
			 information.setText(description);
			 information.append("\nPrice: " + currencyFormat.format(StockData.getPrice(key)));
			 information.append("\nNumber in stock: " + StockData.getQuantity(key));
			 information.append("\nTotalSellingPrice: " + currencyFormat.format(StockData.getTotalAmount(key)));
			 //information.append("\nNumber in stock: " + StockData.getQuantity(key));
*/
	        if (columnIndex == 0) {
	            return goods.getItemID();
	        }else if(columnIndex == 1){
	            return goods.getName();
	        }else if(columnIndex == 2){
	            return goods.getDescription();
	        }else if(columnIndex == 3){
	            return goods.getUnitPrice();//.getPrice();
	        }else if(columnIndex == 4){
	            return goods.getQty();//.getPrice();
	        }else if(columnIndex == 5){
	            return goods.getPrice();//.getPrice();
	        }else if(columnIndex == 7){
	            return goods.getTotalAmount();
	        }
	        return null;//list.get(rowIndex);
	 }

	 public void setValueAt(Object object,int rowIndex, int columnIndex)
	 {
		 //Table is not editable,
	 }
	 public String getColumnName(int columnIndex) {
	 return header[columnIndex];
	 }

}
