/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Author;

import Model.Person;

/**
 *
 * @author nhaantran
 */
public class Author extends Person{
    private int NumofProducts;

    public Author() {
        super();
        this.NumofProducts = 0;
    }
    
    public Author(int NumofProducts, String Name, String Email, String Phone, String DateofBirth, String Gender, String ID) {
        super(Name, Email, Phone, DateofBirth, Gender, ID);
        this.NumofProducts = NumofProducts;
    }

    public int getNumofProducts() {
        return NumofProducts;
    }

    public void setNumofProducts(int NumofProducts) {
        this.NumofProducts = NumofProducts;
    }
    

    
    
    
}
