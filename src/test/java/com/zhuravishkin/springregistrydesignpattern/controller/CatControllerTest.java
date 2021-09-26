package com.zhuravishkin.springregistrydesignpattern.controller;

import com.zhuravishkin.springregistrydesignpattern.service.SubscriberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CatController.class)
class CatControllerTest {
    @Autowired
    MockMvc mockMvc;

    @SpyBean
    CatController catController;

    @MockBean
    SubscriberService subscriberService;

    @Test
    void postCats() throws Exception {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .pathSegment("message", "post")
                .build()
                .encode();
        String string = Files.readString(Paths.get("src/test/resources/body.json"));
        mockMvc.perform(post(uriComponents.toUri())
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(string))
                .andExpect(status().isOk())
                .andReturn();
    }
}