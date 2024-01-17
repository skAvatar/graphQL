package com.training.graphQL.resolver;

import com.training.graphQL.model.BankAccount;
import com.training.graphQL.model.Client;
import com.training.graphQL.model.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id) {
        log.info("Getting bank account for id: {}", id);

        return BankAccount.builder()
                .id(id)
                .currency(Currency.USD)
                .build();
    }

}
