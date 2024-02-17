public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double CONVERT_RATE = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / CONVERT_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = CONVERT_RATE * milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
    }
}
