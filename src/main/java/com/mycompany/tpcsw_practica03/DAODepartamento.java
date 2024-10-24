
package com.mycompany.tpcsw_practica03;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAODepartamento implements IDAOGeneral<Departamento, Long> {
  
    @Override
    public boolean save(Departamento pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        session.save(pojo);
        t.commit();
        return true;
    }

    @Override
    public boolean delete(Long clave) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        Departamento departamento = session.get(Departamento.class, clave);
        if (departamento != null) {
            session.delete(departamento);
            t.commit();
            return true;
        }
        t.commit();
        return false;
    }

    @Override
    public boolean update(Departamento pojo, Long clave) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        Departamento departamento = session.get(Departamento.class, clave);
        if (departamento != null) {
            departamento.setNombre(pojo.getNombre());
            // Actualiza otros campos si es necesario
            session.update(departamento);
            t.commit();
            return true;
        }
        t.commit();
        return false;
    }

    @Override
    public List<Departamento> findAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        List<Departamento> departamentos = session.createQuery("from Departamento", Departamento.class).list();
        t.commit();
        return departamentos;
    }

    @Override
    public Departamento findById(Long clave) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        Departamento departamento = session.get(Departamento.class, clave);
        t.commit();
        return departamento;
    } 
    
}
