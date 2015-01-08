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
@Table(name = "kategoriler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kategoriler.findAll", query = "SELECT k FROM Kategoriler k"),
    @NamedQuery(name = "Kategoriler.findByKategoriId", query = "SELECT k FROM Kategoriler k WHERE k.kategoriId = :kategoriId"),
    @NamedQuery(name = "Kategoriler.findByKategoriAdi", query = "SELECT k FROM Kategoriler k WHERE k.kategoriAdi = :kategoriAdi"),
    @NamedQuery(name = "Kategoriler.findByKategoriTarih", query = "SELECT k FROM Kategoriler k WHERE k.kategoriTarih = :kategoriTarih"),
    @NamedQuery(name = "Kategoriler.findByKategoriLink", query = "SELECT k FROM Kategoriler k WHERE k.kategoriLink = :kategoriLink"),
    @NamedQuery(name = "Kategoriler.findByKategoriDesc", query = "SELECT k FROM Kategoriler k WHERE k.kategoriDesc = :kategoriDesc"),
    @NamedQuery(name = "Kategoriler.findByKategoriKeyw", query = "SELECT k FROM Kategoriler k WHERE k.kategoriKeyw = :kategoriKeyw"),
    @NamedQuery(name = "Kategoriler.findByKategoriAnasayfaKonu", query = "SELECT k FROM Kategoriler k WHERE k.kategoriAnasayfaKonu = :kategoriAnasayfaKonu"),
    @NamedQuery(name = "Kategoriler.findByKategoriFullKonu", query = "SELECT k FROM Kategoriler k WHERE k.kategoriFullKonu = :kategoriFullKonu")})
public class Kategoriler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kategori_id")
    private Integer kategoriId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "kategori_adi")
    private String kategoriAdi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kategori_tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kategoriTarih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "kategori_link")
    private String kategoriLink;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "kategori_desc")
    private String kategoriDesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "kategori_keyw")
    private String kategoriKeyw;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "kategori_anasayfa_konu")
    private String kategoriAnasayfaKonu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "kategori_full_konu")
    private String kategoriFullKonu;

    public Kategoriler() {
    }

    public Kategoriler(Integer kategoriId) {
        this.kategoriId = kategoriId;
    }

    public Kategoriler(Integer kategoriId, String kategoriAdi, Date kategoriTarih, String kategoriLink, String kategoriDesc, String kategoriKeyw, String kategoriAnasayfaKonu, String kategoriFullKonu) {
        this.kategoriId = kategoriId;
        this.kategoriAdi = kategoriAdi;
        this.kategoriTarih = kategoriTarih;
        this.kategoriLink = kategoriLink;
        this.kategoriDesc = kategoriDesc;
        this.kategoriKeyw = kategoriKeyw;
        this.kategoriAnasayfaKonu = kategoriAnasayfaKonu;
        this.kategoriFullKonu = kategoriFullKonu;
    }

    public Integer getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(Integer kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public Date getKategoriTarih() {
        return kategoriTarih;
    }

    public void setKategoriTarih(Date kategoriTarih) {
        this.kategoriTarih = kategoriTarih;
    }

    public String getKategoriLink() {
        return kategoriLink;
    }

    public void setKategoriLink(String kategoriLink) {
        this.kategoriLink = kategoriLink;
    }

    public String getKategoriDesc() {
        return kategoriDesc;
    }

    public void setKategoriDesc(String kategoriDesc) {
        this.kategoriDesc = kategoriDesc;
    }

    public String getKategoriKeyw() {
        return kategoriKeyw;
    }

    public void setKategoriKeyw(String kategoriKeyw) {
        this.kategoriKeyw = kategoriKeyw;
    }

    public String getKategoriAnasayfaKonu() {
        return kategoriAnasayfaKonu;
    }

    public void setKategoriAnasayfaKonu(String kategoriAnasayfaKonu) {
        this.kategoriAnasayfaKonu = kategoriAnasayfaKonu;
    }

    public String getKategoriFullKonu() {
        return kategoriFullKonu;
    }

    public void setKategoriFullKonu(String kategoriFullKonu) {
        this.kategoriFullKonu = kategoriFullKonu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kategoriId != null ? kategoriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kategoriler)) {
            return false;
        }
        Kategoriler other = (Kategoriler) object;
        if ((this.kategoriId == null && other.kategoriId != null) || (this.kategoriId != null && !this.kategoriId.equals(other.kategoriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Kategoriler[ kategoriId=" + kategoriId + " ]";
    }
    
}
