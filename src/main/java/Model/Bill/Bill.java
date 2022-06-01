/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Bill;

import Model.Model;
import java.util.ArrayList;

/**
 *
 * @author nhaantran
 */
public class Bill extends Model{
    
    private String ManagerName;
    private String CustomerName;
    private String Price;
    private String Date;
    
    private ArrayList<BillDetail> Detail;
}
