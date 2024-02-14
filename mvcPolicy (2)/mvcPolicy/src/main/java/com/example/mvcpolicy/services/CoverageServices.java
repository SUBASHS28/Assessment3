package com.example.mvcpolicy.services;


import com.example.mvcpolicy.entity.Coverage;

import java.util.List;

public interface CoverageServices {
    List<Coverage> getAllCoverages();
    Coverage getById(Long id);
}
