/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author luciano
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByIdpedidos", query = "SELECT p FROM Pedido p WHERE p.idpedidos = :idpedidos"),
    @NamedQuery(name = "Pedido.findByData", query = "SELECT p FROM Pedido p WHERE p.data = :data"),
    @NamedQuery(name = "Pedido.findByDatahora", query = "SELECT p FROM Pedido p WHERE p.datahora = :datahora"),
    @NamedQuery(name = "Pedido.findByCodigo", query = "SELECT p FROM Pedido p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Pedido.findBySinal", query = "SELECT p FROM Pedido p WHERE p.sinal = :sinal"),
    @NamedQuery(name = "Pedido.findByDesconto", query = "SELECT p FROM Pedido p WHERE p.desconto = :desconto"),
    @NamedQuery(name = "Pedido.findByPrevisaoentrega", query = "SELECT p FROM Pedido p WHERE p.previsaoentrega = :previsaoentrega"),
    @NamedQuery(name = "Pedido.findByEntregue", query = "SELECT p FROM Pedido p WHERE p.entregue = :entregue"),
    @NamedQuery(name = "Pedido.findByComrx", query = "SELECT p FROM Pedido p WHERE p.comrx = :comrx"),
    @NamedQuery(name = "Pedido.findByObservacaoped", query = "SELECT p FROM Pedido p WHERE p.observacaoped = :observacaoped")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpedidos")
    private Integer idpedidos;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "datahora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahora;
    @Column(name = "codigo")
    private Integer codigo;
    @Size(max = 15)
    @Column(name = "sinal")
    private String sinal;
    @Size(max = 15)
    @Column(name = "desconto")
    private String desconto;
    @Size(max = 3)
    @Column(name = "previsaoentrega")
    private String previsaoentrega;
    @Column(name = "entregue")
    private Boolean entregue;
    @Column(name = "comrx")
    private Boolean comrx;
    @Size(max = 45)
    @Column(name = "observacaoped")
    private String observacaoped;
    @JoinColumn(name = "cliente_idclientes", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Cliente clienteIdclientes;
    @JoinColumn(name = "laboratorio_idlaboratorios", referencedColumnName = "idlaboratorios")
    @ManyToOne(optional = false)
    private Laboratorio laboratorioIdlaboratorios;
    @JoinColumn(name = "receita_idreceitas", referencedColumnName = "idreceitas")
    @ManyToOne(optional = false)
    private Receita receitaIdreceitas;
    @JoinColumn(name = "tipopagto_idtipopagto", referencedColumnName = "idtipopagto")
    @ManyToOne(optional = false)
    private Tipopagto tipopagtoIdtipopagto;
    @JoinColumn(name = "usuario_idusuarios", referencedColumnName = "idusuarios")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoIdpedidos")
    private Collection<Itenspedido> itenspedidoCollection;

    public Pedido() {
    }

    public Pedido(Integer idpedidos) {
        this.idpedidos = idpedidos;
    }

    public Integer getIdpedidos() {
        return idpedidos;
    }

    public void setIdpedidos(Integer idpedidos) {
        this.idpedidos = idpedidos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    public String getPrevisaoentrega() {
        return previsaoentrega;
    }

    public void setPrevisaoentrega(String previsaoentrega) {
        this.previsaoentrega = previsaoentrega;
    }

    public Boolean getEntregue() {
        return entregue;
    }

    public void setEntregue(Boolean entregue) {
        this.entregue = entregue;
    }

    public Boolean getComrx() {
        return comrx;
    }

    public void setComrx(Boolean comrx) {
        this.comrx = comrx;
    }

    public String getObservacaoped() {
        return observacaoped;
    }

    public void setObservacaoped(String observacaoped) {
        this.observacaoped = observacaoped;
    }

    public Cliente getClienteIdclientes() {
        return clienteIdclientes;
    }

    public void setClienteIdclientes(Cliente clienteIdclientes) {
        this.clienteIdclientes = clienteIdclientes;
    }

    public Laboratorio getLaboratorioIdlaboratorios() {
        return laboratorioIdlaboratorios;
    }

    public void setLaboratorioIdlaboratorios(Laboratorio laboratorioIdlaboratorios) {
        this.laboratorioIdlaboratorios = laboratorioIdlaboratorios;
    }

    public Receita getReceitaIdreceitas() {
        return receitaIdreceitas;
    }

    public void setReceitaIdreceitas(Receita receitaIdreceitas) {
        this.receitaIdreceitas = receitaIdreceitas;
    }

    public Tipopagto getTipopagtoIdtipopagto() {
        return tipopagtoIdtipopagto;
    }

    public void setTipopagtoIdtipopagto(Tipopagto tipopagtoIdtipopagto) {
        this.tipopagtoIdtipopagto = tipopagtoIdtipopagto;
    }

    public Usuario getUsuarioIdusuarios() {
        return usuarioIdusuarios;
    }

    public void setUsuarioIdusuarios(Usuario usuarioIdusuarios) {
        this.usuarioIdusuarios = usuarioIdusuarios;
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
        hash += (idpedidos != null ? idpedidos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idpedidos == null && other.idpedidos != null) || (this.idpedidos != null && !this.idpedidos.equals(other.idpedidos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pedido[ idpedidos=" + idpedidos + " ]";
    }
    
}
