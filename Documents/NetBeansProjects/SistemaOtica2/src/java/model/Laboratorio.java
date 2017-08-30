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
@Table(name = "laboratorio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Laboratorio.findAll", query = "SELECT l FROM Laboratorio l"),
    @NamedQuery(name = "Laboratorio.findByIdlaboratorios", query = "SELECT l FROM Laboratorio l WHERE l.idlaboratorios = :idlaboratorios"),
    @NamedQuery(name = "Laboratorio.findByRazaosocial", query = "SELECT l FROM Laboratorio l WHERE l.razaosocial = :razaosocial"),
    @NamedQuery(name = "Laboratorio.findByFantasia", query = "SELECT l FROM Laboratorio l WHERE l.fantasia = :fantasia"),
    @NamedQuery(name = "Laboratorio.findByCnpjcpf", query = "SELECT l FROM Laboratorio l WHERE l.cnpjcpf = :cnpjcpf"),
    @NamedQuery(name = "Laboratorio.findByLogradouro", query = "SELECT l FROM Laboratorio l WHERE l.logradouro = :logradouro"),
    @NamedQuery(name = "Laboratorio.findByNumero", query = "SELECT l FROM Laboratorio l WHERE l.numero = :numero"),
    @NamedQuery(name = "Laboratorio.findByBairro", query = "SELECT l FROM Laboratorio l WHERE l.bairro = :bairro"),
    @NamedQuery(name = "Laboratorio.findByCidade", query = "SELECT l FROM Laboratorio l WHERE l.cidade = :cidade"),
    @NamedQuery(name = "Laboratorio.findByEstado", query = "SELECT l FROM Laboratorio l WHERE l.estado = :estado"),
    @NamedQuery(name = "Laboratorio.findByCep", query = "SELECT l FROM Laboratorio l WHERE l.cep = :cep"),
    @NamedQuery(name = "Laboratorio.findByTelefone", query = "SELECT l FROM Laboratorio l WHERE l.telefone = :telefone"),
    @NamedQuery(name = "Laboratorio.findByTelefone2", query = "SELECT l FROM Laboratorio l WHERE l.telefone2 = :telefone2"),
    @NamedQuery(name = "Laboratorio.findByIe", query = "SELECT l FROM Laboratorio l WHERE l.ie = :ie"),
    @NamedQuery(name = "Laboratorio.findByAtivo", query = "SELECT l FROM Laboratorio l WHERE l.ativo = :ativo"),
    @NamedQuery(name = "Laboratorio.findByContato", query = "SELECT l FROM Laboratorio l WHERE l.contato = :contato")})
public class Laboratorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlaboratorios")
    private Integer idlaboratorios;
    @Size(max = 30)
    @Column(name = "razaosocial")
    private String razaosocial;
    @Size(max = 30)
    @Column(name = "fantasia")
    private String fantasia;
    @Size(max = 18)
    @Column(name = "cnpjcpf")
    private String cnpjcpf;
    @Size(max = 30)
    @Column(name = "logradouro")
    private String logradouro;
    @Size(max = 10)
    @Column(name = "numero")
    private String numero;
    @Size(max = 15)
    @Column(name = "bairro")
    private String bairro;
    @Size(max = 15)
    @Column(name = "cidade")
    private String cidade;
    @Size(max = 2)
    @Column(name = "estado")
    private String estado;
    @Size(max = 10)
    @Column(name = "cep")
    private String cep;
    @Size(max = 15)
    @Column(name = "telefone")
    private String telefone;
    @Size(max = 15)
    @Column(name = "telefone2")
    private String telefone2;
    @Size(max = 20)
    @Column(name = "ie")
    private String ie;
    @Column(name = "ativo")
    private Boolean ativo;
    @Size(max = 15)
    @Column(name = "contato")
    private String contato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratorioIdlaboratorios")
    private Collection<Pedido> pedidoCollection;

    public Laboratorio() {
    }

    public Laboratorio(Integer idlaboratorios) {
        this.idlaboratorios = idlaboratorios;
    }

    public Integer getIdlaboratorios() {
        return idlaboratorios;
    }

    public void setIdlaboratorios(Integer idlaboratorios) {
        this.idlaboratorios = idlaboratorios;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCnpjcpf() {
        return cnpjcpf;
    }

    public void setCnpjcpf(String cnpjcpf) {
        this.cnpjcpf = cnpjcpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
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
        hash += (idlaboratorios != null ? idlaboratorios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laboratorio)) {
            return false;
        }
        Laboratorio other = (Laboratorio) object;
        if ((this.idlaboratorios == null && other.idlaboratorios != null) || (this.idlaboratorios != null && !this.idlaboratorios.equals(other.idlaboratorios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Laboratorio[ idlaboratorios=" + idlaboratorios + " ]";
    }
    
}
