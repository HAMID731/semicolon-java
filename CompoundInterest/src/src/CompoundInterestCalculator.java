package src;

import java.util.Scanner;

public class CompoundInterestCalculator {
    private double principal;
    private double rate;
    private int time;
    private int frequency;

    public CompoundInterestCalculator(double principal, double rate, int time, int frequency) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.frequency = frequency;
    }

    public double calculateCompoundInterest() {
        return principal * Math.pow((1 + rate / (frequency * 100)), frequency * time) - principal;
    }

    public double calculateTotalAmount() {
        return principal * Math.pow((1 + rate / (frequency * 100)), frequency * time);
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public int getTime() {
        return time;
    }

    public int getFrequency() {
        return frequency;
    }
}



