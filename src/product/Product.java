/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package product;

/**
 *
 * @author 24990
 */
public class Product {

  protected int productid;
 protected String name;
 protected float price;
protected Product(){}
protected Product(int productid,String name,float price){
    this.productid=Math.abs(productid);
    this.name=name;
    this.price=Math.abs(price);
}
public void setproductid (int pid){
    productid=pid;
}
public void setname(String n){
  name=n;
}
public void setprice(float p){
 price=p;
}
public  int getproductid(){
    return productid;
}
public  String getname(){
    return name;
}
public  float getprice(){
    return price;
}
}