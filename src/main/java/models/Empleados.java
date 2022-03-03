/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
 
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author bufal
 */
@Entity
@Table(name = "empleados")
public class Empleados {
     private static final long serialVersionUID = 1L;
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column (name ="eclave")
     private long clave;
     
     @Column(name = "nombre")
     private String nombre;
     
     @Column (name = "direccion")
     private String direccion;
     
     @Column (name = "telefono")
     private String telefono;
     
     @ManyToOne
     @JoinColumn(name = "depaclave")
     private Departamentos departamentos;
//////////////////////////////////////////////////////
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long clave;
//
//    @Column(name = "nombre", length = 50)
//    private String nombre;
//
//    @Column(name = "direccion", length = 100)
//    private String direccion;
//
//    @Column(name = "telefono", length = 15)
//    private String telefono;
//
//    @ManyToOne(optional = true, fetch = FetchType.EAGER)
//    @JoinColumn(name = "eclave")
//    @JsonBackReference(value = "empleado")
//    private Departamentos departamento;
    //////////////////////////////////////////////////
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "clave")
//    private long Eclave;
//    
//    @Column(name = "nombre")
//    private String nombre;
//    
//    @Column (name = "direccion")
//    private String direccion;
//    
//    @Column (name = "telefono")
//    private String telefono;
//     @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "clave")
//    @JsonBackReference(value = "empleados")
//    private Departamentos departamentos;
//    @ManyToOne
//    @JoinColumn(name ="eclave")
//    private Departamentos departamentos;

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Empleados() {
    }

    public Empleados(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
	public String toString() {
		return "Nuevo empleado =" + clave + ", Nombre: " + nombre + ", Dirección: =" + direccion
				+ ", Telefono: =" + telefono + "]";
	}

   

    
    
}
