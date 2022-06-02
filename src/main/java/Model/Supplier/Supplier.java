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
    
    private String Address;
    private int NumofProducts;

    public Supplier() {
        super();
        this.Address = "";
        this.NumofProducts = 0;
    }

    public Supplier(String Address, int NumofProducts, String Email, String Phone, String ID) {
        super(Email, Phone, ID);
        this.Address = Address;
        this.NumofProducts = NumofProducts;
    }
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getNumofProducts() {
        return NumofProducts;
    }

    public void setNumofProducts(int NumofProducts) {
        this.NumofProducts = NumofProducts;
    }
    
    
    
    
    
    
    
}
