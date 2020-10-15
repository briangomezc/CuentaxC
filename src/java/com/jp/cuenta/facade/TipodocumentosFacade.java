/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.cuenta.facade;

import com.jp.cuenta.entity.Tipodocumentos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Brian Gomez
 */
@Stateless
public class TipodocumentosFacade extends AbstractFacade<Tipodocumentos> {

    @PersistenceContext(unitName = "CuentaporCPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipodocumentosFacade() {
        super(Tipodocumentos.class);
    }
    
}
