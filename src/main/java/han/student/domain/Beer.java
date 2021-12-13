package han.student.domain;

import javax.persistence.*;

public class Beer {
    private Long id;

    private String brand;

    private String name;

    private String alcohol;

    private BeerType beerType;

    public Beer() {
    }

    public Beer(Long id, String brand, String name, String alcohol) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.alcohol = alcohol;
    }

    public Beer(Long id, String brand, String name, String alcohol, BeerType beerType) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.alcohol = alcohol;
        this.beerType = beerType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public BeerType getBeerType() {
        return beerType;
    }

    public void setBeerType(BeerType beerType) {
        this.beerType = beerType;
    }
}
