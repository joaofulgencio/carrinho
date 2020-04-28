package com.projetoe.carrinho.gateway.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "cart")
public class CartDomain {

    private String buyerEmail;
    private List<CartItemDomain> itemsList;
    private double cartTotals;
    private boolean closed;

}
