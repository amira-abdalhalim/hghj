/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.util.Scanner;

/**
 *
 * @author 24990
 */

  
   public class EcommerceSystem {
    public static void main(String[] args) {
  
    Scanner input=new Scanner(System.in);
       
        
        System.out.println("enter your ID:");
        int customerId = input.nextInt();
        input.nextLine();
        
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        
        System.out.println("Please enter your address:");
        String address = input.nextLine();
        
        Customer c1 = new Customer(customerId, name, address);
        
        System.out.println("How many products would you like to add to your cart?");
        int nProducts = input.nextInt();
        
        Cart cart = new Cart(customerId, nProducts);
        
        ElectronicProduct E1= new ElectronicProduct(1, "smartPhone", 599.9f, "samsung", 1);
        ClothingProduct Cc= new ClothingProduct(1, "Smartphone", 599.9f, "Samsung", "cotton");
        BookingProduct B1=new BookingProduct(3, "OOP", 39.99f, "O’Reilly", "X Publications");
        
         
        
        for (int i = 0; i < nProducts; i++) {
            System.out.println("Which product would you like to add? 1-SmartPhone 2-T-shirt 3-OOP");
            int choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {
                case 1:
                    cart.addProduct(E1,i);
                    break;
                case 2:
                    cart.addProduct(Cc,i);
                    break;
                case 3:
                    cart.addProduct(B1,i);
                    break;
                default:
                    System.out.println("not found !");
            }
        }
        
        System.out.println("Your total is $" + cart.CalculateProduct() + ". Would you like to place the order?/choose a number/ 1-Yes 2-No");
        int x = input.nextInt();
        if (x == 1) {
          
            Order order = new Order(c1.getcustomerid(), 1, cart.getProducts());
            
            order.printOrderInfo();
        } else {
            System.out.println("Bye,thank you ");
            
        }

       }}