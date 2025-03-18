package composite;

public class App {
    public static void main(String[] args) throws Exception {
        // Tạo sản phẩm
        Product coffee = new Product("Cà phê", 50000);
        Product tea = new Product("Trà sữa", 40000);
        Product water = new Product("Nước suối", 10000);

        // Tạo bàn
        Table table1 = new Table();
        table1.add(coffee);
        table1.add(tea);

        Table table2 = new Table();
        table2.add(water);
        table2.add(coffee);

        // Tạo quán cà phê
        CoffeeShop shop = new CoffeeShop();
        shop.add(table1);
        shop.add(table2);

        // Tính doanh thu
        System.out.println("Doanh thu của bàn 1: " + table1.getRevenue());
        System.out.println("Doanh thu của bàn 2: " + table2.getRevenue());
        System.out.println("Tổng doanh thu quán: " + shop.getRevenue());
    }
}
