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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdusuarios", query = "SELECT u FROM Usuario u WHERE u.idusuarios = :idusuarios"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findBySetor", query = "SELECT u FROM Usuario u WHERE u.setor = :setor"),
    @NamedQuery(name = "Usuario.findByAdmin", query = "SELECT u FROM Usuario u WHERE u.admin = :admin"),
    @NamedQuery(name = "Usuario.findByOnline", query = "SELECT u FROM Usuario u WHERE u.online = :online"),
    @NamedQuery(name = "Usuario.findByUltimologin", query = "SELECT u FROM Usuario u WHERE u.ultimologin = :ultimologin"),
    @NamedQuery(name = "Usuario.findByTelaatual", query = "SELECT u FROM Usuario u WHERE u.telaatual = :telaatual"),
    @NamedQuery(name = "Usuario.findByIp", query = "SELECT u FROM Usuario u WHERE u.ip = :ip"),
    @NamedQuery(name = "Usuario.findByTelefone", query = "SELECT u FROM Usuario u WHERE u.telefone = :telefone"),
    @NamedQuery(name = "Usuario.findBySessao", query = "SELECT u FROM Usuario u WHERE u.sessao = :sessao")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuarios")
    private Integer idusuarios;
    @Size(max = 30)
    @Column(name = "nome")
    private String nome;
    @Size(max = 255)
    @Column(name = "senha")
    private String senha;
    @Size(max = 20)
    @Column(name = "setor")
    private String setor;
    @Column(name = "admin")
    private Boolean admin;
    @Column(name = "online")
    private Boolean online;
    @Column(name = "ultimologin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimologin;
    @Size(max = 15)
    @Column(name = "telaatual")
    private String telaatual;
    @Size(max = 15)
    @Column(name = "ip")
    private String ip;
    @Size(max = 15)
    @Column(name = "telefone")
    private String telefone;
    @Size(max = 255)
    @Column(name = "sessao")
    private String sessao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuarios")
    private Collection<Receita> receitaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuarios")
    private Collection<Permissao> permissaoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuarios")
    private Collection<Pedido> pedidoCollection;
    @JoinColumn(name = "empresa_idempresas", referencedColumnName = "idempresas")
    @ManyToOne(optional = false)
    private Empresa empresaIdempresas;

    public Usuario() {
    }

    public Usuario(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public Integer getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Date getUltimologin() {
        return ultimologin;
    }

    public void setUltimologin(Date ultimologin) {
        this.ultimologin = ultimologin;
    }

    public String getTelaatual() {
        return telaatual;
    }

    public void setTelaatual(String telaatual) {
        this.telaatual = telaatual;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    @XmlTransient
    public Collection<Receita> getReceitaCollection() {
        return receitaCollection;
    }

    public void setReceitaCollection(Collection<Receita> receitaCollection) {
        this.receitaCollection = receitaCollection;
    }

    @XmlTransient
    public Collection<Permissao> getPermissaoCollection() {
        return permissaoCollection;
    }

    public void setPermissaoCollection(Collection<Permissao> permissaoCollection) {
        this.permissaoCollection = permissaoCollection;
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    public Empresa getEmpresaIdempresas() {
        return empresaIdempresas;
    }

    public void setEmpresaIdempresas(Empresa empresaIdempresas) {
        this.empresaIdempresas = empresaIdempresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuarios != null ? idusuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuarios == null && other.idusuarios != null) || (this.idusuarios != null && !this.idusuarios.equals(other.idusuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Usuario[ idusuarios=" + idusuarios + " ]";
    }
    
}
