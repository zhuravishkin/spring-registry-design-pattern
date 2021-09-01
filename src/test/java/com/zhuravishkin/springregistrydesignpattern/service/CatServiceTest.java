package com.zhuravishkin.springregistrydesignpattern.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhuravishkin.springregistrydesignpattern.model.Body;
import com.zhuravishkin.springregistrydesignpattern.model.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CatServiceTest {
    @SpyBean
    CatService catService;

    @MockBean
    DBService dbService;

    Body body;

    @BeforeEach
    void setUp() throws IOException {
        String string = Files.readString(Paths.get("src/test/resources/body.json"));
        body = new ObjectMapper().readValue(string, Body.class);
    }

    @Test
    void unloadingFromDB() {
        when(dbService.getResultFromDB(any(Body.class))).thenReturn(Data.builder().build());
        assertNotNull(catService.unloadingFromDB(body));
    }
}