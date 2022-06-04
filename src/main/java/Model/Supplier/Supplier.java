/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Supplier;

import Model.Unit;

/**
 *
 * @author nhaantran
 */
public class Supplier extends Unit{
    
    private int NumofProducts;
    private String Address;
    

    public Supplier() {
        super();
        this.NumofProducts = 0;
        this.Address = "";
        
    }

    public Supplier(int NumofProducts, String Address, String Name, String Email, String Phone, String ID) {
        super(Name, Email, Phone, ID);
        this.NumofProducts = NumofProducts;
        this.Address = Address;
    }

    public int getNumofProducts() {
        return NumofProducts;
    }

    public void setNumofProducts(int NumofProducts) {
        this.NumofProducts = NumofProducts;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
      
    
    
    
    
    
    
}
