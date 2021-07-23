package com.cts.estock.service;

import com.cts.estock.domain.CompanyRegistration;
import com.cts.estock.repository.CompanyRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyRegistrationService {

    @Autowired
    CompanyRegistrationRepository companyRegistrationRepository;

    public CompanyRegistration registerCompany(CompanyRegistration companyRegistration) {

        return companyRegistrationRepository.save(companyRegistration);

    }

    public Optional<CompanyRegistration> getCompanyDetails(long companyCode) {

        return companyRegistrationRepository.findById(companyCode);

    }


}
