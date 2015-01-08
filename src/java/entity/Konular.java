/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author omur.alcin
 */
@Entity
@Table(name = "konular")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Konular.findAll", query = "SELECT k FROM Konular k"),
    @NamedQuery(name = "Konular.findByKonuId", query = "SELECT k FROM Konular k WHERE k.konuId = :konuId"),
    @NamedQuery(name = "Konular.findByKonuYorumId", query = "SELECT k FROM Konular k WHERE k.konuYorumId = :konuYorumId"),
    @NamedQuery(name = "Konular.findByKonuYazariId", query = "SELECT k FROM Konular k WHERE k.konuYazariId = :konuYazariId"),
    @NamedQuery(name = "Konular.findByKonuBaslik", query = "SELECT k FROM Konular k WHERE k.konuBaslik = :konuBaslik")})
public class Konular implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "konu_id")
    private Integer konuId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "konu_yorum_id")
    private int konuYorumId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "konu_yazari_id")
    private int konuYazariId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "konu_baslik")
    private String konuBaslik;

    public Konular() {
    }

    public Konular(Integer konuId) {
        this.konuId = konuId;
    }

    public Konular(Integer konuId, int konuYorumId, int konuYazariId, String konuBaslik) {
        this.konuId = konuId;
        this.konuYorumId = konuYorumId;
        this.konuYazariId = konuYazariId;
        this.konuBaslik = konuBaslik;
    }

    public Integer getKonuId() {
        return konuId;
    }

    public void setKonuId(Integer konuId) {
        this.konuId = konuId;
    }

    public int getKonuYorumId() {
        return konuYorumId;
    }

    public void setKonuYorumId(int konuYorumId) {
        this.konuYorumId = konuYorumId;
    }

    public int getKonuYazariId() {
        return konuYazariId;
    }

    public void setKonuYazariId(int konuYazariId) {
        this.konuYazariId = konuYazariId;
    }

    public String getKonuBaslik() {
        return konuBaslik;
    }

    public void setKonuBaslik(String konuBaslik) {
        this.konuBaslik = konuBaslik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (konuId != null ? konuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Konular)) {
            return false;
        }
        Konular other = (Konular) object;
        if ((this.konuId == null && other.konuId != null) || (this.konuId != null && !this.konuId.equals(other.konuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Konular[ konuId=" + konuId + " ]";
    }
    
}
