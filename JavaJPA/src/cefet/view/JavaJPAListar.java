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
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Herbert
 */
public class JavaJPAListar {

    public static void main(String args[]) throws Exception {

        EntityManagerFactory ponte = PersistenceSingleton.getInstance().getEntityManagerFactory();

        UsuarioJpaController usuController = new UsuarioJpaController(ponte);
        PublicacaoJpaController pubController = new PublicacaoJpaController(ponte);


        /*
         Busca por todas as publicacoes no banco de dados
         SELECT * FROM PUBLICACAO
         */
        List<Publicacao> listaPublicacoes = pubController.findPublicacaoEntities();

        for (Publicacao objPub : listaPublicacoes) {
            System.out.println("Texto: " + objPub.getTextoPublicado());
            System.out.println("Usuario dono: " + objPub.getDonoPublicacao().getNome());

        }

        /*
         Busca por todas os usuarios no banco de dados que tem o nome="HERBERT"
         SELECT * FROM usuario where nome = "HERBERT"
         */
        List<Usuario> lista = usuController.findUsuariosByNome("HERBERT");

        for (Usuario objUsu : lista) {
            System.out.println(objUsu.toString());
        }

    }

}
