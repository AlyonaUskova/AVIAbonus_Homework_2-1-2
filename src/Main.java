public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int transferSum = 1100;
        int bonusSum = transferSum / 100;
        if (transferSum > 1000) {
            System.out.print(amount + transferSum + bonusSum);
        } else {
            System.out.print(amount + transferSum);
        }
    }
}