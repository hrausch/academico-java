/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cefet.persistence;

import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author hrausch
 */
public class PersistenceSingleton {

    private static final String PERSISTENCEUNIT = "JavaJPAPU";
    
    private static PersistenceSingleton instance;

    private EntityManagerFactory emf;

    private PersistenceSingleton() {
        
    }

    public static PersistenceSingleton getInstance() {
        if(instance == null)
            instance = new PersistenceSingleton();
        
        return instance;
    }


    public EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCEUNIT);
        }
       
        return emf;
    }
}

