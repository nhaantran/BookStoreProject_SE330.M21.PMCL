/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Customer;

import Model.Person;

/**
 *
 * @author nhaantran
 */
public class Customer extends Person{
    private double Total;

    public Customer() {
        super();
        this.Total = 0.0;
    }

    public Customer(double Total, String Name, String Email, String Phone, String DateofBirth, String Gender, String ID) {
        super(Name, Email, Phone, DateofBirth, Gender, ID);
        this.Total = Total;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    
    
}
