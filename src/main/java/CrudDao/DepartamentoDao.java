/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudDao;

import java.util.List;
import models.Departamentos;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;
import org.sample.maven2.uv.Hibernate;

/**
 *
 * @author bufal
 */
public class DepartamentoDao implements IDao<Departamentos> {

    private Session session;

    @Override
    public boolean guardar(Departamentos pojo) {
        boolean res = false;

        try {

            session = Hibernate.getSessionFactory().openSession();  //getSessionFactory.openSession();
            System.out.println("--- Conectado ---");

            session.beginTransaction();

            System.out.println("--- Transacción iniciada ---");

            session.save(pojo);

            session.getTransaction().commit();

            res = true;
        } catch (ConstraintViolationException cve) {

            session.getTransaction().rollback();
            System.out.println("No se ha podido finalizar la transacción");
            return res;

        }
        return res;

    }

    @Override
    public boolean borrar(Departamentos pojo) {
    boolean centinela = false;

        session = Hibernate.getSessionFactory().openSession();
        System.out.println("--- Conectado ---");

        try {

            session.beginTransaction();
            System.out.println("--- Eliminando ---");

            session.delete(pojo);
            session.getTransaction().commit();

            centinela = true;
            System.out.println("Eliminado");

        } catch (Exception e) {

            System.out.println("Algo salió mal: " + e.getMessage());

        }

        return centinela;
    }

    @Override
    public boolean actulizar(Departamentos pojo) {
        boolean res = false;

        session = Hibernate.getSessionFactory().openSession();
        System.out.println("--- Conectado ---");

        try {
            session.beginTransaction();

            System.out.println("--- Actualizando ---");

            session.update(pojo);
            session.getTransaction().commit();

            res = true;

            System.out.println("--- Actualizado ---");
        } catch (ConstraintViolationException cve) {

            session.getTransaction().rollback();
            System.out.println("No se ha podido finalizar la transacción");
            return res;

        }
        return res;
    }

    @Override
    public List mostrar(long clave) {
    List<Departamentos> list = null;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();

            Query query = session.createQuery("FROM models.Departamentos WHERE clave = :clave");
            query.setParameter("clave", clave);
            list = query.list();

            session.close();

        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
        return list;
    }

}
