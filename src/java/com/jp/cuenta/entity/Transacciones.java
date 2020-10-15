/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.cuenta.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Brian Gomez
 */
@Entity
@Table(name = "TRANSACCIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transacciones.findAll", query = "SELECT t FROM Transacciones t")
    , @NamedQuery(name = "Transacciones.findById", query = "SELECT t FROM Transacciones t WHERE t.id = :id")
    , @NamedQuery(name = "Transacciones.findByTipodocumento", query = "SELECT t FROM Transacciones t WHERE t.tipodocumento = :tipodocumento")
    , @NamedQuery(name = "Transacciones.findByIdTipodocumento", query = "SELECT t FROM Transacciones t WHERE t.idTipodocumento = :idTipodocumento")
    , @NamedQuery(name = "Transacciones.findByNumerodocumento", query = "SELECT t FROM Transacciones t WHERE t.numerodocumento = :numerodocumento")
    , @NamedQuery(name = "Transacciones.findByFecha", query = "SELECT t FROM Transacciones t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "Transacciones.findByIdCliente", query = "SELECT t FROM Transacciones t WHERE t.idCliente = :idCliente")
    , @NamedQuery(name = "Transacciones.findByMonto", query = "SELECT t FROM Transacciones t WHERE t.monto = :monto")})
public class Transacciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Short id;
    @Column(name = "TIPODOCUMENTO")
    private Long tipodocumento;
    @Column(name = "ID_TIPODOCUMENTO")
    private Integer idTipodocumento;
    @Column(name = "NUMERODOCUMENTO")
    private Integer numerodocumento;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "MONTO")
    private Integer monto;

    public Transacciones() {
    }

    public Transacciones(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Long getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(Long tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public Integer getIdTipodocumento() {
        return idTipodocumento;
    }

    public void setIdTipodocumento(Integer idTipodocumento) {
        this.idTipodocumento = idTipodocumento;
    }

    public Integer getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(Integer numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transacciones)) {
            return false;
        }
        Transacciones other = (Transacciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jp.cuenta.entity.Transacciones[ id=" + id + " ]";
    }
    
}
