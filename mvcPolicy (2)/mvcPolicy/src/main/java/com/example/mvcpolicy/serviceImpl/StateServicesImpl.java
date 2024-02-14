package com.example.mvcpolicy.serviceImpl;

import com.example.mvcpolicy.dao.StateDAOImpl;
import com.example.mvcpolicy.entity.State;
import com.example.mvcpolicy.services.StateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServicesImpl implements StateServices {
    @Autowired
    StateDAOImpl stateDAO;

    @Override
    public List<State> getAllStates() {
        return stateDAO.getAllStates();
    }
    @Override
    public State getById(Long id) {
        return stateDAO.getById(id);
    }
}
