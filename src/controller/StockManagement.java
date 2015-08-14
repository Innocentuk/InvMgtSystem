package controller;

import java.util.List;

import data.Item;
import data.Sale;

public interface StockManagement {

	List<Item> getAllGoods();
	List<Sale> getsoldItem();
	Sale getSale(int id);
	//List<Item> getElectionsDuringEvent(String eventId);
	Item getItem(int id);
	void saveSale(Sale sale);
	void saveItem(Item item);
	void saveSale(Sale sale, Item item);
	void updateItem(Item item);
	void updateItem(Sale sale, Item item);
	void updateSale(Sale sale);
	void deleteItem(Item item);
	void deleteSale(Sale sale);
	void deleteItem(int id);
}
