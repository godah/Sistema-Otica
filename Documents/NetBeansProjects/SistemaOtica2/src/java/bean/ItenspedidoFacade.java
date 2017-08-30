/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Itenspedido;

/**
 *
 * @author luciano
 */
@Stateless
public class ItenspedidoFacade extends AbstractFacade<Itenspedido> {

    @PersistenceContext(unitName = "SistemaOtica2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItenspedidoFacade() {
        super(Itenspedido.class);
    }
    
}
