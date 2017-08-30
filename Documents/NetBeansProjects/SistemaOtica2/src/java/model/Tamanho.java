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
@Table(name = "tamanho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tamanho.findAll", query = "SELECT t FROM Tamanho t"),
    @NamedQuery(name = "Tamanho.findByIdtamanho", query = "SELECT t FROM Tamanho t WHERE t.idtamanho = :idtamanho"),
    @NamedQuery(name = "Tamanho.findByTamanho", query = "SELECT t FROM Tamanho t WHERE t.tamanho = :tamanho")})
public class Tamanho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtamanho")
    private Integer idtamanho;
    @Size(max = 8)
    @Column(name = "tamanho")
    private String tamanho;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tamanhoIdtamanho")
    private Collection<Produto> produtoCollection;

    public Tamanho() {
    }

    public Tamanho(Integer idtamanho) {
        this.idtamanho = idtamanho;
    }

    public Integer getIdtamanho() {
        return idtamanho;
    }

    public void setIdtamanho(Integer idtamanho) {
        this.idtamanho = idtamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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
        hash += (idtamanho != null ? idtamanho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tamanho)) {
            return false;
        }
        Tamanho other = (Tamanho) object;
        if ((this.idtamanho == null && other.idtamanho != null) || (this.idtamanho != null && !this.idtamanho.equals(other.idtamanho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tamanho[ idtamanho=" + idtamanho + " ]";
    }
    
}
