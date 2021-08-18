public class Main {
    public static void main(String[] args) {
        int initialAmount = 130;
        int replenishmentAmount = 2250;
        float totalAmount;
        float bonus = 0;
        if (replenishmentAmount > 1000) {

            bonus = replenishmentAmount / 100;
            totalAmount = initialAmount + replenishmentAmount + bonus;
        } else {
            totalAmount = initialAmount + replenishmentAmount;
        }
        System.out.println("Ваш счет составил: " + totalAmount);
        System.out.println("В том числе бонус: " + bonus);
    }
}
