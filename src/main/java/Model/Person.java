/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nhaantran
 */
public abstract class Person extends Unit {
    
    private String DateofBirth;
    private String Gender;

    public Person() {
        super();
        this.DateofBirth = "";
        this.Gender = "";
    }
    
    public Person(String Name, String DateofBirth, String Gender, String Email, String Phone, String ID) {
        super(Name, Email, Phone, ID);
        this.DateofBirth = DateofBirth;
        this.Gender = Gender;
    }

    
    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    
}
