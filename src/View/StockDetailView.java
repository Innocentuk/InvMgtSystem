package View;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import data.Item;

import models.MyListTableModel;
import models.StockData;

public class StockDetailView extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JPanel bPanel;
	private JScrollPane scroller;
	JButton editB, deleteB;
	private String [] header = new String [] { "Id", "Product name", "Description", "cost price", "qty", "selling price", "total amount"};
	private MyListTableModel tableModel;
	//private ArrayList<Item> inStock;
	private static ArrayList<Item> inStock;// = new HashMap<String, Item>();
	Locale lc = new Locale("NGA", "NG");
	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(lc);
	
	public StockDetailView () {
		
		setLayout(new BorderLayout());
		tableComponent();
		
		bPanel = new JPanel();
		bPanel.setLayout(new FlowLayout());
		deleteB = new JButton("delete");
		editB = new JButton("edit");
		bPanel.add(deleteB); deleteB.addActionListener(this);
		bPanel.add(editB); editB.addActionListener(this);
		add(bPanel, BorderLayout.SOUTH);
		//add(addB, BorderLayout.WEST);
		//add(editB, BorderLayout.EAST);
		
	}
	private void tableComponent() {

		inStock = new ArrayList<Item>();
		inStock.add(new Item(new Integer(001), "Yanki", "Long and cruly", 10, 500.00, 600.00));
		inStock.add(new Item(new Integer(002), "chocolate Hair", "long and straight", 55, 8000.00, 9500.00));
		inStock.add(new Item(new Integer(003), "chocolate Hair", "short and curly", 70, 7000.00, 8000.00));
		inStock.add(new Item(new Integer(004), "Brazilian hairs", "description2", 20, 1200.00, 1500.00));
		inStock.add(new Item(new Integer(005), "Daniella Hair", "Brazilian 16 inches long", 100, 10000.00, 15000.00));
		inStock.add(new Item(new Integer(006), "Daniella Hair", "Xpression long", 15, 500.00, 600.00));
		
		tableModel = new MyListTableModel(inStock, header);
		table = new JTable();
		table.setModel(tableModel);
		
		/*double amount = StockData.getTotalAmount(null);
		((Object) table).append("\nTotalSellingPrice: " + currencyFormat.format(amount));*/
		
		scroller = new JScrollPane(table);
		table.setPreferredScrollableViewportSize(new Dimension(700, 500));
		add(scroller, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == editB) {
			 new EditStockView();
			 }
			 else if (e.getSource() == deleteB) {
				 new RegisterProduct();
				
			 }
	}

}
