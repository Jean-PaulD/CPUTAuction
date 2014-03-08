/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Seller;

import Users.service.UsersService;

/**
 *
 * @author Jean-Paul
 */
public interface SellerService  extends UsersService {

    String username(String uName);
    
    String password(String pWord);
    
    
}
