package org.example.entity.datasource1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "FOO")
public class Foo {
    @Id
    public UUID id;
}
