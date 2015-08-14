package View;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import models.StockData;

public class SearchStockView extends JPanel implements ActionListener{
	
	 /*JList<StockData> stockList;
	 private DefaultListModel<StockData> itemModel;*/
	 JTextField idField;// = new JTextField(7);
	 TextArea information; //= new TextArea(3, 50);
	 JButton checkB;// = new JButton("Check Stock");
	 JLabel checkL;
	 Locale lc = new Locale("NGA", "NG");
	 NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(lc);
	 
	 public SearchStockView() {
		 setBackground(new Color(240, 240, 240));
			setBounds(100, 150, 500, 150);
			setBorder(new EmptyBorder(5, 5, 5, 5));
			setLayout(new BorderLayout(0, 0));
			
			JPanel leftPanel = new JPanel();
			add(leftPanel, BorderLayout.WEST);
			leftPanel.setLayout(new GridLayout(0, 1, 0, 0));
			
			JPanel checkStockPanel = new JPanel();
			leftPanel.add(checkStockPanel);
			checkStockPanel.setLayout(new BorderLayout());
			
			JPanel checkBPanel = new JPanel();
			checkStockPanel.add(checkBPanel, BorderLayout.NORTH);
			checkBPanel.setLayout(new FlowLayout());
			
			checkB = new JButton("Check Stock");
			checkB.addActionListener(this);
			idField = new JTextField(7);
			checkL = new JLabel("Enter Product number");
			checkBPanel.add(checkL);
			checkBPanel.add(idField);
			checkBPanel.add(checkB, "South");
			
			information = new TextArea(3, 5);
			//information.setPreferredSize(new Dimension(50, 100));
			//information.
			JScrollPane scrollPane_1 = new JScrollPane(information);
			checkStockPanel.add(scrollPane_1, BorderLayout.CENTER);
	 }
	 
	 public void actionPerformed(ActionEvent e) {
		 String key = idField.getText();
		 String name = StockData.getName(key);
		 String description = StockData.getDescription(key);
		 if (name == null) {
			 information.setText("No such item in stock");
		 }
		 else {
			 information.setText(name);
			 information.setText(description);
			 information.append("\nPrice: " + currencyFormat.format(StockData.getPrice(key)));
			 information.append("\nNumber in stock: " + StockData.getQuantity(key));
			 information.append("\nTotalSellingPrice: " + currencyFormat.format(StockData.getTotalAmount(key)));
			 //information.append("\nNumber in stock: " + StockData.getQuantity(key));
		 }
	}

}
