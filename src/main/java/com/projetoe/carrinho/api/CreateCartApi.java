package com.projetoe.carrinho.api;

import com.projetoe.carrinho.controller.domain.CartRequest;
import com.projetoe.carrinho.controller.domain.CartResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("cart")
public interface CreateCartApi {

    @PostMapping("/{buyerEmail}")
    ResponseEntity<CartResponse> execute(@RequestBody CartRequest cartRequest, @PathVariable(value = "buyerEmail") String buyerEmail);

}
