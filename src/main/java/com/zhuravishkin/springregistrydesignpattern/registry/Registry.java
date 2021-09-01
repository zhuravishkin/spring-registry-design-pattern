package com.zhuravishkin.springregistrydesignpattern.registry;

import com.zhuravishkin.springregistrydesignpattern.transformer.Transformer;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class Registry {
    private static final Map<Integer, Transformer> TRANSFORMER_MAP = new ConcurrentHashMap<>();

    public void registryTransformer(int transformerId, Transformer transformer) {
        TRANSFORMER_MAP.put(transformerId, transformer);
    }

    public static Transformer getTransformerById(int transformerId) {
        return TRANSFORMER_MAP.get(transformerId);
    }
}
