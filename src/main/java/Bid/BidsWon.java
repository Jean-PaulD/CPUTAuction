/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bid;

import Users.Accounts.Logs;
import java.util.List;

/**
 *
 * @author Jean-Paul
 */
public class BidsWon {

    private String id;
    private String username;
    private String password;
    private String bidWon;
    private double bidPrice;

    private BidsWon(Builder builder) {
        bidPrice = builder.bidPrice;
        bidWon = builder.bidWon;
        password = builder.password;
        username = builder.username;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBidWon() {
        return bidWon;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public static class Builder {

        private String id;
        private String username;
        private String password;
        private String bidWon;
        private double bidPrice;
        public Builder(){}
        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public BidsWon.Builder id(String value) {
            id = value;
            return this;
        }

        public BidsWon build() {
            return new BidsWon(this);
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

        BidsWon bidsWon = (BidsWon) o;

        if (!id.equals(bidsWon.id)) {
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
