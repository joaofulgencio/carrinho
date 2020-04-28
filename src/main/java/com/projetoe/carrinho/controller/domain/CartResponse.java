package com.projetoe.carrinho.controller.domain;

import com.projetoe.carrinho.domain.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartResponse {
    private String buyerEmail;
    private List<Item> itemsList;
    private double cartTotals;
    private boolean closed;

}
