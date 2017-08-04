import java.util.List;

public class Cheapest {
    private static final int PRODUCT_PRICE = 100;

    List<Integer> product;

    public Cheapest(List<Integer> product) {
        this.product = product;
    }

    public boolean hasProduct() {
        for (int num : product) {
            if (num != 0) {
                return true;
            }
        }
        return false;
    }

    public int cart() {
        int type = 0;

        for (int i = 0; i < product.size(); i++) {
            if (product.get(i) != 0) {
                type++;
                System.out.println(product.get(i));
            }
        }

        return type;
    }

    public double calculatePrice() {
        double totalPrice = 0;

        int type = cart();

        switch (type) {
            case 1:
                totalPrice += product.get(0) * PRODUCT_PRICE;
                break;
            case 2:
                totalPrice += 2 * PRODUCT_PRICE * 0.95;
                break;
            case 3:
                totalPrice += 3 * PRODUCT_PRICE * 0.9;
                break;
            case 4:
                totalPrice += 4 * PRODUCT_PRICE * 0.8;
                break;
            case 5:
                totalPrice += 5 * PRODUCT_PRICE * 0.85;
                break;
        }

        return totalPrice;
    }
}
