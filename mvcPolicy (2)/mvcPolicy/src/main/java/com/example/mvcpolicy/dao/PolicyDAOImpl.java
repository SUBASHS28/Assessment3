package com.example.mvcpolicy.dao;

import com.example.mvcpolicy.entity.Policy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyDAOImpl implements PolicyDAO {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Policy> getAllpolicy() {
        TypedQuery query = entityManager.createQuery("from Policy",Policy.class);
        return query.getResultList();
    }

    @Override
    public Policy savePoilcy(Policy policy) {
        return entityManager.merge(policy);
    }

    @Override
    public Policy getPolicyById(Long id) {
        return entityManager.find(Policy.class,id);
    }
}
