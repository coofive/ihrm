package com.ihrm.entity.company.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

/**
 * 企业实体类
 *
 * @author wenwu.liu.o
 */
@Data
@Accessors(chain = true)
@TableName(value = "co_company")
public class Company {
    @TableId(type = IdType.ID_WORKER_STR)
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
