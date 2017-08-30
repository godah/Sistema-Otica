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
@Table(name = "receita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Receita.findAll", query = "SELECT r FROM Receita r"),
    @NamedQuery(name = "Receita.findByIdreceitas", query = "SELECT r FROM Receita r WHERE r.idreceitas = :idreceitas"),
    @NamedQuery(name = "Receita.findByData", query = "SELECT r FROM Receita r WHERE r.data = :data"),
    @NamedQuery(name = "Receita.findByDnpod", query = "SELECT r FROM Receita r WHERE r.dnpod = :dnpod"),
    @NamedQuery(name = "Receita.findByDnpoe", query = "SELECT r FROM Receita r WHERE r.dnpoe = :dnpoe"),
    @NamedQuery(name = "Receita.findByAco", query = "SELECT r FROM Receita r WHERE r.aco = :aco"),
    @NamedQuery(name = "Receita.findByDpa", query = "SELECT r FROM Receita r WHERE r.dpa = :dpa"),
    @NamedQuery(name = "Receita.findByDm", query = "SELECT r FROM Receita r WHERE r.dm = :dm"),
    @NamedQuery(name = "Receita.findByVert", query = "SELECT r FROM Receita r WHERE r.vert = :vert"),
    @NamedQuery(name = "Receita.findByAd", query = "SELECT r FROM Receita r WHERE r.ad = :ad"),
    @NamedQuery(name = "Receita.findByLodesf", query = "SELECT r FROM Receita r WHERE r.lodesf = :lodesf"),
    @NamedQuery(name = "Receita.findByLodcil", query = "SELECT r FROM Receita r WHERE r.lodcil = :lodcil"),
    @NamedQuery(name = "Receita.findByLodeixo", query = "SELECT r FROM Receita r WHERE r.lodeixo = :lodeixo"),
    @NamedQuery(name = "Receita.findByLoeesf", query = "SELECT r FROM Receita r WHERE r.loeesf = :loeesf"),
    @NamedQuery(name = "Receita.findByLoecil", query = "SELECT r FROM Receita r WHERE r.loecil = :loecil"),
    @NamedQuery(name = "Receita.findByLoeeixo", query = "SELECT r FROM Receita r WHERE r.loeeixo = :loeeixo"),
    @NamedQuery(name = "Receita.findByPodesf", query = "SELECT r FROM Receita r WHERE r.podesf = :podesf"),
    @NamedQuery(name = "Receita.findByPodcil", query = "SELECT r FROM Receita r WHERE r.podcil = :podcil"),
    @NamedQuery(name = "Receita.findByPodeixo", query = "SELECT r FROM Receita r WHERE r.podeixo = :podeixo"),
    @NamedQuery(name = "Receita.findByPoeesf", query = "SELECT r FROM Receita r WHERE r.poeesf = :poeesf"),
    @NamedQuery(name = "Receita.findByPoecil", query = "SELECT r FROM Receita r WHERE r.poecil = :poecil"),
    @NamedQuery(name = "Receita.findByPoeeixo", query = "SELECT r FROM Receita r WHERE r.poeeixo = :poeeixo"),
    @NamedQuery(name = "Receita.findByObservacao", query = "SELECT r FROM Receita r WHERE r.observacao = :observacao"),
    @NamedQuery(name = "Receita.findByObsreceita", query = "SELECT r FROM Receita r WHERE r.obsreceita = :obsreceita")})
public class Receita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreceitas")
    private Integer idreceitas;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Size(max = 6)
    @Column(name = "dnpod")
    private String dnpod;
    @Size(max = 6)
    @Column(name = "dnpoe")
    private String dnpoe;
    @Size(max = 4)
    @Column(name = "aco")
    private String aco;
    @Size(max = 4)
    @Column(name = "dpa")
    private String dpa;
    @Size(max = 4)
    @Column(name = "dm")
    private String dm;
    @Size(max = 4)
    @Column(name = "vert")
    private String vert;
    @Size(max = 6)
    @Column(name = "ad")
    private String ad;
    @Size(max = 6)
    @Column(name = "lodesf")
    private String lodesf;
    @Size(max = 6)
    @Column(name = "lodcil")
    private String lodcil;
    @Size(max = 6)
    @Column(name = "lodeixo")
    private String lodeixo;
    @Size(max = 6)
    @Column(name = "loeesf")
    private String loeesf;
    @Size(max = 6)
    @Column(name = "loecil")
    private String loecil;
    @Size(max = 6)
    @Column(name = "loeeixo")
    private String loeeixo;
    @Size(max = 6)
    @Column(name = "podesf")
    private String podesf;
    @Size(max = 6)
    @Column(name = "podcil")
    private String podcil;
    @Size(max = 6)
    @Column(name = "podeixo")
    private String podeixo;
    @Size(max = 6)
    @Column(name = "poeesf")
    private String poeesf;
    @Size(max = 6)
    @Column(name = "poecil")
    private String poecil;
    @Size(max = 6)
    @Column(name = "poeeixo")
    private String poeeixo;
    @Size(max = 45)
    @Column(name = "observacao")
    private String observacao;
    @Size(max = 45)
    @Column(name = "obsreceita")
    private String obsreceita;
    @JoinColumn(name = "cliente_idclientes", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Cliente clienteIdclientes;
    @JoinColumn(name = "medico_idmedicos", referencedColumnName = "idmedicos")
    @ManyToOne(optional = false)
    private Medico medicoIdmedicos;
    @JoinColumn(name = "usuario_idusuarios", referencedColumnName = "idusuarios")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receitaIdreceitas")
    private Collection<Pedido> pedidoCollection;

    public Receita() {
    }

    public Receita(Integer idreceitas) {
        this.idreceitas = idreceitas;
    }

    public Integer getIdreceitas() {
        return idreceitas;
    }

    public void setIdreceitas(Integer idreceitas) {
        this.idreceitas = idreceitas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDnpod() {
        return dnpod;
    }

    public void setDnpod(String dnpod) {
        this.dnpod = dnpod;
    }

    public String getDnpoe() {
        return dnpoe;
    }

    public void setDnpoe(String dnpoe) {
        this.dnpoe = dnpoe;
    }

    public String getAco() {
        return aco;
    }

    public void setAco(String aco) {
        this.aco = aco;
    }

    public String getDpa() {
        return dpa;
    }

    public void setDpa(String dpa) {
        this.dpa = dpa;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getVert() {
        return vert;
    }

    public void setVert(String vert) {
        this.vert = vert;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getLodesf() {
        return lodesf;
    }

    public void setLodesf(String lodesf) {
        this.lodesf = lodesf;
    }

    public String getLodcil() {
        return lodcil;
    }

    public void setLodcil(String lodcil) {
        this.lodcil = lodcil;
    }

    public String getLodeixo() {
        return lodeixo;
    }

    public void setLodeixo(String lodeixo) {
        this.lodeixo = lodeixo;
    }

    public String getLoeesf() {
        return loeesf;
    }

    public void setLoeesf(String loeesf) {
        this.loeesf = loeesf;
    }

    public String getLoecil() {
        return loecil;
    }

    public void setLoecil(String loecil) {
        this.loecil = loecil;
    }

    public String getLoeeixo() {
        return loeeixo;
    }

    public void setLoeeixo(String loeeixo) {
        this.loeeixo = loeeixo;
    }

    public String getPodesf() {
        return podesf;
    }

    public void setPodesf(String podesf) {
        this.podesf = podesf;
    }

    public String getPodcil() {
        return podcil;
    }

    public void setPodcil(String podcil) {
        this.podcil = podcil;
    }

    public String getPodeixo() {
        return podeixo;
    }

    public void setPodeixo(String podeixo) {
        this.podeixo = podeixo;
    }

    public String getPoeesf() {
        return poeesf;
    }

    public void setPoeesf(String poeesf) {
        this.poeesf = poeesf;
    }

    public String getPoecil() {
        return poecil;
    }

    public void setPoecil(String poecil) {
        this.poecil = poecil;
    }

    public String getPoeeixo() {
        return poeeixo;
    }

    public void setPoeeixo(String poeeixo) {
        this.poeeixo = poeeixo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObsreceita() {
        return obsreceita;
    }

    public void setObsreceita(String obsreceita) {
        this.obsreceita = obsreceita;
    }

    public Cliente getClienteIdclientes() {
        return clienteIdclientes;
    }

    public void setClienteIdclientes(Cliente clienteIdclientes) {
        this.clienteIdclientes = clienteIdclientes;
    }

    public Medico getMedicoIdmedicos() {
        return medicoIdmedicos;
    }

    public void setMedicoIdmedicos(Medico medicoIdmedicos) {
        this.medicoIdmedicos = medicoIdmedicos;
    }

    public Usuario getUsuarioIdusuarios() {
        return usuarioIdusuarios;
    }

    public void setUsuarioIdusuarios(Usuario usuarioIdusuarios) {
        this.usuarioIdusuarios = usuarioIdusuarios;
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
        hash += (idreceitas != null ? idreceitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receita)) {
            return false;
        }
        Receita other = (Receita) object;
        if ((this.idreceitas == null && other.idreceitas != null) || (this.idreceitas != null && !this.idreceitas.equals(other.idreceitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Receita[ idreceitas=" + idreceitas + " ]";
    }
    
}
