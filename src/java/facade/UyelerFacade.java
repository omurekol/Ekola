/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Uyeler;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author omur.alcin
 */
@Stateless
public class UyelerFacade extends AbstractFacade<Uyeler> {
    @PersistenceContext(unitName = "EkolaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UyelerFacade() {
        super(Uyeler.class);
    }
    
}
