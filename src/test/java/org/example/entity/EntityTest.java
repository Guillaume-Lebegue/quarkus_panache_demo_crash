package org.example.entity;

import io.quarkus.agroal.DataSource;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.example.entity.datasource1.FooRepository;
import org.example.entity.datasource2.BarRepository;
import org.junit.jupiter.api.Test;

@QuarkusTest
class EntityTest {

    @Inject
    FooRepository fooRepository;

    @Inject
    BarRepository barRepository;

    @Transactional
    @Test
    void test_two_delete_all() {
        fooRepository.deleteAll();
        barRepository.deleteAll();
    }
}