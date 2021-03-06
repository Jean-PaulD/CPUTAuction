/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.Accounts;

import Users.service.UsersService;
import java.util.List;

/**
 *
 * @author Jean-Paul
 */
public class Users implements UsersService {

    private String id;
    private String username;
    private String password;
    private List<Logs> logs;

    private Users(Builder aThis) {
        username = aThis.username;
        password = aThis.password;
    }

    public String username(String uName) {
        return uName;
    }

    public String password(String pWord) {
        return password;
    }

    public static class Builder {

        private String id;
        private String username;
        private String password;
        private List<Logs> logs;
public Builder(){}
        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Builder id(String value) {
            id = value;
            return this;
        }

        public Builder logs(List<Logs> value) {
            logs = value;
            return this;
        }

        public Users build() {
            return new Users(this);
        }
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
