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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByIdprodutos", query = "SELECT p FROM Produto p WHERE p.idprodutos = :idprodutos"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByCodigo", query = "SELECT p FROM Produto p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Produto.findByUnidade", query = "SELECT p FROM Produto p WHERE p.unidade = :unidade"),
    @NamedQuery(name = "Produto.findBySaldo", query = "SELECT p FROM Produto p WHERE p.saldo = :saldo"),
    @NamedQuery(name = "Produto.findByEstoquemin", query = "SELECT p FROM Produto p WHERE p.estoquemin = :estoquemin"),
    @NamedQuery(name = "Produto.findByPreco", query = "SELECT p FROM Produto p WHERE p.preco = :preco")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprodutos")
    private Integer idprodutos;
    @Size(max = 20)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 2)
    @Column(name = "unidade")
    private String unidade;
    @Size(max = 10)
    @Column(name = "saldo")
    private String saldo;
    @Size(max = 10)
    @Column(name = "estoquemin")
    private String estoquemin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco")
    private Double preco;
    @JoinColumn(name = "cor_idcor", referencedColumnName = "idcor")
    @ManyToOne(optional = false)
    private Cor corIdcor;
    @JoinColumn(name = "empresa_idempresas", referencedColumnName = "idempresas")
    @ManyToOne(optional = false)
    private Empresa empresaIdempresas;
    @JoinColumn(name = "fornecedor_idfornecedores", referencedColumnName = "idfornecedores")
    @ManyToOne(optional = false)
    private Fornecedor fornecedorIdfornecedores;
    @JoinColumn(name = "marca_idmarca", referencedColumnName = "idmarca")
    @ManyToOne(optional = false)
    private Marca marcaIdmarca;
    @JoinColumn(name = "tamanho_idtamanho", referencedColumnName = "idtamanho")
    @ManyToOne(optional = false)
    private Tamanho tamanhoIdtamanho;
    @JoinColumn(name = "tipo_idtipo", referencedColumnName = "idtipo")
    @ManyToOne(optional = false)
    private Tipo tipoIdtipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produtoIdprodutos")
    private Collection<Itenspedido> itenspedidoCollection;

    public Produto() {
    }

    public Produto(Integer idprodutos) {
        this.idprodutos = idprodutos;
    }

    public Integer getIdprodutos() {
        return idprodutos;
    }

    public void setIdprodutos(Integer idprodutos) {
        this.idprodutos = idprodutos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getEstoquemin() {
        return estoquemin;
    }

    public void setEstoquemin(String estoquemin) {
        this.estoquemin = estoquemin;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Cor getCorIdcor() {
        return corIdcor;
    }

    public void setCorIdcor(Cor corIdcor) {
        this.corIdcor = corIdcor;
    }

    public Empresa getEmpresaIdempresas() {
        return empresaIdempresas;
    }

    public void setEmpresaIdempresas(Empresa empresaIdempresas) {
        this.empresaIdempresas = empresaIdempresas;
    }

    public Fornecedor getFornecedorIdfornecedores() {
        return fornecedorIdfornecedores;
    }

    public void setFornecedorIdfornecedores(Fornecedor fornecedorIdfornecedores) {
        this.fornecedorIdfornecedores = fornecedorIdfornecedores;
    }

    public Marca getMarcaIdmarca() {
        return marcaIdmarca;
    }

    public void setMarcaIdmarca(Marca marcaIdmarca) {
        this.marcaIdmarca = marcaIdmarca;
    }

    public Tamanho getTamanhoIdtamanho() {
        return tamanhoIdtamanho;
    }

    public void setTamanhoIdtamanho(Tamanho tamanhoIdtamanho) {
        this.tamanhoIdtamanho = tamanhoIdtamanho;
    }

    public Tipo getTipoIdtipo() {
        return tipoIdtipo;
    }

    public void setTipoIdtipo(Tipo tipoIdtipo) {
        this.tipoIdtipo = tipoIdtipo;
    }

    @XmlTransient
    public Collection<Itenspedido> getItenspedidoCollection() {
        return itenspedidoCollection;
    }

    public void setItenspedidoCollection(Collection<Itenspedido> itenspedidoCollection) {
        this.itenspedidoCollection = itenspedidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprodutos != null ? idprodutos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idprodutos == null && other.idprodutos != null) || (this.idprodutos != null && !this.idprodutos.equals(other.idprodutos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Produto[ idprodutos=" + idprodutos + " ]";
    }
    
}
