/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author bufal
 */
@Entity
@Table(name = "departamentos")
public class Departamentos {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="dclave")
    private long clave;

    @Column(name = "nombre")
    private String nombre;
//    @OneToMany(fetch = FetchType.LAZY, mappedBy= "empleados", cascade = CascadeType.ALL)
//    //private Empleados empleados;
//    Set empleados = new HashSet();

    @OneToMany(mappedBy = "departamentos")
    private Set<Empleados> empleados = new HashSet<>();
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name ="clave")
//    private long clave;
//    
//    @Column(name="nombre")
//    private String nombre;
//    
//    @OneToMany(mappedBy = "departamentos")
//    @JsonManagedReference(value = "empleados")
//    private Set<Empleados> empleados = new HashSet<>();
//    @OneToMany(mappedBy="departamentos")
//    Set<Empleados> empleados;
    
   
 //private Set<Empleados> empleados = new HashSet<>(); 

    public Set getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }



    public Departamentos() {
    }

    public Departamentos(long clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Departamentos{" + "clave=" + clave + ", nombre=" + nombre + '}';
    }

    
}
