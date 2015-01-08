/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Kategoriler;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author omur.alcin
 */
@Stateless
public class KategorilerFacade extends AbstractFacade<Kategoriler> {
    @PersistenceContext(unitName = "EkolaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KategorilerFacade() {
        super(Kategoriler.class);
    }
    
}
