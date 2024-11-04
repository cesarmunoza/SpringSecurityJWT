package com.example.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(schema = "public", name = "roles")
public class RoleEntity {

    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private ERole name;
}
