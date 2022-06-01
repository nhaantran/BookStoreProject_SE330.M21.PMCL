/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nhaantran
 */
public abstract class Person extends Model {
    
    private String Name;
    private String Email;
    private String Phone;
    private String DateofBirth;
    private String Gender;

    public Person() {
        super();
        this.Name = "";
        this.Email = "";
        this.Phone = "";
        this.DateofBirth = "";
        this.Gender = "";
    }

    public Person(String Name, String Email, String Phone, String DateofBirth, String Gender, String ID) {
        super(ID);
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
        this.DateofBirth = DateofBirth;
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
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
