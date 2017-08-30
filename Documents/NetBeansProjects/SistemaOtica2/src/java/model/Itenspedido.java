/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luciano
 */
@Entity
@Table(name = "itenspedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itenspedido.findAll", query = "SELECT i FROM Itenspedido i"),
    @NamedQuery(name = "Itenspedido.findByIditenspedidos", query = "SELECT i FROM Itenspedido i WHERE i.iditenspedidos = :iditenspedidos"),
    @NamedQuery(name = "Itenspedido.findByQuantidade", query = "SELECT i FROM Itenspedido i WHERE i.quantidade = :quantidade")})
public class Itenspedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditenspedidos")
    private Integer iditenspedidos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantidade")
    private Double quantidade;
    @JoinColumn(name = "pedido_idpedidos", referencedColumnName = "idpedidos")
    @ManyToOne(optional = false)
    private Pedido pedidoIdpedidos;
    @JoinColumn(name = "produto_idprodutos", referencedColumnName = "idprodutos")
    @ManyToOne(optional = false)
    private Produto produtoIdprodutos;

    public Itenspedido() {
    }

    public Itenspedido(Integer iditenspedidos) {
        this.iditenspedidos = iditenspedidos;
    }

    public Integer getIditenspedidos() {
        return iditenspedidos;
    }

    public void setIditenspedidos(Integer iditenspedidos) {
        this.iditenspedidos = iditenspedidos;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedidoIdpedidos() {
        return pedidoIdpedidos;
    }

    public void setPedidoIdpedidos(Pedido pedidoIdpedidos) {
        this.pedidoIdpedidos = pedidoIdpedidos;
    }

    public Produto getProdutoIdprodutos() {
        return produtoIdprodutos;
    }

    public void setProdutoIdprodutos(Produto produtoIdprodutos) {
        this.produtoIdprodutos = produtoIdprodutos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditenspedidos != null ? iditenspedidos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itenspedido)) {
            return false;
        }
        Itenspedido other = (Itenspedido) object;
        if ((this.iditenspedidos == null && other.iditenspedidos != null) || (this.iditenspedidos != null && !this.iditenspedidos.equals(other.iditenspedidos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Itenspedido[ iditenspedidos=" + iditenspedidos + " ]";
    }
    
}
