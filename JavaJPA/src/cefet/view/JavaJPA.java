/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cefet.view;

import cefet.controller.PublicacaoJpaController;
import cefet.controller.UsuarioJpaController;
import cefet.controller.exceptions.NonexistentEntityException;
import cefet.model.Publicacao;
import cefet.model.Usuario;
import cefet.persistence.PersistenceSingleton;
import java.util.ArrayList;
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

        /*EntityManagerFactory ponte2 = PersistenceSingleton.getInstance().getEntityManagerFactory();
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
        */
        /**
         * Instacia objetos e insere no banco
         */
        UsuarioJpaController usuController = new UsuarioJpaController(ponte);
        PublicacaoJpaController pubController = new PublicacaoJpaController(ponte);
        
//        Usuario u1 = new Usuario(); //instancia um novo objeto
//        u1.setNome("Herbert");               
//        usuController.create(u1); // Insere o objeto u1 no banco de dados. O metodo create ja atribui o valor do id no objeto
//        
//        u1 = new Usuario(); //instancia um novo objeto
//        u1.setNome("Rausch");               
//        usuController.create(u1); 
//        
//        u1 = new Usuario(); //instancia um novo objeto
//        u1.setNome("Fernandes");               
//        usuController.create(u1);
//        
//        Publicacao p1 = new Publicacao();
//        p1.setDonoPublicacao(u1);
//        p1.setTextoPublicado("Publicacao do usuario:  "+u1.getId());
//        pubController.create(p1);
        
        
        /*Busca publicacao de ID igual 1 */
        Publicacao p2 = pubController.findPublicacao(1L);
        System.out.println("Texto: " + p2.getTextoPublicado());
        System.out.println("Usuario dono: " + p2.getDonoPublicacao().getNome());
        p2.setTextoPublicado("Texto alterado para teste");
        pubController.edit(p2);
        
        
        /*Busca usuario de ID igual a 16*/
        Usuario u2 = usuController.findUsuario(16L);
        
        /*Busca por todas as publicacoes no banco de dados*/
        List<Publicacao> listaPublicacoes = pubController.findPublicacaoEntities();
        
        for( Publicacao objPub : listaPublicacoes ){
            System.out.println("Texto: " + objPub.getTextoPublicado());
            System.out.println("Usuario dono: " + objPub.getDonoPublicacao().getNome());
            
        }
        
        List<Usuario> lista = usuController.findUsuariosByNome("HERBERT");
        
        for( Usuario objUsu : lista ){
            System.out.println(objUsu.toString());
            
        }
        
                
    }
   

    
}
