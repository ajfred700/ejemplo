/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudDao;

import CrudDao.DepartamentoDao;
import models.Departamentos;
import models.Empleados;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author bufal
 */

public class Principal {
   
    public static void main(String[] arg){
//        SessionFactory sessionFactory = new Configuration().configure().
//                buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        System.out.println("se conecto");
//        session.getTransaction().commit();
//        session.close();
        
//        DepartamentoDao depa = new DepartamentoDao();
//        Departamentos departamento = null ;
//        departamento.setNombre("Contabilidad");
//        departamento.setClave(0);
//        depa.guardar(departamento);
        IDao dapa =  new DepartamentoDao();
        
        IDao Emple = new EmpleadoDao();
        DepartamentoDao departa = new DepartamentoDao();
        
       
         Departamentos departamento = new Departamentos();
         departamento.setClave(2);
         departamento.setNombre("Informatica");
         //System.out.println(Emple.mostrar(12));
        //System.out.println(Emple.mostrar(12)+"\n"+departa.mostrar(1)+"\n");
        //System.out.println("\n"+ +"\n");
       
       
        
       Empleados empleado = new Empleados();
       // Emple.borrar(empleado);
        empleado.setClave(10);
        empleado.setNombre("Citlalli");
        empleado.setDireccion("calle 5");
        empleado.setTelefono("272535454632");
        Emple.guardar(empleado);
        
        
       
        
        
        

       
        
       
        
        
        
    }
}
