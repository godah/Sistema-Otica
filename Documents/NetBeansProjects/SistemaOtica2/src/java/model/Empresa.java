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
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByIdempresas", query = "SELECT e FROM Empresa e WHERE e.idempresas = :idempresas"),
    @NamedQuery(name = "Empresa.findByCnpjcpf", query = "SELECT e FROM Empresa e WHERE e.cnpjcpf = :cnpjcpf"),
    @NamedQuery(name = "Empresa.findByRazaosocial", query = "SELECT e FROM Empresa e WHERE e.razaosocial = :razaosocial"),
    @NamedQuery(name = "Empresa.findByFantasia", query = "SELECT e FROM Empresa e WHERE e.fantasia = :fantasia"),
    @NamedQuery(name = "Empresa.findByLogradouro", query = "SELECT e FROM Empresa e WHERE e.logradouro = :logradouro"),
    @NamedQuery(name = "Empresa.findByNumero", query = "SELECT e FROM Empresa e WHERE e.numero = :numero"),
    @NamedQuery(name = "Empresa.findByBairro", query = "SELECT e FROM Empresa e WHERE e.bairro = :bairro"),
    @NamedQuery(name = "Empresa.findByCidade", query = "SELECT e FROM Empresa e WHERE e.cidade = :cidade"),
    @NamedQuery(name = "Empresa.findByEstado", query = "SELECT e FROM Empresa e WHERE e.estado = :estado"),
    @NamedQuery(name = "Empresa.findByCep", query = "SELECT e FROM Empresa e WHERE e.cep = :cep"),
    @NamedQuery(name = "Empresa.findByTelefone", query = "SELECT e FROM Empresa e WHERE e.telefone = :telefone"),
    @NamedQuery(name = "Empresa.findByTelefone2", query = "SELECT e FROM Empresa e WHERE e.telefone2 = :telefone2"),
    @NamedQuery(name = "Empresa.findByIe", query = "SELECT e FROM Empresa e WHERE e.ie = :ie"),
    @NamedQuery(name = "Empresa.findByAtivo", query = "SELECT e FROM Empresa e WHERE e.ativo = :ativo"),
    @NamedQuery(name = "Empresa.findBySimples", query = "SELECT e FROM Empresa e WHERE e.simples = :simples"),
    @NamedQuery(name = "Empresa.findByLicenca", query = "SELECT e FROM Empresa e WHERE e.licenca = :licenca")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempresas")
    private Integer idempresas;
    @Size(max = 18)
    @Column(name = "cnpjcpf")
    private String cnpjcpf;
    @Size(max = 30)
    @Column(name = "razaosocial")
    private String razaosocial;
    @Size(max = 30)
    @Column(name = "fantasia")
    private String fantasia;
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
    @Column(name = "simples")
    private Boolean simples;
    @Column(name = "licenca")
    private Boolean licenca;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresaIdempresas")
    private Collection<Produto> produtoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresaIdempresas")
    private Collection<Usuario> usuarioCollection;

    public Empresa() {
    }

    public Empresa(Integer idempresas) {
        this.idempresas = idempresas;
    }

    public Integer getIdempresas() {
        return idempresas;
    }

    public void setIdempresas(Integer idempresas) {
        this.idempresas = idempresas;
    }

    public String getCnpjcpf() {
        return cnpjcpf;
    }

    public void setCnpjcpf(String cnpjcpf) {
        this.cnpjcpf = cnpjcpf;
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

    public Boolean getSimples() {
        return simples;
    }

    public void setSimples(Boolean simples) {
        this.simples = simples;
    }

    public Boolean getLicenca() {
        return licenca;
    }

    public void setLicenca(Boolean licenca) {
        this.licenca = licenca;
    }

    @XmlTransient
    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempresas != null ? idempresas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idempresas == null && other.idempresas != null) || (this.idempresas != null && !this.idempresas.equals(other.idempresas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Empresa[ idempresas=" + idempresas + " ]";
    }
    
}
