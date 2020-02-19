package models;
import java.util.LinkedList;
import java.util.List;
public class Shop {

    private String _shopName;
    private List<Article>_articles = new LinkedList<>();
    private Address _address;

    public Address getAddress(){
        return this._address;
    }
    public void setAddress(Address address){
        this._address = address;
    }

    public String getShopName(){return this._shopName;}
    public void setShopName(String shopName){this._shopName = shopName;}

    //searchByMethods

    public Article searchArticleByID(int id){
    for(Article a : this._articles){
        if(a.getArticleID() == id){
            return a;
        }
    }
        return null;
    }
    public Article searchArticleByCategory(String category){
        for(Article a : this._articles){
            if(a.getArticleCategory() == category){
                return a;
            }
        }
        return null;
    }
    public List<Article> searchArticleByName(String name){
        List<Article> foundArticles = new LinkedList<>();
        for(Article a : this._articles){
            if(a.getArticleName().equals(name)){
                foundArticles.add(a);
               }
            }
        if(foundArticles.size() >= 0){
            return foundArticles;
        }
        return null;
    }
    public List<Article> searchArticleByPriceRange(double minValue, double maxValue){
        double temp = minValue;
        if(minValue > maxValue){
            minValue = maxValue;
            maxValue = temp;
        }
        List<Article> foundArticles = new LinkedList<>();
        for(Article a : this._articles){
            if((a.getPrice() >= minValue) &&(a.getPrice() <= maxValue)){
                foundArticles.add(a);
            }
        }
        if(foundArticles.size() > 0){
            return foundArticles;
        }
        return null;
    }

    public Shop(){this("", null);}
    public Shop(String shopName, Address address){
        this.setAddress(address);
        this.setShopName(shopName);
        createArticlesForShop();
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();

        for(Article a: this._articles){
            s.append(a.getArticleID()).append(" ").append(a.getArticleName()).append(" ").append(a.getPrice()).append("€\n"); // z.B. 1 XY 100€
        }

        return s.toString();
    }
    public void createArticlesForShop(){
        // inheritance from Article.java (turbocharger, wheels, spoiler, exhaust-pipes)
        this._articles.add(new Spoiler(1, "FalconWing-Extreme", "Spoiler", 6580.99,
                Brands.Tesla,Materials.Chrom));
        this._articles.add(new Wheels(2, "ToxicRunners", "Wheels", 2080.00,
                Brands.Audi, 21, 220, 65, 'Y', 'R'));
        this._articles.add(new Turbocharger(3, "Supracharger", "Turbocharger", 6920.99,
                Brands.Toyota, 190000.00, 600));
    }
}
