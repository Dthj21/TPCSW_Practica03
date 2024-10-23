package com.mycompany.tpcsw_practica03;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAOEmpleado implements IDAOGeneral<Empleado, Long> {
    
    @Override
    public boolean save(Empleado pojo){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        session.save(pojo);
        t.commit();
        return true;
    }
    
    /*
    @Override
    public boolean delete(Empleado pojo){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        session.delete(pojo.getClave());
        t.commit();
        return true;
    }
    
    @Override
    public boolean update(Empleado pojo){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        session.update(pojo);
        t.commit();
        return true;
    }
    
    @Override
    public List<Empleado> findAll(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        List<Empleado> empleados = session.createQuery("from Empleado", Empleado.class).list();
        t.commit();
        return empleados;
    }
    
    @Override
    public Empleado finById(Empleado pojo){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        Empleado empleado = session.get(Empleado.class, id);
        t.commit();
        return empleado;
    }
*/

    @Override
    public boolean delete(Long pojo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Empleado pojo, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Empleado> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Empleado findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
