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
public class Cart {

    private int buyerId;
    private List<Item> itemsList;
    private double cartTotals;
    private boolean closed;

    public void calculateTotal() {
        this.cartTotals = itemsList.stream().mapToDouble(Item::getPrice).sum();
    }

}
