/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.crud.BidCrud.Impl;

import Bid.Bid;
import Services.crud.BidCrud.BidCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public class BidCrudServiceImpl implements BidCrudService {

   @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Bid find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Bid persist(Bid entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Bid merge(Bid entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Bid remove(Bid entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Bid> findAll() {
        return null;
    }
    
}
