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
    
    private String Name;
    private String DateofBirth;
    private String Gender;

    public Person() {
        super();
        this.Name = "";
        this.DateofBirth = "";
        this.Gender = "";
    }
    
    public Person(String Name, String DateofBirth, String Gender, String Email, String Phone, String ID) {
        super(Email, Phone, ID);
        this.Name = Name;
        this.DateofBirth = DateofBirth;
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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
