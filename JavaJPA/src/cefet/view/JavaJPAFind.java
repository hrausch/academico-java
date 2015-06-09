/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cefet.view;

import cefet.controller.PublicacaoJpaController;
import cefet.controller.UsuarioJpaController;
import cefet.model.Publicacao;
import cefet.persistence.PersistenceSingleton;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Herbert
 */
public class JavaJPAFind {

  public static void main(String args[]) throws Exception{
        
        EntityManagerFactory ponte = PersistenceSingleton.getInstance().getEntityManagerFactory();
        
        UsuarioJpaController usuController = new UsuarioJpaController(ponte);
        PublicacaoJpaController pubController = new PublicacaoJpaController(ponte);
                
        /*Busca publicacao de ID igual 1 */
        Publicacao p2 = pubController.findPublicacao(1L);
        System.out.println("Texto: " + p2.getTextoPublicado());
        System.out.println("Usuario dono: " + p2.getDonoPublicacao().getNome());
  }      
   

    
}
