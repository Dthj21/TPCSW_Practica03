
package com.mycompany.tpcsw_practica03;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TPCSW_Practica03 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        Empleado empleado=new Empleado();
        empleado.setClave(04);
        empleado.setNombre("Tony");
        empleado.setDireccion("Calle 89");
        empleado.setTelefono("219238138");
        */
        
        Departamento departamento = new Departamento();
        departamento.setNombre("prueba");
        
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();
        session.save(departamento);
        t.commit();
}
}