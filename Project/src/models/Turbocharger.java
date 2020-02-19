package models;

public class Turbocharger extends Article {
private double _rpm;
private long _valueOfMinHP;

public double getRoundsPerMinute(){return this._rpm;}
public void setRoundsPerMinute(double rpm){this._rpm = rpm;}
public long getValueOfMinimumHorsePower(){return this._valueOfMinHP;}
public void setValueOfMinimumHorsePower(long valueOfMinHP){this._valueOfMinHP = valueOfMinHP;}

public Turbocharger(){this(0, "", "", 0.0, null, 0.0, 0);}
public Turbocharger(int articleID, String articleName, String articleCategory,
                    double price, Brands brand, double rpm, long valueOfMinHP){
    super(articleID, articleName, articleCategory, price, brand);
    this.setRoundsPerMinute(rpm);
    this.setValueOfMinimumHorsePower(valueOfMinHP);
}

    @Override
    public String toString() {
        return super.toString() +
                "Turbocharger{" +
                "rpm=" + this.getRoundsPerMinute() +
                ", valueOfMinHP=" + this.getValueOfMinimumHorsePower() +
                '}';
    }
}
