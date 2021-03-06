package eco.bike.rental.calculator;

public class NormalCalculateFee implements ICalculateFee {
    @Override
    public long calculateFee(long timeInSeconds) {
        if (0 < timeInSeconds && timeInSeconds <= 30 * 60) {
            return 10000;
        }
        return 10000 + ((timeInSeconds - 30 * 60) / (15 * 60) + 1) * 3000;
    }
}
