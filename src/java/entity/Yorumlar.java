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
import javax.persistence.Lob;
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
@Table(name = "yorumlar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Yorumlar.findAll", query = "SELECT y FROM Yorumlar y"),
    @NamedQuery(name = "Yorumlar.findByYorumId", query = "SELECT y FROM Yorumlar y WHERE y.yorumId = :yorumId"),
    @NamedQuery(name = "Yorumlar.findByUyeId", query = "SELECT y FROM Yorumlar y WHERE y.uyeId = :uyeId"),
    @NamedQuery(name = "Yorumlar.findByKonuId", query = "SELECT y FROM Yorumlar y WHERE y.konuId = :konuId"),
    @NamedQuery(name = "Yorumlar.findByBegenenId", query = "SELECT y FROM Yorumlar y WHERE y.begenenId = :begenenId"),
    @NamedQuery(name = "Yorumlar.findByYorumBaslik", query = "SELECT y FROM Yorumlar y WHERE y.yorumBaslik = :yorumBaslik"),
    @NamedQuery(name = "Yorumlar.findByYorumTarihi", query = "SELECT y FROM Yorumlar y WHERE y.yorumTarihi = :yorumTarihi"),
    @NamedQuery(name = "Yorumlar.findByYorumsuzlukAvatar\u0131", query = "SELECT y FROM Yorumlar y WHERE y.yorumsuzlukAvatar\u0131 = :yorumsuzlukAvatar\u0131")})
public class Yorumlar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "yorum_id")
    private Integer yorumId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uye_id")
    private int uyeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "konu_id")
    private int konuId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "begenen_id")
    private int begenenId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "yorum_baslik")
    private String yorumBaslik;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "yorum_icerik")
    private String yorumIcerik;
    @Basic(optional = false)
    @NotNull
    @Column(name = "yorum_tarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date yorumTarihi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "yorumsuzluk_avatar\u0131")
    private String yorumsuzlukAvatarı;

    public Yorumlar() {
    }

    public Yorumlar(Integer yorumId) {
        this.yorumId = yorumId;
    }

    public Yorumlar(Integer yorumId, int uyeId, int konuId, int begenenId, String yorumBaslik, String yorumIcerik, Date yorumTarihi, String yorumsuzlukAvatarı) {
        this.yorumId = yorumId;
        this.uyeId = uyeId;
        this.konuId = konuId;
        this.begenenId = begenenId;
        this.yorumBaslik = yorumBaslik;
        this.yorumIcerik = yorumIcerik;
        this.yorumTarihi = yorumTarihi;
        this.yorumsuzlukAvatarı = yorumsuzlukAvatarı;
    }

    public Integer getYorumId() {
        return yorumId;
    }

    public void setYorumId(Integer yorumId) {
        this.yorumId = yorumId;
    }

    public int getUyeId() {
        return uyeId;
    }

    public void setUyeId(int uyeId) {
        this.uyeId = uyeId;
    }

    public int getKonuId() {
        return konuId;
    }

    public void setKonuId(int konuId) {
        this.konuId = konuId;
    }

    public int getBegenenId() {
        return begenenId;
    }

    public void setBegenenId(int begenenId) {
        this.begenenId = begenenId;
    }

    public String getYorumBaslik() {
        return yorumBaslik;
    }

    public void setYorumBaslik(String yorumBaslik) {
        this.yorumBaslik = yorumBaslik;
    }

    public String getYorumIcerik() {
        return yorumIcerik;
    }

    public void setYorumIcerik(String yorumIcerik) {
        this.yorumIcerik = yorumIcerik;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    public String getYorumsuzlukAvatarı() {
        return yorumsuzlukAvatarı;
    }

    public void setYorumsuzlukAvatarı(String yorumsuzlukAvatarı) {
        this.yorumsuzlukAvatarı = yorumsuzlukAvatarı;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yorumId != null ? yorumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Yorumlar)) {
            return false;
        }
        Yorumlar other = (Yorumlar) object;
        if ((this.yorumId == null && other.yorumId != null) || (this.yorumId != null && !this.yorumId.equals(other.yorumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Yorumlar[ yorumId=" + yorumId + " ]";
    }
    
}
