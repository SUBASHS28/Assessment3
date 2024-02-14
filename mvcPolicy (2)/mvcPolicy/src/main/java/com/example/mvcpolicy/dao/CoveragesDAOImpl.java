package com.example.mvcpolicy.dao;

import com.example.mvcpolicy.entity.Coverage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CoveragesDAOImpl implements CoveragesDAO{
    @Autowired
    EntityManager entityManager;
    @Override
    public List<Coverage> getAllCoverages() {
        TypedQuery query = entityManager.createQuery("from Coverage",Coverage.class);
        return query.getResultList();
    }

    @Override
    public Coverage getById(Long id) {
        return entityManager.find(Coverage.class,id);
    }
}
