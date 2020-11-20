package com.cg.healthAssist;

import java.util.List;
import java.util.Scanner;

import com.cg.healthAssist.model.Medicine;
import com.cg.healthAssist.model.Order;
import com.cg.healthAssist.serviceimpl.MedicineServiceImpl;
import com.cg.healthAssist.serviceimpl.OrderServiceImpl;

/**
 * Main class will get inputs from the user depending upon the Menu provided
 * 
 * @author Hemalatha S
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cont = 1;
		do {
			/*
			 * Menu for the Medical Store
			 */
			System.out.println("------MedicalStore Menu------");
			System.out.println("1.Add Medicine");
			System.out.println("2.Update Medicine");
			System.out.println("3.Remove Medicine");
			System.out.println("4.View Orders");
			System.out.println("5.Deliver Order");
			System.out.println("6.View Order History");
			System.out.println("7.Exit");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			/*
			 * Invoking MedicineServiceImpl and OrderServiceImpl
			 */
			MedicineServiceImpl medicineService = new MedicineServiceImpl();
			OrderServiceImpl orderService = new OrderServiceImpl();

			switch (choice) {
			/*
			 * The admin need to enter the details to add the medicine details
			 */
			case 1:
				System.out.println("Enter the  medicineId");
				long id = scan.nextLong();
				System.out.println("Enter the medicine name");
				String name = scan.next();
				System.out.println("Enter the price");
				double price = scan.nextDouble();
				System.out.println("Enter the expiry date");
				String expiryDate = scan.next();
				System.out.println("Enter the company name");
				String companyName = scan.next();
				System.out.println("Enter the stock");
				int stock = scan.nextInt();
				Medicine medicine = new Medicine(id, name, price, expiryDate, companyName, stock);
				medicineService.addMedicine(medicine);
				break;
			/*
			 * In this case admin will enter the details to updated in the medicine
			 */
			case 2:
				System.out.println("Enter the  medicineId");
				long updateId = scan.nextLong();
				System.out.println("Enter the medicine name");
				String updateName = scan.next();
				System.out.println("Enter the price");
				double updatePrice = scan.nextDouble();
				System.out.println("Enter the expiry date");
				String updateExpiryDate = scan.next();
				System.out.println("Enter the company name");
				String updateCompanyName = scan.next();
				System.out.println("Enter the stock");
				int updateStock = scan.nextInt();
				Medicine medicine1 = new Medicine(updateId, updateName, updatePrice, updateExpiryDate,
						updateCompanyName, updateStock);
				medicineService.updateMedicine(medicine1);
				break;
			/*
			 * The admin can remove details of medicine by giving medicinId
			 */
			case 3:
				System.out.println("Enter the id to be removed");
				long removeId = scan.nextLong();
				medicineService.removeMedicine(removeId);
				break;
			/*
			 * The admin can view the list of orders
			 */
			case 4:
				List<Order> orderList = orderService.viewOrders();
				for (Object o : orderList) {
					System.out.println(o);
				}
				break;
			/*
			 * The delivered order details will remove the from the database after delivery
			 */
			case 5:
				System.out.println("Enter the order Id to be delivered");
				long deliverId = scan.nextLong();
				orderService.deliverOrder(deliverId);
				break;
			/*
			 * The admin can view the previous orders by giving the orderId
			 */
			case 6:
				Order order = new Order();
				System.out.println("Enter the order Id to view the order history");
				long orderId = scan.nextLong();
				order = orderService.viewOrderHistory(orderId);
				System.out.println(order);
				break;
			/*
			 * The admin can exit the menu if he press 0
			 */
			case 7:
				System.out.println("Enter 0 to exit");
				cont = scan.nextInt();
				break;
			default:
				System.out.println("Choose valid option");
				break;

			}
		} while (cont != 0);
       scan.close();
	}
}
