package com.khun.testcasehelper.auth;

import com.khun.testcasehelper.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
  private String name;
  private String email;
  private String password;
  private UserRole role;
}
