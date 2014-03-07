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
class Admin implements UsersService {

    private String username;
    private String password;
    private String userType = "admin";
    private String id;

    private Admin(Builder aThis) {
        username = aThis.username;
        password = aThis.password;
    }

    public String username(String uName) {
        return username;
    }

    public String password(String pWord) {
        return password;
    }

    public String getID() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Admin admin = (Admin) o;

        if (!id.equals(admin.id)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public class Builder {

        private String username;
        private String password;
        private String userType = "admin";
        private String id;

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Builder id(String value) {
            id = value;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }
}
