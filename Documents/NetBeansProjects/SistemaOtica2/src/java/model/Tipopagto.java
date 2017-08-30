/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author luciano
 */
@Entity
@Table(name = "tipopagto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipopagto.findAll", query = "SELECT t FROM Tipopagto t"),
    @NamedQuery(name = "Tipopagto.findByIdtipopagto", query = "SELECT t FROM Tipopagto t WHERE t.idtipopagto = :idtipopagto"),
    @NamedQuery(name = "Tipopagto.findByTipopagto", query = "SELECT t FROM Tipopagto t WHERE t.tipopagto = :tipopagto")})
public class Tipopagto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipopagto")
    private Integer idtipopagto;
    @Size(max = 10)
    @Column(name = "tipopagto")
    private String tipopagto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipopagtoIdtipopagto")
    private Collection<Pedido> pedidoCollection;

    public Tipopagto() {
    }

    public Tipopagto(Integer idtipopagto) {
        this.idtipopagto = idtipopagto;
    }

    public Integer getIdtipopagto() {
        return idtipopagto;
    }

    public void setIdtipopagto(Integer idtipopagto) {
        this.idtipopagto = idtipopagto;
    }

    public String getTipopagto() {
        return tipopagto;
    }

    public void setTipopagto(String tipopagto) {
        this.tipopagto = tipopagto;
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipopagto != null ? idtipopagto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopagto)) {
            return false;
        }
        Tipopagto other = (Tipopagto) object;
        if ((this.idtipopagto == null && other.idtipopagto != null) || (this.idtipopagto != null && !this.idtipopagto.equals(other.idtipopagto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tipopagto[ idtipopagto=" + idtipopagto + " ]";
    }
    
}
