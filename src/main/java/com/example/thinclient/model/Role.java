package com.example.thinclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("roles")
public class Role implements GrantedAuthority {
    @Id
    private String id;
    private String name;

    @Override
    public String getAuthority() {
        return getName();
    }
}
