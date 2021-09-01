package com.zhuravishkin.springregistrydesignpattern.transformer;

import com.zhuravishkin.springregistrydesignpattern.model.Body;
import com.zhuravishkin.springregistrydesignpattern.model.Data;
import com.zhuravishkin.springregistrydesignpattern.service.DBService;
import org.springframework.stereotype.Component;

@Component
public class CatTransformer implements Transformer {
    private final DBService dbService;

    public CatTransformer(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    public Data transform(Body body) {
        return dbService.getResultFromDB(body);
    }

    @Override
    public int transformerId() {
        return 0;
    }
}
