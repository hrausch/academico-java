/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cefet.controller;

import cefet.controller.exceptions.NonexistentEntityException;
import cefet.model.Publicacao;
import cefet.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Herbert
 */
public class PublicacaoJpaController implements Serializable {

    public PublicacaoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Publicacao publicacao) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(publicacao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Publicacao publicacao) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            publicacao = em.merge(publicacao);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = publicacao.getId();
                if (findPublicacao(id) == null) {
                    throw new NonexistentEntityException("The publicacao with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Publicacao publicacao;
            try {
                publicacao = em.getReference(Publicacao.class, id);
                publicacao.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The publicacao with id " + id + " no longer exists.", enfe);
            }
            em.remove(publicacao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /*
     SELECT * FROM PUBLICACAO
     */
    public List<Publicacao> findPublicacaoEntities() {
        return findPublicacaoEntities(true, -1, -1);
    }

    public List<Publicacao> findPublicacaoEntities(int maxResults, int firstResult) {
        return findPublicacaoEntities(false, maxResults, firstResult);
    }

    private List<Publicacao> findPublicacaoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Publicacao.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Publicacao findPublicacao(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Publicacao.class, id);
        } finally {
            em.close();
        }
    }

    public int getPublicacaoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Publicacao> rt = cq.from(Publicacao.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    /**
     * USANDO JPA CRITERIA SELECT * FROM publicacao p JOIN usuario u on
     * u.idUsuario=p.idUsuario where p.idUsuario = ?
     */
    public List<Publicacao> findPublicacaoEntitiesByUsuario1(Usuario u) {

        EntityManager em = getEntityManager();
        
        // Fabrica de definicoes de consulta
        CriteriaBuilder cb = em.getCriteriaBuilder();

        // estrutura de consulta
        CriteriaQuery<Publicacao> query = cb.createQuery(Publicacao.class);
        Root<Publicacao> from = query.from(Publicacao.class);
        
        TypedQuery<Publicacao> typedQuery = em.createQuery(
                query.select(from)
                .where(
                        cb.equal(from.join("donoPublicacao").get("id"), u.getId())
                )
        );
        
        List<Publicacao> results = typedQuery.getResultList();

        return results;

    }
    /**
     * 
     * USANDO JPQL SELECT * FROM publicacao p JOIN usuario u on
     * u.idUsuario=p.idUsuario where p.idUsuario = ? 
     */
        public List<Publicacao> findPublicacaoEntitiesByUsuario2(Usuario u) {

            EntityManager em = getEntityManager();
        TypedQuery<Publicacao> typedQuery = em.createQuery(
                                "SELECT p FROM Publicacao p WHERE p.donoPublicacao.id=:usuario", Publicacao.class);
        
        typedQuery.setParameter("usuario", u.getId());

        List<Publicacao> results = typedQuery.getResultList();
        
        return results;

    }
        

}
