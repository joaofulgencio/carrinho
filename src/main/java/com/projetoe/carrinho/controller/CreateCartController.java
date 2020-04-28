package com.projetoe.carrinho.controller;

import com.projetoe.carrinho.api.CreateCartApi;
import com.projetoe.carrinho.controller.domain.CartRequest;
import com.projetoe.carrinho.controller.domain.CartResponse;
import com.projetoe.carrinho.translator.Translator;
import com.projetoe.carrinho.usecase.CreateCartUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateCartController implements CreateCartApi {

    private final CreateCartUseCase createCartUseCase;


    @Override
    public ResponseEntity<CartResponse> execute(CartRequest cartRequest, String buyerEmail) {
        return new ResponseEntity<>(Translator.translate(createCartUseCase.execute(cartRequest, buyerEmail), CartResponse.class), HttpStatus.OK);
    }
}
