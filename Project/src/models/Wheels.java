package models;

public class Wheels extends Article {
    private int _inch;
    private int _width;
    private int _heightInPercent;
    private char _speedIndex;
    private char _tyreDesign; // R ... radial, D or - ... diagonal

    public int getInch() {
        return _inch;
    }

    public void setInch(int inch) {
        this._inch = inch;
    }

    public int getWidth() {
        return _width;
    }

    public void setWidth(int width) {
        this._width = width;
    }

    public int getHeightInPercent() {
        return _heightInPercent;
    }

    public void setHeightInPercent(int heightInPercent) {
        this._heightInPercent = heightInPercent;
    }

    public char getSpeedIndex() {
        return _speedIndex;
    }

    public void setSpeedIndex(char speedIndex) {
        this._speedIndex = speedIndex;
    }

    public char getTyreDesign() {
        return _tyreDesign;
    }

    public void setTyreDesign(char tyreDesign) {
        this._tyreDesign = tyreDesign;
    }
    public Wheels(){this(0, "", "", 0.0, null,
            0, 0, 0, ' ', ' ');}
    public Wheels(int articleID, String articleName, String articleCategory,
                  double price, Brands brand, int inch, int width, int heightInPercent,
                  char speedIndex, char tyreDesign){
        super(articleID, articleName, articleCategory, price, brand);
        this.setHeightInPercent(heightInPercent);
        this.setInch(inch);
        this.setWidth(width);
        this.setSpeedIndex(speedIndex);
        this.setTyreDesign(tyreDesign);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Wheels{" +
                "inch=" + this.getInch() +
                ", width=" + this.getWidth() +
                ", heightInPercent=" + this.getHeightInPercent() +
                ", speedIndex=" + this.getSpeedIndex() +
                ", tyreDesign=" + this.getTyreDesign() +
                '}';
    }
}
