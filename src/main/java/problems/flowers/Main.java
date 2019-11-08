package problems.flowers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Flower> flowerList = getFlowers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max amount of money:");
        int money = scanner.nextInt();
        makeBouquet(flowerList, money);
    }

    private static List<Flower> getFlowers() {
        List<Flower> flowers = new ArrayList<>();
        String[] names = {"Rose", "Tulip", "Chamomile", "Lily", "Peony", "Golden-daisy", "Gladiolus"};

        Random random = new Random();
        for (String name : names) {
            flowers.add(new Flower(name, random.nextInt(50), random.nextInt(30)));
        }
        getSortedFlowersByCost(flowers);

        return flowers;
    }

    private static void getSortedFlowersByCost(List<Flower> flowers) {
        Collections.sort(flowers);
    }

    private static void makeBouquet(List<Flower> flowers, int money) {
        int cost = 0;
        int flowerCount = 0;
        List<Flower> bouquet = new ArrayList<>();

        do {
            for (Flower flower : flowers) {
                if (cost + flower.getCost() <= money) {
                    bouquet.add(flower);
                    cost += flower.getCost();
                    flowerCount++;
                }
            }
        } while (cost <= money);

        for (Flower flower : bouquet) {
            System.out.println(flower.getName());
        }

        System.out.println("The price of bouquet: " + cost + ", amount of flowers: " + flowerCount);
    }
}
