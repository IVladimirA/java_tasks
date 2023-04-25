import java.util.ArrayList;

public class Deal {
    ArrayList<Integer> amounts;
    ArrayList<Double> prices;
    ArrayList<String> names;
    Integer buyerId;
    Integer sellerId;
    private double total = -1;
    boolean cardPayment = false;
    boolean highCost = false;
    public Deal(Integer sellerId, Integer buyerId) {
        amounts = new ArrayList<Integer>();
        prices = new ArrayList<Double>();
        names = new ArrayList<String>();
        this.sellerId = sellerId;
        this.buyerId = buyerId;
    }
    public void addItem(String name, Double price, Integer amount) {
        amounts.add(amount);
        names.add(name);
        prices.add(price);
        updateTotal();
        if (total > 10000) {
            highCost = true;
        }
    }
    private Double updateTotal() {
        total = 0;
        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i) * amounts.get(i);
        }
        return total;
    }
    public Double total() {
        if (total != -1) {
            return total;
        }
        return updateTotal();
    }
}
