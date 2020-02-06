package models;

public class Turbocharger extends Article {
private double _rpm;
private long _valueOfMinHP;

public double getRoundsPerMinute(){return this._rpm;}
public void setRoundsPerMinute(double rpm){this._rpm = rpm;}
public long getValueOfMinimumHorsePower(){return this._valueOfMinHP;}
public void setValueOfMinimumHorsePower(long valueOfMinHP){this._valueOfMinHP = valueOfMinHP;}

public Turbocharger(){this(0.0, 0, 0, "", "", 0.0, null);}
public Turbocharger(double rpm, long valueOfMinHP, int articleID, String articleName, String articleCategory,
                    double price, Brands brand){
    super(articleID, articleName, articleCategory, price, brand);
    this.setRoundsPerMinute(rpm);
    this.setValueOfMinimumHorsePower(valueOfMinHP);
}

    @Override
    public String toString() {
        return "Turbocharger{" +
                super.toString() +
                "_rpm=" + this.getRoundsPerMinute() +
                ", _valueOfMinHP=" + this.getValueOfMinimumHorsePower() +
                '}';
    }
}
