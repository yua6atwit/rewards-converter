    
public class RewardValue {

    private double cashValue;
    final static double mileToCash = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public Integer getMilesValue() {
        return convertToMiles(cashValue);
    }

    public Double getCashValue() {
        return cashValue;
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue/mileToCash);
    }

    private static double convertToCash(int milesValue) {
        return milesValue*mileToCash;
    }

}