/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cefet.view;

import cefet.controller.PublicacaoJpaController;
import cefet.controller.UsuarioJpaController;
import cefet.model.Publicacao;
import cefet.model.Usuario;
import cefet.persistence.PersistenceSingleton;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Herbert
 */
public class JavaJPAInsert {

  public static void main(String args[]) throws Exception{
        
        EntityManagerFactory ponte = PersistenceSingleton.getInstance().getEntityManagerFactory();
        UsuarioJpaController usuController = new UsuarioJpaController(ponte);
        PublicacaoJpaController pubController = new PublicacaoJpaController(ponte);
        
        Usuario u1 = new Usuario(); //instancia um novo objeto
        u1.setNome("Herbert");
        usuController.create(u1); // Insere o objeto u1 no banco de dados. O metodo create ja atribui o valor do id no objeto
      
        
        Publicacao p1 = new Publicacao();
        p1.setDonoPublicacao(u1);
        p1.setTextoPublicado("Publicacao do usuario:  "+u1.getId());
        pubController.create(p1);
        
        

        
                
    }
   

    
}
