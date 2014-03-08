/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import Items.Electronics.Electronics;
import Items.sesrvice.ItemService;
import java.util.List;

/**
 *
 * @author Jean-Paul
 */
public class ItemsImpl implements ItemService {

    private String id;
    private double price;
    private String name;
    private List<ItemCondition> condition;
    private List<ItemBook> book;
    private List<Electronics> electronics;

    private ItemsImpl(Builder builder) {
        book = builder.book;
        condition = builder.condition;
        electronics = builder.electronics;
        name = builder.name;
        price = builder.price;
    }

    public String getId() {
        return id;
    }

    public double itemPrice() {
        return price;
    }

    public String itemName() {
        return name;
    }

    public static class Builder {
        private String id;
        private double price;
        private String name;
        private List<ItemCondition> condition;
        private List<ItemBook> book;

        public Builder() {
        }
        private List<Electronics> electronics;

        public Builder(double price, String name) {
            this.price = price;
            this.name = name;
        }

        public ItemsImpl.Builder id(String value) {
            id = value;
            return this;
        }

        public ItemsImpl.Builder electronics(List<Electronics> value) {
            electronics = value;
            return this;
        }

        public ItemsImpl.Builder itemBook(List<ItemBook> value) {
            book = value;
            return this;
        }

        public ItemsImpl.Builder ItemCondition(List<ItemCondition> value) {
            condition = value;
            return this;
        }

        public ItemsImpl build() {
            return new ItemsImpl(this);
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

        ItemsImpl itemsImpl = (ItemsImpl) o;

        if (!id.equals(itemsImpl.id)) {
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
