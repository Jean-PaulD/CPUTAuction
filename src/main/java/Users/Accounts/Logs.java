/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Users.Accounts;

import Users.service.UsersService;
import java.security.Timestamp;
import java.util.List;

/**
 *
 * @author Jean-Paul
 */
public class Logs implements UsersService {

    private String id;
    private String username;
    private String password;
    private Timestamp log;

    private Logs() {
    }

    private Logs(Builder aThis) {

        username = aThis.username;
        password = aThis.password;
    }

    public Timestamp getLog() {
        return log;
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

    public class Builder {

        private String id;
        private String username;
        private String password;
        private Timestamp log;

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }
        
        public Timestamp getLog(){
            return log;
        }

        public Logs.Builder id(String value) {
            id = value;
            return this;
        }

        public Logs build() {
            return new Logs(this);
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

        Logs logs = (Logs) o;

        if (!id.equals(logs.id)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
