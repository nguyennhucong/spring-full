package com.devteria.identityservice.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    String id;
    String username;
    String firstName;
    String lastName;
    LocalDate dob;
//    Set<String> roles;
    String roles;
}
