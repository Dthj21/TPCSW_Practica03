
package com.mycompany.tpcsw_practica03;

import java.util.List;

public interface IDAOGeneral<T, ID> {
    public boolean save(T pojo);
    public boolean delete(ID pojo);
    public boolean update(T pojo, ID id);
    public List<T> findAll();
    public T findById(ID id);
}