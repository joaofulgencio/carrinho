package com.projetoe.carrinho.gateway.domain;

import com.projetoe.carrinho.domain.Cart;

public interface CreateCartGateway {
    void execute(Cart cart);
}
