package com.example.mvcpolicy.controller;

import com.example.mvcpolicy.entity.Coverage;
import com.example.mvcpolicy.entity.Policy;
import com.example.mvcpolicy.entity.State;
import com.example.mvcpolicy.serviceImpl.CoverageServiceImpl;
import com.example.mvcpolicy.serviceImpl.PolicyServiceImpl;

import com.example.mvcpolicy.serviceImpl.StateServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")

public class PolicyController {
    @Autowired
    PolicyServiceImpl policyService;
    @Autowired
    CoverageServiceImpl coverageService;
    @Autowired
    StateServicesImpl stateServices;

    @GetMapping("getAllPolicy")
    public String getAllPolicy(Model model) {
        model.addAttribute("policy", policyService.getAllpolicy());
        return "viewPolicy";
    }

    @GetMapping("/addPolicy")
    public String addPolicy(Model model) {
        Policy policy = new Policy("Draft");
        model.addAttribute("policy", policy);
        model.addAttribute("defStates",stateServices.getAllStates());
        return "policy-form";
    }

    @PostMapping("/savePolicy")
    public String savePolicy(@RequestParam("state") String state,@ModelAttribute Policy policy) {
        State tempState = stateServices.getById(Long.parseLong(state));
        policy.getAddress().setState(tempState);
        policyService.savePolicy(policy);
        return "redirect:/coveragePoilcy/"+policy.getId();
    }
    @GetMapping("/coveragePoilcy/{id}")
    public String addCoverage(Model model, @PathVariable Long id){
        Policy policy=policyService.getByID(id);
        model.addAttribute("policy",policy);
        model.addAttribute("coveragesList", coverageService.getAllCoverages());
        return "coverages";
    }
    @PostMapping("/saveCoverage/{id}")
    public String saveCoverage(@RequestParam("coverages[]") String coverages[],@PathVariable Long id){
        Policy policy=policyService.getByID(id);
        for (String coverage : coverages) {
            Coverage cover = coverageService.getById(Long.parseLong(coverage));
            policy.getCoverages().add(cover);
        }
        policyService.savePolicy(policy);
        return "redirect:/premium/"+policy.getId();
    }
}

