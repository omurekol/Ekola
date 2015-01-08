/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author omur.alcin
 */
@Embeddable
public class KonuluyorumlarPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "konular_id")
    private int konularId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "yorumlar_id")
    private int yorumlarId;

    public KonuluyorumlarPK() {
    }

    public KonuluyorumlarPK(int konularId, int yorumlarId) {
        this.konularId = konularId;
        this.yorumlarId = yorumlarId;
    }

    public int getKonularId() {
        return konularId;
    }

    public void setKonularId(int konularId) {
        this.konularId = konularId;
    }

    public int getYorumlarId() {
        return yorumlarId;
    }

    public void setYorumlarId(int yorumlarId) {
        this.yorumlarId = yorumlarId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) konularId;
        hash += (int) yorumlarId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KonuluyorumlarPK)) {
            return false;
        }
        KonuluyorumlarPK other = (KonuluyorumlarPK) object;
        if (this.konularId != other.konularId) {
            return false;
        }
        if (this.yorumlarId != other.yorumlarId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.KonuluyorumlarPK[ konularId=" + konularId + ", yorumlarId=" + yorumlarId + " ]";
    }
    
}
