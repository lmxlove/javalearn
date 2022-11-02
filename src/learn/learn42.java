package learn;

import java.util.Optional;

/**
 * @author <lmx>
 * @since 2022/11/2 17:21
 */
public class learn42 {
    public static void main(String[] args) {
        String id = null;
        Optional<Item1> item1 = ItemService1.getItemByid(id);
        System.out.println(item1.orElse(new Item1()).name);
    }

    public static class ItemService1 {
        public static Optional<Item1> getItemByid(String id) {
            return Optional.ofNullable("1".equals(id) ? new Item1("iphone 14") : null);
        }
    }

    static class Item1 {
        private String name;
        private String id;

        public Item1(String name) {
            this.name = name;
        }

        public Item1() {

        }
    }
}
