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
@Table(name = "fornecedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByIdfornecedores", query = "SELECT f FROM Fornecedor f WHERE f.idfornecedores = :idfornecedores"),
    @NamedQuery(name = "Fornecedor.findByCnpjcpf", query = "SELECT f FROM Fornecedor f WHERE f.cnpjcpf = :cnpjcpf"),
    @NamedQuery(name = "Fornecedor.findByRazaosocial", query = "SELECT f FROM Fornecedor f WHERE f.razaosocial = :razaosocial"),
    @NamedQuery(name = "Fornecedor.findByFantasia", query = "SELECT f FROM Fornecedor f WHERE f.fantasia = :fantasia"),
    @NamedQuery(name = "Fornecedor.findByLogradouro", query = "SELECT f FROM Fornecedor f WHERE f.logradouro = :logradouro"),
    @NamedQuery(name = "Fornecedor.findByNumero", query = "SELECT f FROM Fornecedor f WHERE f.numero = :numero"),
    @NamedQuery(name = "Fornecedor.findByBairro", query = "SELECT f FROM Fornecedor f WHERE f.bairro = :bairro"),
    @NamedQuery(name = "Fornecedor.findByCidade", query = "SELECT f FROM Fornecedor f WHERE f.cidade = :cidade"),
    @NamedQuery(name = "Fornecedor.findByEstado", query = "SELECT f FROM Fornecedor f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fornecedor.findByCep", query = "SELECT f FROM Fornecedor f WHERE f.cep = :cep"),
    @NamedQuery(name = "Fornecedor.findByTelefone", query = "SELECT f FROM Fornecedor f WHERE f.telefone = :telefone"),
    @NamedQuery(name = "Fornecedor.findByTelefone2", query = "SELECT f FROM Fornecedor f WHERE f.telefone2 = :telefone2"),
    @NamedQuery(name = "Fornecedor.findByIe", query = "SELECT f FROM Fornecedor f WHERE f.ie = :ie"),
    @NamedQuery(name = "Fornecedor.findByAtivo", query = "SELECT f FROM Fornecedor f WHERE f.ativo = :ativo"),
    @NamedQuery(name = "Fornecedor.findBySimples", query = "SELECT f FROM Fornecedor f WHERE f.simples = :simples")})
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfornecedores")
    private Integer idfornecedores;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fornecedorIdfornecedores")
    private Collection<Produto> produtoCollection;

    public Fornecedor() {
    }

    public Fornecedor(Integer idfornecedores) {
        this.idfornecedores = idfornecedores;
    }

    public Integer getIdfornecedores() {
        return idfornecedores;
    }

    public void setIdfornecedores(Integer idfornecedores) {
        this.idfornecedores = idfornecedores;
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
        hash += (idfornecedores != null ? idfornecedores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.idfornecedores == null && other.idfornecedores != null) || (this.idfornecedores != null && !this.idfornecedores.equals(other.idfornecedores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Fornecedor[ idfornecedores=" + idfornecedores + " ]";
    }
    
}
