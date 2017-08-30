/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Tamanho;

/**
 *
 * @author luciano
 */
@Stateless
public class TamanhoFacade extends AbstractFacade<Tamanho> {

    @PersistenceContext(unitName = "SistemaOtica2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TamanhoFacade() {
        super(Tamanho.class);
    }
    
}
