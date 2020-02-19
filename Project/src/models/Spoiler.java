package models;

public class Spoiler extends Article{
    private Materials _material;

    public Materials getMaterials() {
        return _material;
    }

    public void setMaterials(Materials material) {
        this._material = material;
    }

    public Spoiler(){this(0, "", "", 0.0, null, null);}
    public Spoiler(int articleID, String articleName, String articleCategory, double price, Brands brand, Materials material){
        super(articleID, articleName, articleCategory, price, brand);
        this.setMaterials(material);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Spoiler{" +
                "material=" + this.getMaterials() +
                '}';
    }
}
