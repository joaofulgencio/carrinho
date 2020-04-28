package com.projetoe.carrinho.gateway.domain.database.repository;

import com.projetoe.carrinho.gateway.domain.CartDomain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<CartDomain, String> {
}