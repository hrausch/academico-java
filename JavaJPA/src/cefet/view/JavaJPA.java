/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cefet.view;

import cefet.controller.UsuarioJpaController;
import cefet.model.Usuario;
import cefet.persistence.PersistenceSingleton;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Herbert
 */
public class JavaJPA {

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
        
        Thread.sleep(2000);  
        
        EntityManagerFactory ponte6 = PersistenceSingleton.getInstance().getEntityManagerFactory();
        
        /**
         * Instacia objetos e insere no banco
         */
        UsuarioJpaController usuController = new UsuarioJpaController(ponte);
        
        Usuario u1 = new Usuario(); //instancia um novo objeto
        u1.setNome("Herbert");               
        usuController.create(u1); // Insere o objeto u1 no banco de dados. O metodo create ja atribui o valor do id no objeto
        System.out.println(u1.toString());
        
        u1 = new Usuario(); //instancia um novo objeto
        u1.setNome("Rausch");               
        usuController.create(u1); 
        System.out.println(u1.toString());
        
        u1 = new Usuario(); //instancia um novo objeto
        u1.setNome("Fernandes");               
        usuController.create(u1);
        System.out.println(u1.toString());
        
                
    }
   

    
}
