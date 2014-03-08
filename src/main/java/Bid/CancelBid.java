/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bid;

/**
 *
 * @author Jean-Paul
 */
public class CancelBid {
    
    private String id;
    private String username;
    private String password;
    private String cancelBid;
    private double bidPrice;

    private CancelBid(CancelBid.Builder builder) {
        bidPrice = builder.bidPrice;
        cancelBid = builder.cancelBid;
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

    public String getCancelBid() {
        return cancelBid;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public static class Builder {

        private String id;
        private String username;
        private String password;
        private String cancelBid;
        private double bidPrice;

        public Builder(){}
        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public CancelBid.Builder id(String value) {
            id = value;
            return this;
        }

        public CancelBid build() {
            return new CancelBid(this);
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

        CancelBid cancelBid = (CancelBid) o;

        if (!id.equals(cancelBid.id)) {
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
