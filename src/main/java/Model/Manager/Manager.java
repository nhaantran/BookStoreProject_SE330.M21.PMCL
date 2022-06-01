/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Manager;

import Model.Person;

/**
 *
 * @author nhaantran
 */
public class Manager extends Person{
    private String RegisterDate;

    public Manager(){
        super();
        this.RegisterDate = "";
    }
    
    public Manager(String RegisterDate, String Name, String Email, String Phone, String DateofBirth, String Gender, String ID) {
        super(Name, Email, Phone, DateofBirth, Gender, ID);
        this.RegisterDate = RegisterDate;
    }

    public String getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(String RegisterDate) {
        this.RegisterDate = RegisterDate;
    }
    
    
}
