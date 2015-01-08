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
@Table(name = "begeniler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Begeniler.findAll", query = "SELECT b FROM Begeniler b"),
    @NamedQuery(name = "Begeniler.findByBegeniId", query = "SELECT b FROM Begeniler b WHERE b.begeniId = :begeniId"),
    @NamedQuery(name = "Begeniler.findByYorumId", query = "SELECT b FROM Begeniler b WHERE b.yorumId = :yorumId"),
    @NamedQuery(name = "Begeniler.findByBegenenId", query = "SELECT b FROM Begeniler b WHERE b.begenenId = :begenenId"),
    @NamedQuery(name = "Begeniler.findByBegenenAdi", query = "SELECT b FROM Begeniler b WHERE b.begenenAdi = :begenenAdi")})
public class Begeniler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "begeni_id")
    private Integer begeniId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "yorum_id")
    private int yorumId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "begenen_id")
    private int begenenId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "begenen_adi")
    private String begenenAdi;

    public Begeniler() {
    }

    public Begeniler(Integer begeniId) {
        this.begeniId = begeniId;
    }

    public Begeniler(Integer begeniId, int yorumId, int begenenId, String begenenAdi) {
        this.begeniId = begeniId;
        this.yorumId = yorumId;
        this.begenenId = begenenId;
        this.begenenAdi = begenenAdi;
    }

    public Integer getBegeniId() {
        return begeniId;
    }

    public void setBegeniId(Integer begeniId) {
        this.begeniId = begeniId;
    }

    public int getYorumId() {
        return yorumId;
    }

    public void setYorumId(int yorumId) {
        this.yorumId = yorumId;
    }

    public int getBegenenId() {
        return begenenId;
    }

    public void setBegenenId(int begenenId) {
        this.begenenId = begenenId;
    }

    public String getBegenenAdi() {
        return begenenAdi;
    }

    public void setBegenenAdi(String begenenAdi) {
        this.begenenAdi = begenenAdi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (begeniId != null ? begeniId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Begeniler)) {
            return false;
        }
        Begeniler other = (Begeniler) object;
        if ((this.begeniId == null && other.begeniId != null) || (this.begeniId != null && !this.begeniId.equals(other.begeniId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Begeniler[ begeniId=" + begeniId + " ]";
    }
    
}
