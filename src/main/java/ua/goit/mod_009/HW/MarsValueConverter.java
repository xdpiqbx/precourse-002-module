package ua.goit.mod_009.HW;

public class MarsValueConverter {
    public int changeMoneyAmount(float startAmount, float toRemove){
        return (int)(startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2){
        return (byte)(sum1 + sum2);
    }

    public short halfOfMoney(double startMoney){
        return (short)(startMoney / 2);
    }
}
