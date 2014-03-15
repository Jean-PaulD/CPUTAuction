/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.List;

/**
 *
 * @author Jean-Paul
 */
public interface CrudService<S, ID> {
    
    public S find(ID id);
    public S persist(S entity);
    public S merge(S entity);
    public S remove(S entity);
    public List<S> findAll();
}
