package com.mycompany.tpcsw_practica03;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAOEmpleado implements IDAOGeneral<Empleado, Long> {

    @Override
    public boolean save(Empleado pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            session.save(pojo);
            t.commit();
            return true;
        } catch (Exception e) {
            if (t.isActive()) {
                t.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            Empleado empleado = session.get(Empleado.class, id);
            if (empleado != null) {
                session.delete(empleado);
                t.commit();
                return true;
            }
            return false;
        } catch (Exception e) {
            if (t.isActive()) {
                t.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Empleado pojo, Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            session.update(pojo);
            t.commit();
            return true;
        } catch (Exception e) {
            if (t.isActive()) {
                t.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Empleado> findAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            List<Empleado> empleados = session.createQuery("from Empleado", Empleado.class).list();
            t.commit();
            return empleados;
        } catch (Exception e) {
            if (t.isActive()) {
                t.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Empleado findById(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {
            Empleado empleado = session.get(Empleado.class, id);
            t.commit();
            return empleado;
        } catch (Exception e) {
            if (t.isActive()) {
                t.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public List<Departamento> findAllDepartamentos() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        List<Departamento> departamentos = session.createQuery("from Departamento", Departamento.class).list();
        t.commit();
        return departamentos;
    }

}
