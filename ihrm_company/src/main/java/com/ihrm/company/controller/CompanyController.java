package com.ihrm.company.controller;

import com.ihrm.common.entity.IhrmException;
import com.ihrm.common.entity.Response;
import com.ihrm.common.util.BeanUtil;
import com.ihrm.common.util.ResponseGenerator;
import com.ihrm.company.service.CompanyServiceImpl;
import com.ihrm.entity.company.dto.SaveCompanyDTO;
import com.ihrm.entity.company.po.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
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
public class CompanyController {

    @Resource
    private CompanyServiceImpl companyService;

    @PostMapping
    public Response add(@RequestBody @Valid SaveCompanyDTO saveCompanyDTO, BindingResult bindingResult) {
        // 校验入参
        checkDTOParams(bindingResult);
        Company company = BeanUtil.copyProperties(saveCompanyDTO, Company.class);
        boolean result = companyService.saveCompany(company);
        return result? ResponseGenerator.success():ResponseGenerator.fail();
    }

    private void checkDTOParams(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IhrmException("参数不正确");
        }
    }
}
