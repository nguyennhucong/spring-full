package com.devteria.identityservice.dto.request;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
     String password;
     String firstName;
     String lastName;
     LocalDate dob;
}
