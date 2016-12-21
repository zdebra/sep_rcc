package sep_rcc.data;

import java.util.List;

public interface GenericDAO<T> {

    T create(T t);

    void delete(Object id);

    T find(Object id);

    T update(T t);

    List<T> findAll();


}