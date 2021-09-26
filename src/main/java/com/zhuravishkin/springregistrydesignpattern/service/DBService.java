package com.zhuravishkin.springregistrydesignpattern.service;

import com.zhuravishkin.springregistrydesignpattern.model.RequestData;
import com.zhuravishkin.springregistrydesignpattern.model.Subscriber;
import com.zhuravishkin.springregistrydesignpattern.repository.SubscribersRepository;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    private final SubscribersRepository subscribersRepository;

    public DBService(SubscribersRepository subscribersRepository) {
        this.subscribersRepository = subscribersRepository;
    }

    public Subscriber getResultFromDB(RequestData requestData) {
        return subscribersRepository.findById(requestData.getPhoneNumber()).get();
    }
}
