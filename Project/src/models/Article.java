package models;

public abstract class Article {

    private int _articleID;
    private String _articleName;
    private String _articleCategory;
    private double _price;
    private Brands _brands;


    public int getArticleID(){return this._articleID;}
    public void setArticleID(int articleID){
        if(articleID > 0){
            this._articleID = articleID;
        }
    }
    public String getArticleName() {
        return _articleName;
    }

    public void setArticleName(String articleName) {
        this._articleName = articleName;
    }

    public String getArticleCategory() {
        return _articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this._articleCategory = articleCategory;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        if(price > 0) { // we need to check if it's not a minus value or 0 (makes no sense)
            this._price = price;
        }
    }
    public Brands getBrand(){return this._brands;}
    public void setBrand(Brands brand){this._brands = brand;}
    public Article(){this(0, "", "", 0.0, null);}
    public Article(int articleID, String articleName, String articleCategory, double price, Brands brand){
        this.setArticleID(articleID);
        this.setArticleName(articleName);
        this.setArticleCategory(articleCategory);
        this.setPrice(price); // we need to use setter because if we use this._xy we would directly insert values, even
                              // though it makes no sense to insert those values (-x and 0)
        this.setBrand(brand);
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_ID='" + this.getArticleID() + '\'' +
                ", article='" + this.getArticleName() + '\'' +
                ", articleCategory='" + this.getArticleCategory() + '\'' +
                ", price=" + this.getPrice() +
                ", brand=" + this.getBrand() +
                '}';
    }
}
