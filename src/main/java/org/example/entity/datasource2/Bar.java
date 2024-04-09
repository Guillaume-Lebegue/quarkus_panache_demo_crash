package org.example.entity.datasource2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Bar")
public class Bar {
    @Id
    public UUID id;
}
