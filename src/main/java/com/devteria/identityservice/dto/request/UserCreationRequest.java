package com.devteria.identityservice.dto.request;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
     String username;

    @Size(min = 8, message = "INVALID_PASSWORD")
     String password;
     String firstName;
     String lastName;
     LocalDate dob;

}
