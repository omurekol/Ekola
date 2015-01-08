/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author omur.alcin
 */
@Entity
@Table(name = "uyeler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uyeler.findAll", query = "SELECT u FROM Uyeler u"),
    @NamedQuery(name = "Uyeler.findByUyeId", query = "SELECT u FROM Uyeler u WHERE u.uyeId = :uyeId"),
    @NamedQuery(name = "Uyeler.findByUyeKadi", query = "SELECT u FROM Uyeler u WHERE u.uyeKadi = :uyeKadi"),
    @NamedQuery(name = "Uyeler.findByUyeSifre", query = "SELECT u FROM Uyeler u WHERE u.uyeSifre = :uyeSifre"),
    @NamedQuery(name = "Uyeler.findByUyeEposta", query = "SELECT u FROM Uyeler u WHERE u.uyeEposta = :uyeEposta"),
    @NamedQuery(name = "Uyeler.findByUyeTarih", query = "SELECT u FROM Uyeler u WHERE u.uyeTarih = :uyeTarih"),
    @NamedQuery(name = "Uyeler.findByUyeRutbe", query = "SELECT u FROM Uyeler u WHERE u.uyeRutbe = :uyeRutbe"),
    @NamedQuery(name = "Uyeler.findByUyeOnay", query = "SELECT u FROM Uyeler u WHERE u.uyeOnay = :uyeOnay"),
    @NamedQuery(name = "Uyeler.findByUyeAvatar", query = "SELECT u FROM Uyeler u WHERE u.uyeAvatar = :uyeAvatar"),
    @NamedQuery(name = "Uyeler.findByUyeYorum", query = "SELECT u FROM Uyeler u WHERE u.uyeYorum = :uyeYorum")})
public class Uyeler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "uye_id")
    private Integer uyeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "uye_kadi")
    private String uyeKadi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "uye_sifre")
    private String uyeSifre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "uye_eposta")
    private String uyeEposta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uye_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uyeTarih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uye_rutbe")
    private int uyeRutbe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uye_onay")
    private int uyeOnay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "uye_avatar")
    private String uyeAvatar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uye_yorum")
    private boolean uyeYorum;

    public Uyeler() {
    }

    public Uyeler(Integer uyeId) {
        this.uyeId = uyeId;
    }

    public Uyeler(Integer uyeId, String uyeKadi, String uyeSifre, String uyeEposta, Date uyeTarih, int uyeRutbe, int uyeOnay, String uyeAvatar, boolean uyeYorum) {
        this.uyeId = uyeId;
        this.uyeKadi = uyeKadi;
        this.uyeSifre = uyeSifre;
        this.uyeEposta = uyeEposta;
        this.uyeTarih = uyeTarih;
        this.uyeRutbe = uyeRutbe;
        this.uyeOnay = uyeOnay;
        this.uyeAvatar = uyeAvatar;
        this.uyeYorum = uyeYorum;
    }

    public Integer getUyeId() {
        return uyeId;
    }

    public void setUyeId(Integer uyeId) {
        this.uyeId = uyeId;
    }

    public String getUyeKadi() {
        return uyeKadi;
    }

    public void setUyeKadi(String uyeKadi) {
        this.uyeKadi = uyeKadi;
    }

    public String getUyeSifre() {
        return uyeSifre;
    }

    public void setUyeSifre(String uyeSifre) {
        this.uyeSifre = uyeSifre;
    }

    public String getUyeEposta() {
        return uyeEposta;
    }

    public void setUyeEposta(String uyeEposta) {
        this.uyeEposta = uyeEposta;
    }

    public Date getUyeTarih() {
        return uyeTarih;
    }

    public void setUyeTarih(Date uyeTarih) {
        this.uyeTarih = uyeTarih;
    }

    public int getUyeRutbe() {
        return uyeRutbe;
    }

    public void setUyeRutbe(int uyeRutbe) {
        this.uyeRutbe = uyeRutbe;
    }

    public int getUyeOnay() {
        return uyeOnay;
    }

    public void setUyeOnay(int uyeOnay) {
        this.uyeOnay = uyeOnay;
    }

    public String getUyeAvatar() {
        return uyeAvatar;
    }

    public void setUyeAvatar(String uyeAvatar) {
        this.uyeAvatar = uyeAvatar;
    }

    public boolean getUyeYorum() {
        return uyeYorum;
    }

    public void setUyeYorum(boolean uyeYorum) {
        this.uyeYorum = uyeYorum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uyeId != null ? uyeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uyeler)) {
            return false;
        }
        Uyeler other = (Uyeler) object;
        if ((this.uyeId == null && other.uyeId != null) || (this.uyeId != null && !this.uyeId.equals(other.uyeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Uyeler[ uyeId=" + uyeId + " ]";
    }
    
}
