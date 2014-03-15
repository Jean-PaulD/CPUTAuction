/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.crud.BidCrud.Impl;

import Bid.BidsWon;
import Services.crud.BidCrud.BidsWonCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public class BidsWonCrudServiceImpl implements BidsWonCrudService {
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BidsWon find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public BidsWon persist(BidsWon entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public BidsWon merge(BidsWon entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public BidsWon remove(BidsWon entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<BidsWon> findAll() {
        return null;
    }
}
