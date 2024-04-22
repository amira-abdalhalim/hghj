/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author 24990
 */
public class ElectronicProduct extends Product {
  protected  String brand;
    protected  int warrantyPeriod;

public ElectronicProduct(){}
public ElectronicProduct ( int productid,String name,float price,String brand,int warrantyPeriod){
super( productid, name,price);
this.brand=brand;
this.warrantyPeriod=Math.abs(warrantyPeriod);}

public void setbrand(String b){
    brand=b;
}
public void setwarrantyPeriod(int w){
    warrantyPeriod=w;
}
public String getbrand(){
    return brand;
}
public int getwarrantyPeriod(){
return warrantyPeriod;}
}