package learn;

/**
 * @author <lmx>
 * @since 2022/11/2 17:03
 */
public class learn41 {
    public static void main(String[] args) {
        String id = null;
        Item item = ItemService.getItemByid(id);
//        a
        if (item != null) {
            System.out.println(item.name);
        }
        //b
//        System.out.println(item.name);


    }

    private static class ItemService {
        public static Item getItemByid(String id) {
            //c
//            return id.equals("1")?new Item("iphone13"):null;
            //d   ac空指针 ad正常  bc空指针 bd空指针
            return "1".equals(id) ? new Item("iphone13") : null;
        }
    }

    static class Item {
        private String name;
        private String id;

        public Item(String name) {
            this.name = name;
        }
    }
}
