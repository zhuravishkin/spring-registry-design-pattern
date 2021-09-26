package com.zhuravishkin.springregistrydesignpattern.controller;

import com.zhuravishkin.springregistrydesignpattern.model.RequestData;
import com.zhuravishkin.springregistrydesignpattern.model.Subscriber;
import com.zhuravishkin.springregistrydesignpattern.service.SubscriberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "message")
public class CatController {
    private final SubscriberService subscriberService;

    public CatController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @PostMapping(value = "/post")
    @ResponseBody
    public ResponseEntity<Subscriber> postCats(@RequestBody RequestData requestData) {
        Subscriber subscriber = subscriberService.unloadingFromDB(requestData);
        return new ResponseEntity<>(subscriber, HttpStatus.OK);
    }
}
