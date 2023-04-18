package ch.noseryoung.uek295.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Encoder {

  @Bean
   PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }
}