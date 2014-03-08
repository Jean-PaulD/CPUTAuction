/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bid;

import Bid.service.BuyerService;
import Users.Accounts.Logs;
import java.util.List;

/**
 *
 * @author Jean-Paul
 */
public class Bid implements BuyerService {

    private String id;
    private String username;
    private String password;
    private List<BidsWon> bidsWon;
    private List<CancelBid> cancelBid;
    private List<CurrentBid> currentBid;
    
    private Bid(){}
    private Bid(Builder builder) {
        bidsWon = builder.bidsWon;
        cancelBid = builder.cancelBid;
        currentBid = builder.currentBid;
        username = builder.username;
        password = builder.password;
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
        private List<BidsWon> bidsWon;
        private List<CancelBid> cancelBid;
        private List<CurrentBid> currentBid;

        public Builder(){}
        public Builder(String username, String password) {
            
            this.username = username;
            this.password = password;
        }

        public Bid.Builder id(String value) {
            id = value;
            return this;
        }

        public Bid.Builder bidsWon(List<BidsWon> value) {
            bidsWon = value;
            return this;
        }

        public Bid.Builder cancelBid(List<CancelBid> value) {
            cancelBid = value;
            return this;
        }

        public Bid.Builder currentBid(List<CurrentBid> value) {
            currentBid = value;
            return this;
        }

        public Bid build() {
            return new Bid(this);
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

        Bid bid = (Bid) o;

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
