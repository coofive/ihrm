package com.ihrm.entity.company.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 5/4/2019 5:47 PM
 */
@Data
@Accessors(chain = true)
@Slf4j
public class SaveCompanyDTO {
    /**
     * 公司名称
     */
    @NotEmpty
    private String companyName;
    /**
     * 企业登录账户ID
     */
    @NotEmpty
    private String managerId;
    /**
     * 当前版本
     */
    @NotEmpty
    private String version;
    /**
     * 持续时间
     */
    private Timestamp renewalDate;
    /**
     * 到期时间
     */
    private Timestamp expirationDate;
    /**
     * 公司地区
     */
    @NotEmpty
    private String companyArea;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 营业执照-图片ID
     */
    private String businessLicenseId;
    /**
     * 法人代表
     */
    @NotEmpty
    private String legalRepresentative;
    /**
     * 公司电话
     */
    @NotEmpty
    private String companyPhone;
    /**
     * 邮箱
     */
    @Email
    private String companyMail;
    /**
     * 公司规模
     */
    private String companySize;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 审核状态
     */
    private String auditState;
    /**
     * 状态
     */
    @NotNull
    private Integer state;
    /**
     * 当前余额
     */
    @NotNull
    private Double balance;
}
