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
@Table(name = "PAQUETE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paquete.findAll", query = "SELECT p FROM Paquete p"),
    @NamedQuery(name = "Paquete.findByNombrep", query = "SELECT p FROM Paquete p WHERE p.nombrep = :nombrep"),
    @NamedQuery(name = "Paquete.findByDescripcion", query = "SELECT p FROM Paquete p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Paquete.findByFechae", query = "SELECT p FROM Paquete p WHERE p.fechae = :fechae"),
    @NamedQuery(name = "Paquete.findByPrecio", query = "SELECT p FROM Paquete p WHERE p.precio = :precio"),
    @NamedQuery(name = "Paquete.findByIdpa", query = "SELECT p FROM Paquete p WHERE p.idpa = :idpa")})
public class Paquete implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NOMBREP")
    private String nombrep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechae;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO")
    private int precio;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPA")
    private Short idpa;

    public Paquete() {
    }

    public Paquete(Short idpa) {
        this.idpa = idpa;
    }

    public Paquete(Short idpa, String nombrep, String descripcion, Date fechae, int precio) {
        this.idpa = idpa;
        this.nombrep = nombrep;
        this.descripcion = descripcion;
        this.fechae = fechae;
        this.precio = precio;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechae() {
        return fechae;
    }

    public void setFechae(Date fechae) {
        this.fechae = fechae;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Short getIdpa() {
        return idpa;
    }

    public void setIdpa(Short idpa) {
        this.idpa = idpa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpa != null ? idpa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paquete)) {
            return false;
        }
        Paquete other = (Paquete) object;
        if ((this.idpa == null && other.idpa != null) || (this.idpa != null && !this.idpa.equals(other.idpa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UMG.Paquete[ idpa=" + idpa + " ]";
    }
    
}
