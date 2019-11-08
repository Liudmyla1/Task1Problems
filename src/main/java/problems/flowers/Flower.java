package problems.flowers;

public class Flower implements Comparable<Flower>{
    private String name;
    private int cost;
    private int amount;

    Flower(String name, int cost, int amount) {
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Flower flower) {
        return flower.getCost();
    }
}
