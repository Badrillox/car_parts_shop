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
    public Article searchArticleByName(String name){
        for(Article a : this._articles){
            if(a.getArticleName() == name){
                return a;
            }
        }
        return null;
    }
    public Article searchArticleByPriceRange(double minValue, double maxValue){
        double tmp = minValue;
        if(minValue > maxValue){
            minValue = maxValue;
            maxValue = tmp;
        }
        for(Article a : this._articles){
            if((a.getPrice() > minValue) && (a.getPrice() < maxValue)){
                return a;
            }
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

        for(Article a: _articles){
            s.append(a.getArticleID()).append(" ").append(a.getArticleName()).append(" ").append(a.getPrice()).append("€\n");
        }

        return s.toString();
    }
    public void createArticlesForShop(){
    }
}
