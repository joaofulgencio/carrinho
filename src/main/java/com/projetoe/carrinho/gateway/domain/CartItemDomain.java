package com.projetoe.carrinho.gateway.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartItemDomain {
    private String sellerEmail;
    private String productName;
    private List<CartItemImageDomain> images;
    private String description;
    private double price;
}
