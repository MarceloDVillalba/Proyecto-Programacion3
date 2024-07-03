package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Moto;
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

public class MotoJpaController implements Serializable {

    public MotoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public MotoJpaController(){
        emf = Persistence.createEntityManagerFactory("ConcesionariaPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Moto moto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(moto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Moto moto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            moto = em.merge(moto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = moto.getIdVehiculo();
                if (findMoto(id) == null) {
                    throw new NonexistentEntityException("The moto with id " + id + " no longer exists.");
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
            Moto moto;
            try {
                moto = em.getReference(Moto.class, id);
                moto.getIdVehiculo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The moto with id " + id + " no longer exists.", enfe);
            }
            em.remove(moto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Moto> findMotoEntities() {
        return findMotoEntities(true, -1, -1);
    }

    public List<Moto> findMotoEntities(int maxResults, int firstResult) {
        return findMotoEntities(false, maxResults, firstResult);
    }

    private List<Moto> findMotoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Moto.class));
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

    public Moto findMoto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Moto.class, id);
        } finally {
            em.close();
        }
    }

    public int getMotoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Moto> rt = cq.from(Moto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
