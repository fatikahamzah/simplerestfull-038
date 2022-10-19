/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PWS.Perpustakaan;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "member")
@NamedQueries({
    @NamedQuery(name = "Member1.findAll", query = "SELECT m FROM Member1 m"),
    @NamedQuery(name = "Member1.findByIdMember", query = "SELECT m FROM Member1 m WHERE m.idMember = :idMember"),
    @NamedQuery(name = "Member1.findByNmMember", query = "SELECT m FROM Member1 m WHERE m.nmMember = :nmMember"),
    @NamedQuery(name = "Member1.findByAlmtMember", query = "SELECT m FROM Member1 m WHERE m.almtMember = :almtMember"),
    @NamedQuery(name = "Member1.findByTlpMember", query = "SELECT m FROM Member1 m WHERE m.tlpMember = :tlpMember"),
    @NamedQuery(name = "Member1.findByPass", query = "SELECT m FROM Member1 m WHERE m.pass = :pass")})
public class Member1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_member")
    private String idMember;
    @Basic(optional = false)
    @Column(name = "nm_member")
    private String nmMember;
    @Basic(optional = false)
    @Column(name = "almt_member")
    private String almtMember;
    @Basic(optional = false)
    @Column(name = "tlp_member")
    private int tlpMember;
    @Basic(optional = false)
    @Column(name = "pass")
    private String pass;

    public Member1() {
    }

    public Member1(String idMember) {
        this.idMember = idMember;
    }

    public Member1(String idMember, String nmMember, String almtMember, int tlpMember, String pass) {
        this.idMember = idMember;
        this.nmMember = nmMember;
        this.almtMember = almtMember;
        this.tlpMember = tlpMember;
        this.pass = pass;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNmMember() {
        return nmMember;
    }

    public void setNmMember(String nmMember) {
        this.nmMember = nmMember;
    }

    public String getAlmtMember() {
        return almtMember;
    }

    public void setAlmtMember(String almtMember) {
        this.almtMember = almtMember;
    }

    public int getTlpMember() {
        return tlpMember;
    }

    public void setTlpMember(int tlpMember) {
        this.tlpMember = tlpMember;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMember != null ? idMember.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Member1)) {
            return false;
        }
        Member1 other = (Member1) object;
        if ((this.idMember == null && other.idMember != null) || (this.idMember != null && !this.idMember.equals(other.idMember))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PWS.Perpustakaan.Member1[ idMember=" + idMember + " ]";
    }
    
}
