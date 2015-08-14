package controller;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import View.EditStockView;
import View.MasterWindow;
import View.RegisterProduct;
import View.SearchStockView;
import View.StockDetailView;

public class StockEditorController {
	StockDetailView stockView;
	SearchStockView checkStock;
	RegisterProduct addProduct;
	EditStockView editStock;
	ActionListener actionListener;
	StockManagement stockInterface;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
	
	public StockEditorController (StockDetailView stockView, SearchStockView checkStock, RegisterProduct addProduct, EditStockView editStock, StockManagement stockInterface){
		this.stockView = stockView;
		this.checkStock = checkStock;
		this.addProduct = addProduct;
		this.editStock = editStock;
		
		new MasterWindow();
	}

}
