/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMG;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * @author AAA
 */
@Entity
@Table(name = "SOLICITUD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s"),
    @NamedQuery(name = "Solicitud.findByIdsolicitud", query = "SELECT s FROM Solicitud s WHERE s.idsolicitud = :idsolicitud"),
    @NamedQuery(name = "Solicitud.findByFechac", query = "SELECT s FROM Solicitud s WHERE s.fechac = :fechac"),
    @NamedQuery(name = "Solicitud.findByPaquetecomp", query = "SELECT s FROM Solicitud s WHERE s.paquetecomp = :paquetecomp"),
    @NamedQuery(name = "Solicitud.findByVasig", query = "SELECT s FROM Solicitud s WHERE s.vasig = :vasig"),
    @NamedQuery(name = "Solicitud.findByPrecio", query = "SELECT s FROM Solicitud s WHERE s.precio = :precio")})
public class Solicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOLICITUD")
    private Short idsolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "PAQUETECOMP")
    private String paquetecomp;
    @Size(max = 40)
    @Column(name = "VASIG")
    private String vasig;
    @Column(name = "PRECIO")
    private Short precio;

    public Solicitud() {
    }

    public Solicitud(Short idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public Solicitud(Short idsolicitud, Date fechac, String paquetecomp) {
        this.idsolicitud = idsolicitud;
        this.fechac = fechac;
        this.paquetecomp = paquetecomp;
    }

    public Short getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(Short idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public Date getFechac() {
        return fechac;
    }

    public void setFechac(Date fechac) {
        this.fechac = fechac;
    }

    public String getPaquetecomp() {
        return paquetecomp;
    }

    public void setPaquetecomp(String paquetecomp) {
        this.paquetecomp = paquetecomp;
    }

    public String getVasig() {
        return vasig;
    }

    public void setVasig(String vasig) {
        this.vasig = vasig;
    }

    public Short getPrecio() {
        return precio;
    }

    public void setPrecio(Short precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsolicitud != null ? idsolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.idsolicitud == null && other.idsolicitud != null) || (this.idsolicitud != null && !this.idsolicitud.equals(other.idsolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UMG.Solicitud[ idsolicitud=" + idsolicitud + " ]";
    }
    
}
