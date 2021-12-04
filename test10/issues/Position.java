package issues;

public class Position {
    private double amount;
    Bond bond;

    public double getAmount(){
        return this.amount;
    }

    public Bond getBond(){
        return this.bond;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setBond(Bond bond){
        this.bond = bond;
    }
}
