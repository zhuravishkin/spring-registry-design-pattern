package com.zhuravishkin.springregistrydesignpattern.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhuravishkin.springregistrydesignpattern.model.RequestData;
import com.zhuravishkin.springregistrydesignpattern.model.Subscriber;
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
class SubscriberServiceTest {
    @SpyBean
    SubscriberService subscriberService;

    @MockBean
    DBService dbService;

    RequestData requestData;

    @BeforeEach
    void setUp() throws IOException {
        String string = Files.readString(Paths.get("src/test/resources/body.json"));
        requestData = new ObjectMapper().readValue(string, RequestData.class);
    }

    @Test
    void unloadingFromDB() {
        when(dbService.getResultFromDB(any(RequestData.class))).thenReturn(Subscriber.builder().build());
        assertNotNull(subscriberService.unloadingFromDB(requestData));
    }
}