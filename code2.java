class Restaurant {
    String restaurantName;

    Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    void showMenu() {
        System.out.println("Menu of " + restaurantName);
    }
}

class VegRestaurant extends Restaurant {

    VegRestaurant(String restaurantName) {
        super(restaurantName);
    }

    void showMenu() {
        System.out.println("Veg Menu: Paneer Butter Masala, Veg Biryani, Dal Makhani");
    }
}

class NonVegRestaurant extends Restaurant {

    NonVegRestaurant(String restaurantName) {
        super(restaurantName);
    }

    void showMenu() {
        System.out.println("Non-Veg Menu: Chicken Biryani, Butter Chicken, Fish Curry");
    }
}

public class Main {
    public static void main(String[] args) {

        Restaurant r1 = new VegRestaurant("Green Delight");
        Restaurant r2 = new NonVegRestaurant("Spicy Hub");

        r1.showMenu();
        r2.showMenu();
    }
}