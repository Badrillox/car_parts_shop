package models;

public class ExhaustPipes extends Article{
    private double _noiseIndex;

    public double getNoiseIndex() {
        return _noiseIndex;
    }

    public void setNoiseIndex(double noiseIndex) {
        this._noiseIndex = noiseIndex;
    }

    public ExhaustPipes(){this(0.0, 0, "", "", 0.0, null);}
    public ExhaustPipes(double noiseIndex, int articleID, String articleName, String articleCategory, double price, Brands brand){
        super(articleID, articleName, articleCategory, price, brand);
        this.setNoiseIndex(noiseIndex);
    }
    @Override
    public String toString() {
        return super.toString() +
                "ExhaustPipes{" +
                "noiseIndex=" + this.getNoiseIndex() +
                '}';
    }
}
