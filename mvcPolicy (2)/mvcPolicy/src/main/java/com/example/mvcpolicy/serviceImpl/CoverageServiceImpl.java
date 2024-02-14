package com.example.mvcpolicy.serviceImpl;


import com.example.mvcpolicy.dao.CoveragesDAOImpl;
import com.example.mvcpolicy.entity.Coverage;
import com.example.mvcpolicy.services.CoverageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoverageServiceImpl implements CoverageServices {
    @Autowired
    CoveragesDAOImpl coveragesDAO;
    @Override
    public List<Coverage> getAllCoverages() {
        return coveragesDAO.getAllCoverages();
    }

    @Override
    public Coverage getById(Long id) {
        return coveragesDAO.getById(id);
    }
}
