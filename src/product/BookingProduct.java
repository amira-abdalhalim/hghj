/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author 24990
 */
public class BookingProduct extends Product{
   protected String author;
   protected String publisher;

public BookingProduct(int productid,String name,float price,String author,String publisher){
  super(productid,name,price)  ;
  this.author=author;
  this.publisher=publisher;}
    public void setauthor(String a)
    {author=a;}
     public void setpublisher(String p)
    {publisher=p;}
    public String getauthor(){
        return author;
        
    }
public String getpublisher(){
        return publisher;
        
    }
}