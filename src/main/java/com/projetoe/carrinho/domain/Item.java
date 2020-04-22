package com.projetoe.carrinho.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private int sellerId;
    private String productName;
    private List<Image> images;
    private String description;
    private double price;
}
