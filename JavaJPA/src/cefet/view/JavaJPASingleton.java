/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cefet.view;

import cefet.persistence.PersistenceSingleton;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Herbert
 */
public class JavaJPASingleton {

  public static void main(String args[]) throws Exception{
        
        EntityManagerFactory ponte = PersistenceSingleton.getInstance().getEntityManagerFactory();
        System.out.println(ponte);

        EntityManagerFactory ponte2 = PersistenceSingleton.getInstance().getEntityManagerFactory();
        System.out.println(ponte2);
        
        Thread.sleep(2000);  
        
        EntityManagerFactory ponte3 = PersistenceSingleton.getInstance().getEntityManagerFactory();
        System.out.println(ponte3);
        
        Thread.sleep(2000);  
        
        EntityManagerFactory ponte4 = PersistenceSingleton.getInstance().getEntityManagerFactory();
        System.out.println(ponte4);
        
        Thread.sleep(2000);  
        
        EntityManagerFactory ponte5 = PersistenceSingleton.getInstance().getEntityManagerFactory();
        System.out.println(ponte5);
        
        Thread.sleep(2000);  
        
        EntityManagerFactory ponte6 = PersistenceSingleton.getInstance().getEntityManagerFactory();
        System.out.println(ponte6);        
                
    }
   

    
}
