/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author omur.alcin
 */
@Entity
@Table(name = "konuluyorumlar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Konuluyorumlar.findAll", query = "SELECT k FROM Konuluyorumlar k"),
    @NamedQuery(name = "Konuluyorumlar.findByKonularId", query = "SELECT k FROM Konuluyorumlar k WHERE k.konuluyorumlarPK.konularId = :konularId"),
    @NamedQuery(name = "Konuluyorumlar.findByYorumlarId", query = "SELECT k FROM Konuluyorumlar k WHERE k.konuluyorumlarPK.yorumlarId = :yorumlarId")})
public class Konuluyorumlar implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KonuluyorumlarPK konuluyorumlarPK;

    public Konuluyorumlar() {
    }

    public Konuluyorumlar(KonuluyorumlarPK konuluyorumlarPK) {
        this.konuluyorumlarPK = konuluyorumlarPK;
    }

    public Konuluyorumlar(int konularId, int yorumlarId) {
        this.konuluyorumlarPK = new KonuluyorumlarPK(konularId, yorumlarId);
    }

    public KonuluyorumlarPK getKonuluyorumlarPK() {
        return konuluyorumlarPK;
    }

    public void setKonuluyorumlarPK(KonuluyorumlarPK konuluyorumlarPK) {
        this.konuluyorumlarPK = konuluyorumlarPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (konuluyorumlarPK != null ? konuluyorumlarPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Konuluyorumlar)) {
            return false;
        }
        Konuluyorumlar other = (Konuluyorumlar) object;
        if ((this.konuluyorumlarPK == null && other.konuluyorumlarPK != null) || (this.konuluyorumlarPK != null && !this.konuluyorumlarPK.equals(other.konuluyorumlarPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Konuluyorumlar[ konuluyorumlarPK=" + konuluyorumlarPK + " ]";
    }
    
}
