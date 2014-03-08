/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bid;

import Bid.Bid;
import Bid.service.BuyerService;
import java.util.List;

/**
 *
 * @author Jean-Paul
 */
public class BuyerImpl implements BuyerService {

    private String id;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private List<BuyerImpl> bid;

    private BuyerImpl(Builder builder) {
    }

    public String username(String uName) {
        return uName;
    }

    public String password(String pWord) {
        return pWord;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder {

        private String id;
        private String username;
        private String password;
        private String name;
        private String surname;
        private String email;
        private String phone;
        private List<Bid> bid;

        public Builder() {
        }

        public Builder(String username, String password,
                String name) {
            this.username = username;
            this.password = password;
            this.name = name;
        }

        public Builder bid(List<Bid> value) {
            bid = value;
            return this;
        }

        public BuyerImpl.Builder id(String value) {
            id = value;
            return this;
        }

        public BuyerImpl build() {
            return new BuyerImpl(this);
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

        BuyerImpl bid = (BuyerImpl) o;

        if (!id.equals(bid.id)) {
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
