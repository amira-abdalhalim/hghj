/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author 24990
 */
 
public class Order {
    protected int customerId;
    protected int orderId;
    protected Product[] Products;
    protected float totalPrice;

    public Order(int customerId,int orderId ,Product[] Products) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.Products =Products ;
        this.totalPrice = Math.abs(totalPrice);
    }
    private double calculateTotalPrice(){
        double total=0;
        for(int i=0;i<Products.length;i++){
            if(Products[i]!=null){
                total+=Products[i].getprice();
            }
            
        }
        return total;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product[] getProducts() {
        return Products;
    }

    public void setProducts(Product[] Products) {
        this.Products = Products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void printOrderInfo(){
        System.out.println("Here is your Order summary:");
        System.out.println("your orderId:"+orderId);
        System.out.println("your customer ID:"+customerId);
        System.out.println("the Products:");
        for(int i=0;i<Products.length;i++){
            if(Products[i]!=null)
            System.out.println(Products[i].getname()+"$"+Products[i].getprice());
       
        }
        System.out.println("the totalPrice "+ calculateTotalPrice()+"$" );
        
        
    }}