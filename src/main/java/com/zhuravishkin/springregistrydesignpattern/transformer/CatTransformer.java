package com.zhuravishkin.springregistrydesignpattern.transformer;

import com.zhuravishkin.springregistrydesignpattern.model.RequestData;
import com.zhuravishkin.springregistrydesignpattern.model.Subscriber;
import com.zhuravishkin.springregistrydesignpattern.service.DBService;
import org.springframework.stereotype.Component;

@Component
public class CatTransformer implements Transformer {
    private final DBService dbService;

    public CatTransformer(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    public Subscriber transform(RequestData requestData) {
        return dbService.getResultFromDB(requestData);
    }

    @Override
    public int transformerId() {
        return 0;
    }
}
