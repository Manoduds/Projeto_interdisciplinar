/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.PrjIdDAO;
import objects.Expense;
import objects.system_user;

/**
 *
 * @author paulo
 */
public class PrjIdBO {
    DAO.PrjIdDAO d = new PrjIdDAO();
    public void SaveUser(system_user u) 
    {   
         System.out.println("Entrou no PrjIdBO");
       d.SaveUser(u);
       System.out.println("passou pelo SaveUser");
    }

    public boolean compareUser(system_user u) 
    {      
        boolean rs = d.compareUser(u);
        return rs;
    }

    public void saveExpense(Expense e) 
    {
        d.SaveExpense(e);   
    }
}
