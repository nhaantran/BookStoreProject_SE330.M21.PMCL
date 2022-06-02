/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nhaantran
 */
public abstract class Unit extends Model{
    private String Email;
    private String Phone;

    public Unit(){
        super();
        this.Email = "";
        this.Phone = "";
    }
    
    public Unit(String Email, String Phone, String ID) {
        super(ID);
        this.Email = Email;
        this.Phone = Phone;
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
    
    
    
}
