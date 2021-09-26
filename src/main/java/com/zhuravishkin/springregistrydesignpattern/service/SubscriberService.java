package com.zhuravishkin.springregistrydesignpattern.service;

import com.zhuravishkin.springregistrydesignpattern.model.RequestData;
import com.zhuravishkin.springregistrydesignpattern.model.Subscriber;
import com.zhuravishkin.springregistrydesignpattern.transformer.Transformer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.zhuravishkin.springregistrydesignpattern.registry.Registry.getTransformerById;

@Slf4j
@Service
public class SubscriberService {
    public Subscriber unloadingFromDB(RequestData requestData) {
        Transformer transformer = getTransformerById(requestData.getTransformerId());
        if (transformer == null) {
            try {
                throw new IOException("Unknown transformer_id");
            } catch (IOException e) {
                log.error(e.getMessage(), e);
            }
        }
        return transformer.transform(requestData);
    }
}
