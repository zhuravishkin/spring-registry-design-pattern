package com.zhuravishkin.springregistrydesignpattern.transformer;

import com.zhuravishkin.springregistrydesignpattern.model.RequestData;
import com.zhuravishkin.springregistrydesignpattern.model.Subscriber;
import com.zhuravishkin.springregistrydesignpattern.registry.Registry;
import org.springframework.beans.factory.annotation.Autowired;

public interface Transformer {
    Subscriber transform(RequestData requestData);

    int transformerId();

    @Autowired
    default void registryTransformer(Registry registry) {
        registry.registryTransformer(transformerId(), this);
    }
}
