package com.zhuravishkin.springregistrydesignpattern.repository;

import com.zhuravishkin.springregistrydesignpattern.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface SubscribersRepository extends JpaRepository<Subscriber, String> {
}
