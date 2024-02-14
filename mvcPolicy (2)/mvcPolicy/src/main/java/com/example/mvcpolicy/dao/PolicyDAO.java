package com.example.mvcpolicy.dao;


import com.example.mvcpolicy.entity.Policy;

import java.util.List;

public interface PolicyDAO {
    List<Policy> getAllpolicy();
    Policy savePoilcy(Policy policy);
    Policy getPolicyById(Long id);
}

