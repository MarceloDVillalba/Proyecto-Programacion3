package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Concesionaria;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class ConcesionariaJpaController implements Serializable {

    public ConcesionariaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ConcesionariaJpaController(){
        emf = Persistence.createEntityManagerFactory("ConcesionariaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Concesionaria concesionaria) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(concesionaria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Concesionaria concesionaria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            concesionaria = em.merge(concesionaria);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = concesionaria.getSucursal();
                if (findConcesionaria(id) == null) {
                    throw new NonexistentEntityException("The concesionaria with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Concesionaria concesionaria;
            try {
                concesionaria = em.getReference(Concesionaria.class, id);
                concesionaria.getSucursal();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The concesionaria with id " + id + " no longer exists.", enfe);
            }
            em.remove(concesionaria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Concesionaria> findConcesionariaEntities() {
        return findConcesionariaEntities(true, -1, -1);
    }

    public List<Concesionaria> findConcesionariaEntities(int maxResults, int firstResult) {
        return findConcesionariaEntities(false, maxResults, firstResult);
    }

    private List<Concesionaria> findConcesionariaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Concesionaria.class));
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

    public Concesionaria findConcesionaria(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Concesionaria.class, id);
        } finally {
            em.close();
        }
    }

    public int getConcesionariaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Concesionaria> rt = cq.from(Concesionaria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
