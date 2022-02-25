/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudDao;

import java.util.List;

/**
 *
 * @author bufal
 */
public interface IDao<T> {
    
    public boolean guardar(T pojo);
    public boolean borrar (T pojo);
    public boolean actulizar (T pojo);
    public List mostrar (long clave);
    
    
    
    
}
