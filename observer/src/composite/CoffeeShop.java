package composite;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements Component {
    private List<Component> tables = new ArrayList<>();

    public void add(Component table) {
        tables.add(table);
    }

    @Override
    public double getRevenue() {
        return tables.stream().mapToDouble(Component::getRevenue).sum();
    }
}
