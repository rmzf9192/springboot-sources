package com.el.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 客户(OrgCust)实体类
 *
 * @author Kevin.yuan
 * @since 2021-02-26 11:14:07
 */
@Builder
@Data
@ApiModel(value = "OrgCustVO", description = "客户")
public class OrgCustRespVO implements Serializable {
    private static final long serialVersionUID = 8414178799162106460L;
    /**
     * 记录唯一ID
     */
    @ApiModelProperty("记录唯一ID")
    private Long id;
    /**
     * 公司ID
     */
    @ApiModelProperty("公司ID")
    private Long ouId;
    /**
     * BUID
     */
    @ApiModelProperty("BUID")
    private Long buId;
    /**
     * 客户编号
     */
    @ApiModelProperty("客户编号")
    private String custCode;
    /**
     * 客户名称
     */
    @ApiModelProperty("客户名称")
    private String custName;
    /**
     * 客户名称2
     */
    @ApiModelProperty("客户名称2")
    private String custName2;
    /**
     * 客户简称
     */
    @ApiModelProperty("客户简称")
    private String custAbbr;
    /**
     * 客户类型 [UDC]ORG:CUST_TYPE
     */
    @ApiModelProperty("客户类型 [UDC]ORG:CUST_TYPE")
    private String custType;
    /**
     * 客户类型2 [UDC]ORG:CUST_TYPE2
     */
    @ApiModelProperty("客户类型2 [UDC]ORG:CUST_TYPE2")
    private String custType2;
    /**
     * 客户类型3 [UDC]ORG:CUST_TYPE3
     */
    @ApiModelProperty("客户类型3 [UDC]ORG:CUST_TYPE3")
    private String custType3;
    /**
     * 客户类型4
     */
    @ApiModelProperty("客户类型4")
    private String custType4;
    /**
     * 客户类型5
     */
    @ApiModelProperty("客户类型5")
    private String custType5;
    /**
     * 客户状态 ORG:CUST_STATUS
     */
    @ApiModelProperty("客户状态 ORG:CUST_STATUS")
    private String custStatus;
    /**
     * 客户状态2
     */
    @ApiModelProperty("客户状态2")
    private String custStatus2;
    /**
     * 客户状态3
     */
    @ApiModelProperty("客户状态3")
    private String custStatus3;
    /**
     * 客户组别
     */
    @ApiModelProperty("客户组别")
    private String custGroup;
    /**
     * 客户组别2
     */
    @ApiModelProperty("客户组别2")
    private String custGroup2;
    /**
     * 客户组别3
     */
    @ApiModelProperty("客户组别3")
    private String custGroup3;
    /**
     * 客户组别4
     */
    @ApiModelProperty("客户组别4")
    private String custGroup4;
    /**
     * 大类编号 使用COM_C1表
     */
    @ApiModelProperty("大类编号 使用COM_C1表")
    private String c1Code;
    /**
     * 中类编号 使用COM_C2表
     */
    @ApiModelProperty("中类编号 使用COM_C2表")
    private String c2Code;
    /**
     * 小类编号
     */
    @ApiModelProperty("小类编号")
    private String c3Code;
    /**
     * 上级ID
     */
    @ApiModelProperty("上级ID")
    private Long pid;
    /**
     * 路径
     */
    @ApiModelProperty("路径")
    private String custPath;
    /**
     * 地址号
     */
    @ApiModelProperty("地址号")
    private Integer addrNo;
    /**
     * 拼音
     */
    @ApiModelProperty("拼音")
    private String pinyin;
    /**
     * 拼音简称
     */
    @ApiModelProperty("拼音简称")
    private String pinyinSh;
    /**
     * 资金能力
     */
    @ApiModelProperty("资金能力")
    private String compCapital;
    /**
     * 业务员员工ID
     */
    @ApiModelProperty("业务员员工ID")
    private Long agentEmpId;
    /**
     * 付款方式
     */
    @ApiModelProperty("付款方式")
    private String payMethod;
    /**
     * 币种
     */
    @ApiModelProperty("币种")
    private String custCurr;
    /**
     * 信贷级别 [UDC]COM:CREDIT_LEVEL
     */
    @ApiModelProperty("信贷级别 [UDC]COM:CREDIT_LEVEL")
    private String creditLevel;
    /**
     * 信用额度
     */
    @ApiModelProperty("信用额度")
    private BigDecimal creditLimit;
    /**
     * 信用余额
     */
    @ApiModelProperty("信用余额")
    private BigDecimal creditBal;
    /**
     * 信贷检查类型 [UDC]COM:CREDIT_CHECK_TYPE
     */
    @ApiModelProperty("信贷检查类型 [UDC]COM:CREDIT_CHECK_TYPE")
    private String creditCheckType;
    /**
     * 支付条款
     */
    @ApiModelProperty("支付条款")
    private String paymentTerm;
    /**
     * 结算方式
     */
    @ApiModelProperty("结算方式")
    private String settleType;
    /**
     * 对账周期
     */
    @ApiModelProperty("对账周期")
    private String reconPeriod;
    /**
     * 月结日期
     */
    @ApiModelProperty("月结日期")
    private Integer settleMonthlyDay;
    /**
     * 默认BUID
     */
    @ApiModelProperty("默认BUID")
    private Long defBuId;
    /**
     * 默认仓库ID
     */
    @ApiModelProperty("默认仓库ID")
    private Long defWhId;
    /**
     * 国家
     */
    @ApiModelProperty("国家")
    private String country;
    /**
     * 邮编
     */
    @ApiModelProperty("邮编")
    private String postcode;
    /**
     * 区域
     */
    @ApiModelProperty("区域")
    private String region;
    /**
     * 客户等级
     */
    @ApiModelProperty("客户等级")
    private String custLevel;
    /**
     * 渠道类型 [UDC]COM:CHANNEL_TYPE
     */
    @ApiModelProperty("渠道类型 [UDC]COM:CHANNEL_TYPE")
    private String channelType;
    /**
     * 渠道类型2 [UDC]COM:CHANNEL_TYPE2
     */
    @ApiModelProperty("渠道类型2 [UDC]COM:CHANNEL_TYPE2")
    private String channelType2;
    /**
     * KA类型
     */
    @ApiModelProperty("KA类型")
    private String kaType;
    /**
     * 门店类型
     */
    @ApiModelProperty("门店类型")
    private String storeType;
    /**
     * 会员号码
     */
    @ApiModelProperty("会员号码")
    private String vipNo;
    /**
     * 会员级别
     */
    @ApiModelProperty("会员级别")
    private String vipLevel;
    /**
     * 会员组别
     */
    @ApiModelProperty("会员组别")
    private String vipGroup;
    /**
     * 是否积分
     */
    @ApiModelProperty("是否积分")
    private Integer custPointFlag;
    /**
     * 积分余额
     */
    @ApiModelProperty("积分余额")
    private BigDecimal pointBalance;
    /**
     * 客户来源
     */
    @ApiModelProperty("客户来源")
    private String custSource;
    /**
     * 生效日期
     */
    @ApiModelProperty("生效日期")
    private LocalDateTime validFrom;
    /**
     * 失效日期
     */
    @ApiModelProperty("失效日期")
    private LocalDateTime validTo;
    /**
     * 税区
     */
    @ApiModelProperty("税区")
    private String taxType;
    /**
     * 税码
     */
    @ApiModelProperty("税码")
    private String taxCode;
    /**
     * 纳税人类型
     */
    @ApiModelProperty("纳税人类型")
    private String taxpayerType;
    /**
     * 税号
     */
    @ApiModelProperty("税号")
    private String taxerNo;
    /**
     * 发票类型 [UDC]COM:INV_TYPE
     */
    @ApiModelProperty("发票类型 [UDC]COM:INV_TYPE")
    private String invType;
    /**
     * 开票抬头
     */
    @ApiModelProperty("开票抬头")
    private String invTitle;
    /**
     * 开票地址
     */
    @ApiModelProperty("开票地址")
    private String invAddress;
    /**
     * 开票联系人
     */
    @ApiModelProperty("开票联系人")
    private String invPicName;
    /**
     * 开票联系人电话
     */
    @ApiModelProperty("开票联系人电话")
    private String invPicPhone;
    /**
     * 开票电话
     */
    @ApiModelProperty("开票电话")
    private String invTel;
    /**
     * 开票银行名称
     */
    @ApiModelProperty("开票银行名称")
    private String invBankName;
    /**
     * 开票银行支行
     */
    @ApiModelProperty("开票银行支行")
    private String invBankBranch;
    /**
     * 开票银行账号
     */
    @ApiModelProperty("开票银行账号")
    private String invBankAcc;
    /**
     * 税率编号
     */
    @ApiModelProperty("税率编号")
    private String taxRateNo;
    /**
     * 税率
     */
    @ApiModelProperty("税率")
    private BigDecimal taxRate;
    /**
     * 总账类型 [UDC]ORG:CUST_GL_TYPE
     */
    @ApiModelProperty("总账类型 [UDC]ORG:CUST_GL_TYPE")
    private String finGlType;
    /**
     * 工商登记号
     */
    @ApiModelProperty("工商登记号")
    private String icRegisterNo;
    /**
     * 注册日期
     */
    @ApiModelProperty("注册日期")
    private LocalDateTime registerDate;
    /**
     * 注册地址
     */
    @ApiModelProperty("注册地址")
    private String registerAddress;
    /**
     * 注册商标编号
     */
    @ApiModelProperty("注册商标编号")
    private String registerTrademarkNo;
    /**
     * 注册资金
     */
    @ApiModelProperty("注册资金")
    private String registerFund;
    /**
     * 注册资金货币
     */
    @ApiModelProperty("注册资金货币")
    private String registerFundCurry;
    /**
     * 工商登记注册机关
     */
    @ApiModelProperty("工商登记注册机关")
    private String icIssued;
    /**
     * 工商登记日期
     */
    @ApiModelProperty("工商登记日期")
    private LocalDateTime icIssuedDate;
    /**
     * 组织机构代码证
     */
    @ApiModelProperty("组织机构代码证")
    private String bizCodeCert;
    /**
     * 机构类型
     */
    @ApiModelProperty("机构类型")
    private String bizType;
    /**
     * 组织机构代码证颁发单位
     */
    @ApiModelProperty("组织机构代码证颁发单位")
    private String bizIssued;
    /**
     * 统一信用代码
     */
    @ApiModelProperty("统一信用代码")
    private String certNo;
    /**
     * 税务登记证编号
     */
    @ApiModelProperty("税务登记证编号")
    private String taxRegNo;
    /**
     * 纳税人识别号
     */
    @ApiModelProperty("纳税人识别号")
    private String taxpayerId;
    /**
     * 法人代表
     */
    @ApiModelProperty("法人代表")
    private String repr;
    /**
     * 法人证件类型
     */
    @ApiModelProperty("法人证件类型")
    private String reprCertType;
    /**
     * 法人证件编号
     */
    @ApiModelProperty("法人证件编号")
    private String reprCertNo;
    /**
     * 法人手机号
     */
    @ApiModelProperty("法人手机号")
    private String reprCertMobile;
    /**
     * 公司名称
     */
    @ApiModelProperty("公司名称")
    private String compName;
    /**
     * 公司性质
     */
    @ApiModelProperty("公司性质")
    private String compProp;
    /**
     * 公司规模
     */
    @ApiModelProperty("公司规模")
    private String compScale;
    /**
     * 经营地点
     */
    @ApiModelProperty("经营地点")
    private String compBussaddr;
    /**
     * 主营业务
     */
    @ApiModelProperty("主营业务")
    private String compMainbuss;
    /**
     * 经营范围
     */
    @ApiModelProperty("经营范围")
    private String compBussrange;
    /**
     * 外部编码
     */
    @ApiModelProperty("外部编码")
    private String outerCode;
    /**
     * 标签
     */
    @ApiModelProperty("标签")
    private String tags;
    /**
     * ES1
     */
    @ApiModelProperty("ES1")
    private String es1;
    /**
     * ES2
     */
    @ApiModelProperty("ES2")
    private String es2;
    /**
     * ES3
     */
    @ApiModelProperty("ES3")
    private String es3;
    /**
     * ES4
     */
    @ApiModelProperty("ES4")
    private String es4;
    /**
     * ES5
     */
    @ApiModelProperty("ES5")
    private String es5;
    /**
     * ES6
     */
    @ApiModelProperty("ES6")
    private String es6;
    /**
     * ES7
     */
    @ApiModelProperty("ES7")
    private String es7;
    /**
     * ES8
     */
    @ApiModelProperty("ES8")
    private String es8;
    /**
     * ES9
     */
    @ApiModelProperty("ES9")
    private String es9;
    /**
     * ES10
     */
    @ApiModelProperty("ES10")
    private String es10;
    /**
     * 利润中心
     */
    @ApiModelProperty("利润中心")
    private Long pcId;
    /**
     * 允许超允收期
     */
    @ApiModelProperty("允许超允收期")
    private Integer allowOverAap;
    /**
     * 允许卫检单后补
     */
    @ApiModelProperty("允许卫检单后补")
    private Integer allowPpInv;
    /**
     * 是否含税
     */
    @ApiModelProperty("是否含税")
    private Integer taxInclFlag;
    /**
     * 允许最大批次数量
     */
    @ApiModelProperty("允许最大批次数量")
    private Integer maxLotNum;
    /**
     * 接口状态
     */
    @ApiModelProperty("接口状态")
    private String intfStatus;
    /**
     * 接口处理时间
     */
    @ApiModelProperty("接口处理时间")
    private LocalDateTime intfTime;
    /**
     * 活动订单金额
     */
    @ApiModelProperty("活动订单金额")
    private BigDecimal openSoAmt;
    /**
     * 预留浮点数1
     */
    @ApiModelProperty("预留浮点数1")
    private Double en1;
    /**
     * 预留浮点数2
     */
    @ApiModelProperty("预留浮点数2")
    private Double en2;
    /**
     * 预留浮点数3
     */
    @ApiModelProperty("预留浮点数3")
    private Double en3;
    /**
     * 预留浮点数4
     */
    @ApiModelProperty("预留浮点数4")
    private Double en4;
    /**
     * 预留浮点数5
     */
    @ApiModelProperty("预留浮点数5")
    private Double en5;
    /**
     * 是否有退货合同 0：否；1：是
     */
    @ApiModelProperty("是否有退货合同 0：否；1：是")
    private Object coFlag;
    /**
     * 租户ID
     */
    @ApiModelProperty("租户ID")
    private Long tenantId;
    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;
    /**
     * 记录创建者ID
     */
    @ApiModelProperty("记录创建者ID")
    private Long createUserId;
    /**
     * 记录创建者
     */
    @ApiModelProperty("记录创建者")
    private String creator;
    /**
     * 记录创建时间
     */
    @ApiModelProperty("记录创建时间")
    private LocalDateTime createTime;
    /**
     * 记录最后更新者ID
     */
    @ApiModelProperty("记录最后更新者ID")
    private Long modifyUserId;
    /**
     * 记录最后更新者
     */
    @ApiModelProperty("记录最后更新者")
    private String updater;
    /**
     * 记录最后更新时间
     */
    @ApiModelProperty("记录最后更新时间")
    private LocalDateTime modifyTime;
    /**
     * 逻辑删除，0：未删除，1：已删除
     */
    @ApiModelProperty("逻辑删除，0：未删除，1：已删除")
    private Integer deleteFlag;
    /**
     * 锁版本
     */
    @ApiModelProperty("锁版本")
    private Integer auditDataVersion;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrgCustRespVO)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        OrgCustRespVO entity = (OrgCustRespVO) o;
        return getId().equals(entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
