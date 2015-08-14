package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;


public class MasterWindow extends JFrame implements ActionListener{
	
	private RegisterProduct addProduct;
	private EditStockView edditItem;
	private SearchStockView checkProduct;
	private StockDetailView viewStock;
	//JButton check = new JButton("search stock");
	 //JButton sold = new JButton("View sold items");
	 //JButton update = new JButton("Update stock");
	 JButton add = new JButton("Add product");
	 //JButton stock = new JButton("view stock detail");
	 JButton sale = new JButton("record sale");
	 JButton quit = new JButton("Exit");
	 JTabbedPane tabbedPane;
	 JPanel contentPane = new JPanel();
	 
	 public MasterWindow(){
		 
		 setBounds(100, 60, 1500, 800);
		 setBackground(new Color(53, 56, 64));
		 //setSize(800, 600);
		 setTitle("Inventory Management System");
		 // close application only by clicking the quit button
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 contentPane.setBorder(new EmptyBorder (5, 5, 5, 5));
		 contentPane = new JPanel(new BorderLayout());
		 setContentPane(contentPane);
		 
		 JPanel homeP = new JPanel();
		 JLabel lab1 = new JLabel("Chimoris Fashion Nig LTD");
		 lab1.setFont(new Font("Algerian", Font.PLAIN, 16));
		 lab1.setForeground(Color.BLACK);
		//ImageIcon icon = new ImageIcon()
		 lab1.setIcon(new ImageIcon("home1.png"));
		 homeP.setBackground(Color.ORANGE);
		 homeP.add(lab1);
		 contentPane.add(homeP, BorderLayout.NORTH);
		 
		 JPanel layer2 = new JPanel();
		 tabbedPane = new JTabbedPane();
		 
		 JPanel stockDetailP = new StockDetailView();
		 tabbedPane.addTab("veiw stock", stockDetailP);
		 
		 JPanel checkStockP = new SearchStockView();
		 tabbedPane.addTab("check product", checkStockP);//new SearchStockView());
		 //tabbedPane.setSelectedIndex(0);
		 
		 JPanel soldItemP = new ViewSoldProducts();
		 tabbedPane.addTab("view sold goods", soldItemP);
		 
		 JPanel editStockP = new EditStockView();
		 tabbedPane.addTab("edit product detail", editStockP);
		 
		 JPanel addProduct = new RegisterProduct();
		 tabbedPane.addTab("Add product", addProduct);
		 layer2.add(tabbedPane);
		 contentPane.add(layer2, "Center");
		 
		JPanel btnP = new JPanel();
		 //btnP.setLayout(new GridLayout(1, 1));
		 //quit.setBounds(40,100,100,60);
		 btnP.add(add); add.addActionListener(this);
		 btnP.add(quit); quit.addActionListener(this);
		//layer2.add(stock); //stock.addActionListener(this);
		  //check.addActionListener(this);
		 //layer2.add(update); //update.addActionListener(this);
		 //layer2.add(sold); //sold.addActionListener(this);
		 //layer2.add(sale); //sale.addActionListener(this);
		 contentPane.add(btnP, "East");
		 
		 setVisible(true);
		 
		 }
	 
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == add) {
			 new RegisterProduct();
		 }
		 else if (e.getSource() == quit) {
			// StockData.close();
			 System.exit(0);
		 }
		}
}
