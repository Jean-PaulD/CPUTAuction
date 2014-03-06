/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.Accounts;

import Users.service.UsersService;

/**
 *
 * @author Jean-Paul
 */
class Users implements UsersService {

    private String id;
    private String username;
    private String password;
    //private List<>
    
    public String username(String uName) {
        return uName;
    }

    public String password(String pWord) {
        return password;
    }

    public class Builder {

        private String id;
        private String username;
        private String password;
        
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Users users = (Users) o;

        if (!id.equals(users.id)) {
            return false;
        }

        return true;
    }

    public String getID() {
        return id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
