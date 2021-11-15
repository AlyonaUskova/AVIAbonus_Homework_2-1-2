public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int transferSum = 1100;
        int bonusSum;
        if (transferSum > 1000) {
            bonusSum = transferSum/100;
        } else {
            bonusSum = 0;
        }
        System.out.print(amount + transferSum + bonusSum);
    }
}