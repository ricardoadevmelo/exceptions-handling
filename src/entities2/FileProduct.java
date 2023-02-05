package entities2;

public class FileProduct {

    private String Name;
    private Double price;
    private Integer quantitiy;

    public FileProduct(String name, Double price, Integer quantitiy) {
        Name = name;
        this.price = price;
        this.quantitiy = quantitiy;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantitiy() {
        return quantitiy;
    }

    public void setQuantitiy(Integer quantitiy) {
        this.quantitiy = quantitiy;
    }

    public Double totalPrice() {
        return price * quantitiy;
    }
}
