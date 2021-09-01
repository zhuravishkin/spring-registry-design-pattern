package com.zhuravishkin.springregistrydesignpattern.service;

import com.zhuravishkin.springregistrydesignpattern.model.Body;
import com.zhuravishkin.springregistrydesignpattern.model.Data;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    public Data getResultFromDB(Body body) {
        return Data.builder().build();
    }
}
