package com.ihrm.entity.company.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 5/4/2019 5:58 PM
 */
@Data
@Accessors(chain = true)
public class CompanyVO {
    private String cid;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 企业登录账户ID
     */
    private String managerId;
    /**
     * 当前版本
     */
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
    private String legalRepresentative;
    /**
     * 公司电话
     */
    private String companyPhone;
    /**
     * 邮箱
     */
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
    private Integer state;
    /**
     * 当前余额
     */
    private Double balance;
    /**
     * 创建时间
     */
    private Timestamp createTime;
}
