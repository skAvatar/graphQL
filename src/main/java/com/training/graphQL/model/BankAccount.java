package com.training.graphQL.model;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class BankAccount {
    UUID id;
    String name;
    Currency currency;
}
