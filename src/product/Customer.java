/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author 24990
 */
public class Customer  {
  protected  int customerid;
  protected  String name;
   protected String address;
    public Customer (){}

public Customer(int customerid, String name,String address){

this.customerid=Math.abs(customerid);
this.address=address;
this.name=name;}

public void setcustomerid(int customerid){
    this.customerid=customerid;}
public void setname(String name){
    this.name=name;}
public void setaddress(String address){
    this.address=address;}
public int getcustomerid(){return customerid;}
public String getaddress(){return address;}
public String getname(){return name;}

}