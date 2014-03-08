/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Seller;

import Bid.Bid;
import java.util.List;

/**
 *
 * @author Jean-Paul
 */
public class SellerImpl implements SellerService {

    private String id;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private List<SellerImpl> bid;

    private  SellerImpl(SellerImpl.Builder builder){}
    
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

    public class Builder {

        private String id;
        private String username;
        private String password;
        private String name;
        private String surname;
        private String email;
        private String phone;
        private List<Bid> bid;

        public Builder(String username, String password,
                String name) {
            this.username = username;
            this.password = password;
            this.name = name;
        }

        public SellerImpl.Builder bid(List<Bid> value){
            bid=value;
            return this;
        }
        
        public SellerImpl.Builder id(String value) {
            id = value;
            return this;
        }

        public SellerImpl build() {
            return new SellerImpl(this);
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

        SellerImpl bid = (SellerImpl) o;

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
