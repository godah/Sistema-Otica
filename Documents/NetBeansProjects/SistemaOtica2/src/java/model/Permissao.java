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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luciano
 */
@Entity
@Table(name = "permissao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permissao.findAll", query = "SELECT p FROM Permissao p"),
    @NamedQuery(name = "Permissao.findByIdpermissoes", query = "SELECT p FROM Permissao p WHERE p.idpermissoes = :idpermissoes"),
    @NamedQuery(name = "Permissao.findByPagina", query = "SELECT p FROM Permissao p WHERE p.pagina = :pagina"),
    @NamedQuery(name = "Permissao.findByLeitura", query = "SELECT p FROM Permissao p WHERE p.leitura = :leitura"),
    @NamedQuery(name = "Permissao.findByAdicao", query = "SELECT p FROM Permissao p WHERE p.adicao = :adicao"),
    @NamedQuery(name = "Permissao.findByEdicao", query = "SELECT p FROM Permissao p WHERE p.edicao = :edicao"),
    @NamedQuery(name = "Permissao.findByExclusao", query = "SELECT p FROM Permissao p WHERE p.exclusao = :exclusao")})
public class Permissao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpermissoes")
    private Integer idpermissoes;
    @Size(max = 15)
    @Column(name = "pagina")
    private String pagina;
    @Column(name = "leitura")
    private Boolean leitura;
    @Column(name = "adicao")
    private Boolean adicao;
    @Column(name = "edicao")
    private Boolean edicao;
    @Column(name = "exclusao")
    private Boolean exclusao;
    @JoinColumn(name = "usuario_idusuarios", referencedColumnName = "idusuarios")
    @ManyToOne(optional = false)
    private Usuario usuarioIdusuarios;

    public Permissao() {
    }

    public Permissao(Integer idpermissoes) {
        this.idpermissoes = idpermissoes;
    }

    public Integer getIdpermissoes() {
        return idpermissoes;
    }

    public void setIdpermissoes(Integer idpermissoes) {
        this.idpermissoes = idpermissoes;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public Boolean getLeitura() {
        return leitura;
    }

    public void setLeitura(Boolean leitura) {
        this.leitura = leitura;
    }

    public Boolean getAdicao() {
        return adicao;
    }

    public void setAdicao(Boolean adicao) {
        this.adicao = adicao;
    }

    public Boolean getEdicao() {
        return edicao;
    }

    public void setEdicao(Boolean edicao) {
        this.edicao = edicao;
    }

    public Boolean getExclusao() {
        return exclusao;
    }

    public void setExclusao(Boolean exclusao) {
        this.exclusao = exclusao;
    }

    public Usuario getUsuarioIdusuarios() {
        return usuarioIdusuarios;
    }

    public void setUsuarioIdusuarios(Usuario usuarioIdusuarios) {
        this.usuarioIdusuarios = usuarioIdusuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpermissoes != null ? idpermissoes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permissao)) {
            return false;
        }
        Permissao other = (Permissao) object;
        if ((this.idpermissoes == null && other.idpermissoes != null) || (this.idpermissoes != null && !this.idpermissoes.equals(other.idpermissoes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Permissao[ idpermissoes=" + idpermissoes + " ]";
    }
    
}
