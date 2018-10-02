package org.softuni.kaizer.domain.models.view;

import java.math.BigDecimal;

public class TopWatchesWatchViewModel {
    private String id;

    private String name;

    private String image;

    private BigDecimal price;

    public TopWatchesWatchViewModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
