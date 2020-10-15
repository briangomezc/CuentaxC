/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.cuenta.facade;

import com.jp.cuenta.entity.Balances;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Brian Gomez
 */
@Stateless
public class BalancesFacade extends AbstractFacade<Balances> {

    @PersistenceContext(unitName = "CuentaporCPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BalancesFacade() {
        super(Balances.class);
    }
    
}
