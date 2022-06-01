/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Supplier;

import Model.Person;

/**
 *
 * @author nhaantran
 */
public class Supplier extends Person{
    
    /**
     * this.DateofBirth = "";
     * this.Gender = "";
     */
    
    private String Address;
    private int NumofProducts;

    public Supplier() {
        super();
        this.Address = "";
        this.NumofProducts = 0;
    }

    public Supplier(String Address, int NumofProducts) {
        this.Address = Address;
        this.NumofProducts = NumofProducts;
    }

    public Supplier(String Address, int NumofProducts, String Name, String Email, String Phone, String DateofBirth, String Gender, String ID) {
        super(Name, Email, Phone, DateofBirth, Gender, ID);
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
