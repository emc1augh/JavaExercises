package Tutorial4;

public class Currency {

    private String name;
    private Double rate;

    Currency(String name, Double rate){
        this.name = name;
        this.rate = rate;
    }

    String getName() {
        return name;
    }

    Double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}