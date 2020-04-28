package com.projetoe.carrinho.gateway.domain.impl;

import com.projetoe.carrinho.domain.Cart;
import com.projetoe.carrinho.gateway.domain.CartDomain;
import com.projetoe.carrinho.gateway.domain.CreateCartGateway;
import com.projetoe.carrinho.gateway.domain.database.repository.CartRepository;
import com.projetoe.carrinho.translator.Translator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCartGatewayImpl implements CreateCartGateway {

    private final CartRepository cartRepository;

    @Override
    public void execute(Cart cart) {
        CartDomain cartDomain = Translator.translate(cart, CartDomain.class);
        cartRepository.save(cartDomain);
    }

}
