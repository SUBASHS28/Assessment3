package com.example.mvcpolicy.serviceImpl;


import com.example.mvcpolicy.dao.PolicyDAOImpl;
import com.example.mvcpolicy.entity.Policy;
import com.example.mvcpolicy.services.PolicyServices;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyServices {
    @Autowired
    PolicyDAOImpl policyService;
    @Override
    public List<Policy> getAllpolicy() {
        return policyService.getAllpolicy();
    }
    @Transactional
    @Override
    public Policy savePolicy(Policy policy) {
        return policyService.savePoilcy(policy);
    }

    @Override
    public Policy getByID(Long id) {
        return policyService.getPolicyById(id);
    }

}
