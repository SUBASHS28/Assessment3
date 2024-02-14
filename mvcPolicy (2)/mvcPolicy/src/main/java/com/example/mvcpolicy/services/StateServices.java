package com.example.mvcpolicy.services;


import com.example.mvcpolicy.entity.State;

import java.util.List;

public interface StateServices {
    List<State> getAllStates();
    State getById(Long id);
}
