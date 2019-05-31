package com.ihrm.company.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ihrm.company.dao.mapper.CompanyMapper;
import com.ihrm.entity.company.po.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author wenwu.liu.o
 */
@Slf4j
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> {
    public boolean saveCompany(Company company) {
        return save(company);
    }
}
