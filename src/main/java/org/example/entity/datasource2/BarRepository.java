package org.example.entity.datasource2;

import io.quarkus.agroal.DataSource;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class BarRepository implements PanacheRepositoryBase<Bar, UUID> {
}
