package com.cts.estock.controller;


import com.cts.estock.domain.CompanyRegistration;
import com.cts.estock.service.CompanyRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1.0/market/")
public class CompanyRegistrationaController {

    @Autowired
    private CompanyRegistrationService companyRegistrationService;

    @PostMapping("company/register")
    public CompanyRegistration registerCompanyineStock(@RequestBody CompanyRegistration companyRegistration){
        return companyRegistrationService.registerCompany(companyRegistration);
    }

    @GetMapping("company/info/{companyCode}")
    public Optional<CompanyRegistration> getCompanyDetails(@PathVariable int companyCode ){
        return companyRegistrationService.getCompanyDetails(companyCode);
    }

}
