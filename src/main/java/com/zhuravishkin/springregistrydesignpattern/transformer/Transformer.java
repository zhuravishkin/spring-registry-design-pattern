package com.zhuravishkin.springregistrydesignpattern.transformer;

import com.zhuravishkin.springregistrydesignpattern.model.Body;
import com.zhuravishkin.springregistrydesignpattern.model.Data;
import com.zhuravishkin.springregistrydesignpattern.registry.Registry;
import org.springframework.beans.factory.annotation.Autowired;

public interface Transformer {
    Data transform(Body body);

    int transformerId();

    @Autowired
    default void registryTransformer(Registry registry) {
        registry.registryTransformer(transformerId(), this);
    }
}
