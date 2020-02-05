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


    }

    public Shop(){this("", null);}
    public Shop(String shopName, Address address){
        this.setAddress(address);
        this.setShopName(shopName);
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();

        for(Article a: _articles){
            s.append(a.getArticleID()).append(" ").append(a.getArticleName()).append(" ").append(a.getPrice()).append("€\n");
        }

        return s.toString();
    }
}
