public class InventoryService {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for the product: " + productId);
        return true;
    }

    public void reduceStock(String productId) {
        System.out.println("Reducing stock for the product: " + productId);
    }

    public void addStock(String productId) {
        System.out.println("Increasing stock for the product: " + productId);
    }
}
