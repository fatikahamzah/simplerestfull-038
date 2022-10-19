/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PWS.Perpustakaan;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "employee")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByIdEmp", query = "SELECT e FROM Employee e WHERE e.idEmp = :idEmp"),
    @NamedQuery(name = "Employee.findByNmEmp", query = "SELECT e FROM Employee e WHERE e.nmEmp = :nmEmp")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_emp")
    private String idEmp;
    @Basic(optional = false)
    @Column(name = "nm_emp")
    private String nmEmp;

    public Employee() {
    }

    public Employee(String idEmp) {
        this.idEmp = idEmp;
    }

    public Employee(String idEmp, String nmEmp) {
        this.idEmp = idEmp;
        this.nmEmp = nmEmp;
    }

    public String getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(String idEmp) {
        this.idEmp = idEmp;
    }

    public String getNmEmp() {
        return nmEmp;
    }

    public void setNmEmp(String nmEmp) {
        this.nmEmp = nmEmp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmp != null ? idEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.idEmp == null && other.idEmp != null) || (this.idEmp != null && !this.idEmp.equals(other.idEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PWS.Perpustakaan.Employee[ idEmp=" + idEmp + " ]";
    }
    
}
