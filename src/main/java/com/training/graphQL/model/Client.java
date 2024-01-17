package com.training.graphQL.model;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Builder
@Setter
public class Client {

    UUID id;
    String firstName;
    String lastName;

}
