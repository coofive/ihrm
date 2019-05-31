package com.ihrm.company.controller;

import com.ihrm.common.entity.Response;
import com.ihrm.common.util.BeanUtil;
import com.ihrm.common.util.ResponseGenerator;
import com.ihrm.company.service.CompanyServiceImpl;
import com.ihrm.entity.company.dto.SaveCompanyDTO;
import com.ihrm.entity.company.po.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author wenwu.liu.o
 */
@Slf4j
@RestController
@RequestMapping("/company")
@Validated
public class CompanyController {

    @Resource
    private CompanyServiceImpl companyService;

    @PostMapping
    public Response add(@RequestBody @Valid SaveCompanyDTO saveCompanyDTO) {
        Company company = BeanUtil.copyProperties(saveCompanyDTO, Company.class);
        boolean result = companyService.saveCompany(company);
        return result? ResponseGenerator.success():ResponseGenerator.fail();
    }
}
