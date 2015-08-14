package models;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;

import data.ProductListObject;

import ViewStyle.Style;

public class CellRenderer implements ListCellRenderer<ProductListObject>{ //extends DefaultTableCellRenderer{
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	int goods;
	ArrayList<Integer> inStock;
	ArrayList<Integer> damaged;
	ArrayList<Integer> sold;
	ArrayList<Integer> onCredit;
	
	// get info from the database
	public CellRenderer (int goods){
		this.goods = goods;
		//inStock = goods.get
	}
	/*public Component getTableCellRendererComponent(JTable itemTable, Object value, boolean isSelected, boolean hasFocus, int row, int column){
		JLabel label = (JLabel) super.getTableCellRendererComponent(itemTable, value, isSelected, hasFocus, row, column);
		if(inStock.contains(row)){
			label.setBackground(Color.BLUE);
		}else if(damaged.contains(row)){
			label.setBackground(Color.RED);
		}else if(sold.contains(row)){
			label.setText("are sold out");
		}else if(onCredit.contains(row)){
			label.setText("is sold on credit, not paid");
		}else{
			label.setBackground(Style.getDefaultColor());
		}
		return label;
	}*/
	@Override
	public Component getListCellRendererComponent(
			JList<? extends ProductListObject> list, ProductListObject value,
			int index, boolean isSelected, boolean cellHasFocus) {
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
	  	//renderer.setIcon(new ImageIcon(value.getImg(value.getImg())));
	  	renderer.setText(value.getItem().toString());
	  	//renderer.setFont( value.getListFont());
		return renderer;
	}
}
