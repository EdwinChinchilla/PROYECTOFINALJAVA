/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMG;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AAA
 */
@Entity
@Table(name = "AGENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencia.findAll", query = "SELECT a FROM Agencia a"),
    @NamedQuery(name = "Agencia.findByCoda", query = "SELECT a FROM Agencia a WHERE a.coda = :coda"),
    @NamedQuery(name = "Agencia.findByNombreag", query = "SELECT a FROM Agencia a WHERE a.nombreag = :nombreag"),
    @NamedQuery(name = "Agencia.findByDireccion", query = "SELECT a FROM Agencia a WHERE a.direccion = :direccion"),
    @NamedQuery(name = "Agencia.findByDepartamento", query = "SELECT a FROM Agencia a WHERE a.departamento = :departamento"),
    @NamedQuery(name = "Agencia.findByTelefono", query = "SELECT a FROM Agencia a WHERE a.telefono = :telefono")})
public class Agencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODA")
    private Integer coda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBREAG")
    private String nombreag;
    @Size(max = 40)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO")
    private int telefono;

    public Agencia() {
    }

    public Agencia(Integer coda) {
        this.coda = coda;
    }

    public Agencia(Integer coda, String nombreag, String departamento, int telefono) {
        this.coda = coda;
        this.nombreag = nombreag;
        this.departamento = departamento;
        this.telefono = telefono;
    }

    public Integer getCoda() {
        return coda;
    }

    public void setCoda(Integer coda) {
        this.coda = coda;
    }

    public String getNombreag() {
        return nombreag;
    }

    public void setNombreag(String nombreag) {
        this.nombreag = nombreag;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coda != null ? coda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencia)) {
            return false;
        }
        Agencia other = (Agencia) object;
        if ((this.coda == null && other.coda != null) || (this.coda != null && !this.coda.equals(other.coda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UMG.Agencia[ coda=" + coda + " ]";
    }
    
}
