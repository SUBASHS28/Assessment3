package com.example.mvcpolicy.dao;

import com.example.mvcpolicy.entity.State;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateDAOImpl implements StateDAO{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<State> getAllStates() {
        TypedQuery query = entityManager.createQuery("from State", State.class);
        return query.getResultList();
    }

    @Override
    public State getById(Long id) {
        return entityManager.find(State.class,id);
    }
}
