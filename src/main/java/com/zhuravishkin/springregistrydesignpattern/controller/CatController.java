package com.zhuravishkin.springregistrydesignpattern.controller;

import com.zhuravishkin.springregistrydesignpattern.model.Body;
import com.zhuravishkin.springregistrydesignpattern.model.Data;
import com.zhuravishkin.springregistrydesignpattern.service.CatService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "message")
public class CatController {
    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @PostMapping(value = "/post")
    @ResponseBody
    public ResponseEntity<Data> postCats(@RequestBody Body body) {
        Data data = catService.unloadingFromDB(body);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
