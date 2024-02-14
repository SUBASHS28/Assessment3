package com.example.mvcpolicy.dao;

import com.example.mvcpolicy.entity.Coverage;

import java.util.List;

public interface CoveragesDAO {
    List<Coverage> getAllCoverages();
    Coverage getById(Long id);
}
