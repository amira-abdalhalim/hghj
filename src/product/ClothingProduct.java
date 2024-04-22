/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author 24990
 */
public class ClothingProduct extends Product{
    private String size;
    private String fabric;

public ClothingProduct(int productid,String name,float price,String size,String fabric) {
super( productid,name,price);
this.size=size;
this.fabric=fabric;
}
   public void setsize(String s){
       size=s;}
        public void setfabric(String f){
       fabric=f;}
        
   public  String getsize (){return size;}
    public String getfabric(){return fabric;}    
}