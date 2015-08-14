package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import models.MyListTableModel;
import models.StockData;
import data.Item;
import data.ProductListObject;

public class EditStockView extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
		//DefaultListModel<ProductListObject> productModel;
		//JList<ProductListObject> productList;
		Item item = new Item();
		StockData newDataReg;
		StockDetailView stockView;
		Locale lc = new Locale("NGA", "NG");
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(lc);
		
		JButton save;
		JLabel infoL, idL, nameL, descpL, priceL, qtyL, sellPriceL, supplierNameL;
		JTextField idT, nameT, descpT, priceT, qtyT, sellPriceT, supplierNameT;
		
		private String [] header = new String [] { "Id", "Product name", "Description", "Unit price", "qty", "selling price", "supplier", "total cost", "total amount"};
		private JTable table;
		private MyListTableModel tableModel;
		private ArrayList<Item> itemList = new ArrayList<Item>();
		
		public static JTextArea displayArea = new JTextArea();
		public static Boolean regCreated = new Boolean(false);
		
		public EditStockView() {
			//registerId = "-1";
			setLayout(new FlowLayout());
			
			JPanel layer = new JPanel();
			layer.setBounds(61, 11, 81, 140);
	        layer.setLayout(new BoxLayout(layer, BoxLayout.Y_AXIS));
			JPanel contentP = new JPanel();
			contentP.setLayout(new FlowLayout());
			
			infoL = new JLabel("Register product details: ");
			infoL.setFont(new Font("Algerian", Font.PLAIN, 14));
			infoL.setForeground(Color.BLACK);
			
			idL= new JLabel("Item No ");
			nameL= new JLabel("Product name ");
			descpL= new JLabel("Product description ");
			priceL= new JLabel("Product cost price ");
			qtyL= new JLabel("Quantity ");
			sellPriceL= new JLabel("Product selling price ");
			supplierNameL= new JLabel("Supplier name: ");
			
			idT = new JTextField(2);
			nameT = new JTextField(5);
			descpT = new JTextField(10);
			priceT = new JTextField(2);
			qtyT = new JTextField(2);
			sellPriceT = new JTextField(2);
			supplierNameT = new JTextField(5);
			
			//add labels and fields to the panel
			save = new JButton("Add");
			contentP.add(save);
			save.addActionListener(this);
			layer.add(infoL);
			layer.add(idL); layer.add(idT);
			layer.add(nameL); layer.add(nameT);
			layer.add(descpL); layer.add(descpT);
			layer.add(priceL); layer.add(priceT);
			layer.add(qtyL); layer.add(qtyT);
			layer.add(sellPriceL); layer.add(sellPriceT);
			layer.add(supplierNameL); layer.add(supplierNameT);
			setVisible(true);
			// display panel
			JPanel display = new JPanel();
			display.setLayout(new BorderLayout());
			//productModel = new DefaultListModel<ProductListObject>();
			//productList = new JList<ProductListObject>(productModel);
			/*tableModel = new MyListTableModel(itemList, header);
			table = new JTable();
			table.setModel(tableModel);*/
			stockView = new StockDetailView();
			
			JScrollPane scrollP = new JScrollPane(stockView);//(productList);//(table);
			
			displayArea.setEditable(false);
			display.add(scrollP);// add the area
			
			// add all panels to the frame.
			add(layer, "West");
			add(contentP, "South");
			add(display, "East");
		}
		/*public ArrayList<Item> getItemList() {
			return this.itemList;
		}*/
		public void addItem(){
			//Item item = new Item();
			item.setItemID(Integer.parseInt(idT.getText()));
			idT.setText("");
			
			item.setName(nameT.getText());
			nameT.setText("");
			
			item.setDescription(descpT.getText());
			descpT.setText("");
			
			item.setUnitPrice(Double.parseDouble(priceT.getText()));
			priceT.setText("");
			
			item.setQty(Integer.parseInt(qtyT.getText()));
			qtyT.setText("");
			
			item.setPrice(Double.parseDouble(sellPriceT.getText()));
			sellPriceT.setText("");
			
			newDataReg.setSupplier(supplierNameT.getText());
			supplierNameT.setText("");
			
			newDataReg.addItem(item);
			//displayFirst();
			displayAddedProduct();
		}
		
		public void displayAddedProduct(){
			
			//addItem();
			String txt = new String();
			txt = "Product was added to the inventory at: " + newDataReg.getStockDate() + "\r\n";
			for(Item i : newDataReg.getItemList()){
			txt += "\tProduct No: " + item.getItemID() + "\r\n";
			txt += "\tProduct name: " + item.getName() + "\r\n";
			txt += "\tProduct description: " + item.getDescription() + "\r\n";
			txt += "\tProduct cost price: " + currencyFormat.format(item.getUnitPrice()) + "\r\n";
			txt += "\tProduct quantity added: " + item.getQty() + "\r\n";
			txt += "\tProduct selling price: " + currencyFormat.format(item.getPrice()) + "\r\n";
			txt += "\tProduct suppling company name: " + newDataReg.getSupplier()+ "\r\n";
			txt += "\tProduct total cost amount: " + currencyFormat.format(item.TotalCostPrice()) + "\r\n";
			txt += "\tProduct total selling amount: " + currencyFormat.format(item.TotalSellingPrice()) + "\r\n";
			}
			//displayArea.setText(txt);
			//table.setToolTipText(txt);
			//productList.setToolTipText(txt);
			stockView.setToolTipText(txt);
			this.setVisible(true);
		}
	/*	public void addEventToList(ProductListObject product){
			productModel.addElement(product);
		}

		public DefaultListModel<ProductListObject> getProductModel() {
			return productModel;
		}

		public void setEventsModel(DefaultListModel<ProductListObject> productModel) {
			this.productModel = productModel;
		}
		public JList<ProductListObject> getProductList() {
			return productList;
		}

		public void setEventList(JList<ProductListObject> productList) {
			this.productList = productList;
		}*/
		
		public JButton getBtnAddProduct() {
			return save;
		}

		public void setBtnAddProduct(JButton addB) {
			this.save = addB;
		}
		/*public void displayFirst() {
			displayAddedProduct(0);
			currentIndex = 0;
			}*/
		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getSource().equals(save)){
				if(idT.getText().equals(""))
					JOptionPane.showMessageDialog(null, "You forgot to enter product id!");
				
				else if(nameT.getText().equals(""))
					JOptionPane.showMessageDialog(null, "You forgot to enter product name!");
				
				else if(descpT.getText().equals(""))
					JOptionPane.showMessageDialog(null, "You forgot to enter product  description!");
				
				else if(qtyT.getText().equals(""))
					JOptionPane.showMessageDialog(null, "You forgot to enter product quantity!");
				
				else if(priceT.getText().equals(""))
					JOptionPane.showMessageDialog(null, "You must enter product cost price!");
				
				else if(sellPriceT.getText().equals(""))
					JOptionPane.showMessageDialog(null, "You forgot to enter the selling price!");
				
				else{
					Boolean pass = new Boolean(true);
					try{
						Integer.parseInt(qtyT.getText());
						Integer.parseInt(idT.getText());
						Double.parseDouble(priceT.getText());
						Double.parseDouble(sellPriceT.getText());
						
					}catch(NumberFormatException nfe){
						pass = false;
						qtyT.setText("");
						idT.setText("");
						priceT.setText("");
						sellPriceT.setText("");
						JOptionPane.showMessageDialog(null, "You must enter number in id, quantity, prices fields!");
					}
					if (pass){
						if(!regCreated){
							regCreated = true;
							newDataReg = new StockData();
						}
						addItem();
					}
				}
				//toAdd();
			}
			
	}

}
