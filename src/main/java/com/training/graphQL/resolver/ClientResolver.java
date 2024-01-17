package com.training.graphQL.resolver;

import com.training.graphQL.model.BankAccount;
import com.training.graphQL.model.Client;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    public Client client(BankAccount bankAccount){
        log.info("Requesting clint info for BankAccount id {}", bankAccount.getId());

        return Client.builder()
                .id(UUID.randomUUID())
                .firstName("First Name")
                .lastName("Last Name").build();
    }
}

