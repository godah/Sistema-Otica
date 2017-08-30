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
@Table(name = "cor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cor.findAll", query = "SELECT c FROM Cor c"),
    @NamedQuery(name = "Cor.findByIdcor", query = "SELECT c FROM Cor c WHERE c.idcor = :idcor"),
    @NamedQuery(name = "Cor.findByCor", query = "SELECT c FROM Cor c WHERE c.cor = :cor")})
public class Cor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcor")
    private Integer idcor;
    @Size(max = 10)
    @Column(name = "cor")
    private String cor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "corIdcor")
    private Collection<Produto> produtoCollection;

    public Cor() {
    }

    public Cor(Integer idcor) {
        this.idcor = idcor;
    }

    public Integer getIdcor() {
        return idcor;
    }

    public void setIdcor(Integer idcor) {
        this.idcor = idcor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @XmlTransient
    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcor != null ? idcor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cor)) {
            return false;
        }
        Cor other = (Cor) object;
        if ((this.idcor == null && other.idcor != null) || (this.idcor != null && !this.idcor.equals(other.idcor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cor[ idcor=" + idcor + " ]";
    }
    
}
