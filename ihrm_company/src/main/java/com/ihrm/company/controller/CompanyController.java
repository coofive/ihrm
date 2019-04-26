package com.ihrm.company.controller;

import com.ihrm.common.entity.Response;
import com.ihrm.entity.company.po.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenwu.liu.o
 */
@Slf4j
@RestController
@RequestMapping("/company")
public class CompanyController {

    @PostMapping
    public Response add(@RequestBody Company company) {
        return null;
    }
}
