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
public final class Accounts implements UsersService {

    private String id;
    private String username;
    private String password;
    private String accountType;
    private int age;
    private String emailAddress;
    private int studentNumber;
    private List<Admin> admin;
    private List<Users> users;

    private Accounts() {
    }

    private Accounts(Builder builder) {
        admin = builder.admin;
        users = builder.users;
    }

    public String username(String uName) {
        return uName;
    }

    public String password(String pWord) {
        return pWord;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public Object getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class Builder {

        private String id;
        private String username;
        private String password;
        private String accountType;
        private int age;
        private String emailAddress;
        private int studentNumber;
        private List<Admin> admin;
        private List<Users> users;

        public Builder() {
        }

        public Builder(String id, String username, String password, int studentNumber) {
            this.username = username;
            this.password = password;
            this.studentNumber = studentNumber;
        }

        public Builder id(String value) {
            id = value;
            return this;
        }

        public Builder users(List<Users> value) {
            users = value;
            return this;
        }

        public Accounts build() {
            return new Accounts(this);
        }
    }
}
