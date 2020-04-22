package com.projetoe.carrinho.usecase;

import com.projetoe.carrinho.domain.Cart;
import com.projetoe.carrinho.domain.Item;

import java.util.ArrayList;

public class CreateCartUseCase {

    //TODO - Gateway para buscar carrinho no banco
    // Gateway para salvar o carrinho no banco
    // UseCase de adicionar um item ao carrinho


    public Cart execute(int buyerId, Item item) {

        //TODO - Criar carrinho
        // 1 - Busca carrinho no banco
        // 2 - Se nao encontrar carrinho, criar (codigo abaixo)
        // 3 - Se encontrar carrinho, chamar useCase addItemUseCase

        //TODO - Antes de criar carrinho realizar os passos de busca no banco
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item);
        Cart cart = new Cart(buyerId, itemList, 0.0, false);
        cart.calculateTotal();
        //TODO - Retornar cart salvo no banco
        return null;
    }
}
