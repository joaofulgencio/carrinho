package com.projetoe.carrinho.usecase;

import com.projetoe.carrinho.domain.Cart;
import com.projetoe.carrinho.domain.Item;

import java.util.List;

public class AddItemUseCase {

    //TODO - Gateway para salvar no carrinho

    private void execute(Cart cart, Item item) {

        List<Item> itemList = cart.getItemsList();
        itemList.add(item);
        cart.calculateTotals();

        //TODO - Chamar gateway para salvar carrinho atualizado

    }
}
