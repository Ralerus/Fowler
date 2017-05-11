public class Movie {
    private String title;
    private int priceCode;
    
    public Movie(String newtitle, int priceCode) {
        title = newtitle;
        this.priceCode = priceCode;
    }
    
    public int getPriceCode() {
        return priceCode;
    }
    
    public void setPriceCode(int price) {
        priceCode = price;
    }
    
    public String getTitle(){
        return title;
    };
}