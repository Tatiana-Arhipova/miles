public class BonusMilesService {
    public int calculate(int price) {
        int amountOf20Rubles = 1;
        int miles = price / 20 * amountOf20Rubles;
        return miles;

    }


}
