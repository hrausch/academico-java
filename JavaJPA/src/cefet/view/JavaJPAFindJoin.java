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
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Herbert
 */
public class JavaJPAFindJoin {

  public static void main(String args[]) throws Exception{
        
        EntityManagerFactory ponte = PersistenceSingleton.getInstance().getEntityManagerFactory();
        
        UsuarioJpaController usuController = new UsuarioJpaController(ponte);
        PublicacaoJpaController pubController = new PublicacaoJpaController(ponte);
                
            /*Busca usuario de ID igual 1 */
        Usuario u2 = usuController.findUsuario(1L);
        
        List<Publicacao> lista1 = pubController.findPublicacaoEntitiesByUsuario1(u2);
        System.out.println("Consulta gerada através do JPA CRITERIA");
        for(Publicacao p : lista1){
            System.out.println("ATR 1:" + p.getId());
            System.out.println("ATR 2:" + p.getTextoPublicado());
        }
        
        List<Publicacao> lista2 = pubController.findPublicacaoEntitiesByUsuario2(u2);
        System.out.println("Consulta gerada através do JPQL");
        for(Publicacao p : lista2){
            System.out.println("ATR 1:" + p.getId());
            System.out.println("ATR 2:" + p.getTextoPublicado());
        }
 
  }
  

   

    
}
