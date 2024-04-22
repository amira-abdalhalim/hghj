/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author 24990
 */



    public class Cart {
   protected int customerId;
     protected int nProducts;
    protected Product[] Products;

    public Cart(int customerId, int nProducts) {
        this.customerId =Math.abs(customerId);
        this.nProducts = nProducts;
        this.Products = new Product[this.nProducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
       
        this.customerId = customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        
        this.nProducts = nProducts;
    }

    public Product[] getProducts() {
        return Products;
    }

    public void setProducts(Product[] Products) {
        this.Products = Products;
    }
    public void addProduct(Product product,int x){
        if(x>=0&&x<nProducts)
             Products[x]=product;
        else
            System.out.println("error");
        
        
        
    }
    public void removeProudct(int x){
        if(x>=0&&x<nProducts)
             Products[x]=null;
        else
            System.out.println("error");
        
    }
    public double CalculateProduct(){
        double totalPrice=0;
        for(int i=0;i<nProducts;i++){
            if(Products[i]!=null){
                totalPrice+=Products[i].getprice();
            }
        }
        return  totalPrice;
       
    }
    public void PlaceOrder(){
        System.out.println("customerId"+customerId);
        System.out.println("Total price:"+CalculateProduct()+"$");
        
    }}
        
    

    
    
    
    
    
    
    
    
    
    

    
    

