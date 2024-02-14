package com.example.mvcpolicy.services;


import com.example.mvcpolicy.entity.Policy;

import java.util.List;

public interface PolicyServices {
    List<Policy> getAllpolicy();
    Policy savePolicy(Policy policy);
    Policy getByID(Long id);
}
