package com.projetoe.carrinho.usecase;

import com.projetoe.carrinho.controller.domain.CartRequest;
import com.projetoe.carrinho.domain.Cart;
import com.projetoe.carrinho.domain.Item;
import com.projetoe.carrinho.gateway.domain.CreateCartGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class CreateCartUseCase {

    //TODO - Gateway para buscar carrinho no banco
    // Gateway para salvar o carrinho no banco
    private final CreateCartGateway createCartGateway;
    // UseCase de adicionar um item ao carrinho

    public Cart execute(CartRequest cartRequest, String buyerEmail) {

        //TODO - Criar carrinho
        // 1 - Busca carrinho no banco
        // 2 - Se nao encontrar carrinho, criar (codigo abaixo)
        // 3 - Se encontrar carrinho, chamar useCase addItemUseCase

        //TODO - Antes de criar carrinho realizar os passos de busca no banco
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(cartRequest.getItem());
        Cart cart = new Cart(buyerEmail, itemList, 0.0, false);
        cart.calculateTotals();
        createCartGateway.execute(cart);
        //TODO - Retornar cart salvo no banco
        return cart;
    }

}
