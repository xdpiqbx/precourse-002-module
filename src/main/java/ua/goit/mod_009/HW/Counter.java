package ua.goit.mod_009.HW;

public class Counter {
    public long current(long number){
        return number;
    }

    public long next(long number){
        return ++number;
    }

    public long prev(long number){
        return --number;
    }
    public int addScore(int currentScore, int amount){
        return currentScore += amount;
    }
}
