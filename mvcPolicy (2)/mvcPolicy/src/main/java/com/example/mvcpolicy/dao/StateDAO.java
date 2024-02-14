package com.example.mvcpolicy.dao;


import com.example.mvcpolicy.entity.State;

import java.util.List;

public interface StateDAO {
    List<State> getAllStates();
    State getById(Long id);
}
