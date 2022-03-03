/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudDao;

/**
 *
 * @author bufal
 */
public class FactoryDao {
     public enum Type{
        EMPLEADOS, DEPARTAMENTOS
    }
    public static IDao getDao(Type option){
       IDao idao = null;
       switch(option){
           case EMPLEADOS:
               idao = new EmpleadoDao();
               break;
           case DEPARTAMENTOS:
               System.out.println("No existe el departamento...");
               break;
           default:
               System.out.println("no se encontro el DAO");
       }
       return idao;
       
    }
    
}
