/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Jean-Paul
 */
public class ItemCondition {

    private String id;
    private double price;
    private String name;
    private String condition;
    
    private ItemCondition(Builder builder) {
        price = builder.price;
        name = builder.name;
    }

    public String getCondition() {
        return condition;
    }

    public static class Builder {

        private String id;
        private double price;
        private String name;
 public Builder(){};
        public Builder(double price, String name) {
            this.price = price;
            this.name = name;
        }

        public ItemCondition.Builder id(String value) {
            id = value;
            return this;
        }

        public ItemCondition build() {
            return new ItemCondition(this);
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

        ItemCondition itemCondition = (ItemCondition) o;

        if (!id.equals(itemCondition.id)) {
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
