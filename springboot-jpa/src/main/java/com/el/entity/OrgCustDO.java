package com.el.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "org_cust")
@org.hibernate.annotations.Table(appliesTo = "org_cust", comment = "客户")
@DynamicUpdate
@DynamicInsert
@Where(clause = "delete_flag = 0 or delete_flag is null")
@Data
@Accessors(chain = true)
@ApiModel(value = "客户", description = "客户")
public class OrgCustDO extends BaseModel implements Serializable {

    private static final long serialVersionUID = 529256869020418809L;
    @ApiModelProperty("公司ID")
    @Column(name = "ou_id", columnDefinition = "bigint default 0 comment '公司ID'")
    Long ouId;

    @ApiModelProperty("BUID")
    @Column(name = "bu_id", columnDefinition = "bigint default 0 comment 'BUID'")
    Long buId;

    @ApiModelProperty("客户编号")
    @Column(name = "cust_code", columnDefinition = "varchar(40)  comment '客户编号'")
    String custCode;

    @ApiModelProperty("客户名称")
    @Column(name = "cust_name", columnDefinition = "varchar(200)  comment '客户名称'")
    String custName;

    @ApiModelProperty("客户名称2")
    @Column(name = "cust_name2", columnDefinition = "varchar(200)  comment '客户名称2'")
    String custName2;

    @ApiModelProperty("客户简称")
    @Column(name = "cust_abbr", columnDefinition = "varchar(100)  comment '客户简称'")
    String custAbbr;

    @ApiModelProperty("客户类型 [UDC]ORG:CUST_TYPE")
    @Column(name = "cust_type", columnDefinition = "varchar(40)  comment '客户类型 [UDC]ORG:CUST_TYPE'")
    String custType;

    @ApiModelProperty("客户类型2 [UDC]ORG:CUST_TYPE2")
    @Column(name = "cust_type2", columnDefinition = "varchar(40)  comment '客户类型2 [UDC]ORG:CUST_TYPE2'")
    String custType2;

    @ApiModelProperty("客户类型3 [UDC]ORG:CUST_TYPE3")
    @Column(name = "cust_type3", columnDefinition = "varchar(40)  comment '客户类型3 [UDC]ORG:CUST_TYPE3'")
    String custType3;

    @ApiModelProperty("客户类型4")
    @Column(name = "cust_type4", columnDefinition = "varchar(40)  comment '客户类型4'")
    String custType4;

    @ApiModelProperty("客户类型5")
    @Column(name = "cust_type5", columnDefinition = "varchar(40)  comment '客户类型5'")
    String custType5;

    @ApiModelProperty("客户状态 ORG:CUST_STATUS")
    @Column(name = "cust_status", columnDefinition = "varchar(40)  comment '客户状态 ORG:CUST_STATUS'")
    String custStatus;

    @ApiModelProperty("客户状态2")
    @Column(name = "cust_status2", columnDefinition = "varchar(40)  comment '客户状态2'")
    String custStatus2;

    @ApiModelProperty("客户状态3")
    @Column(name = "cust_status3", columnDefinition = "varchar(40)  comment '客户状态3'")
    String custStatus3;

    @ApiModelProperty("客户组别")
    @Column(name = "cust_group", columnDefinition = "varchar(40)  comment '客户组别'")
    String custGroup;

    @ApiModelProperty("客户组别2")
    @Column(name = "cust_group2", columnDefinition = "varchar(40)  comment '客户组别2'")
    String custGroup2;

    @ApiModelProperty("客户组别3")
    @Column(name = "cust_group3", columnDefinition = "varchar(40)  comment '客户组别3'")
    String custGroup3;

    @ApiModelProperty("客户组别4")
    @Column(name = "cust_group4", columnDefinition = "varchar(40)  comment '客户组别4'")
    String custGroup4;

    @ApiModelProperty("大类编号 使用COM_C1表")
    @Column(name = "c1_code", columnDefinition = "varchar(40)  comment '大类编号 使用COM_C1表'")
    String c1Code;

    @ApiModelProperty("中类编号 使用COM_C2表")
    @Column(name = "c2_code", columnDefinition = "varchar(40)  comment '中类编号 使用COM_C2表'")
    String c2Code;

    @ApiModelProperty("小类编号")
    @Column(name = "c3_code", columnDefinition = "varchar(40)  comment '小类编号'")
    String c3Code;

    @ApiModelProperty("上级ID")
    @Column(name = "pid", columnDefinition = "bigint default 0  comment '上级ID'")
    Long pid;

    @ApiModelProperty("路径")
    @Column(name = "cust_path", columnDefinition = "varchar(500)  comment '路径'")
    String custPath;

    @ApiModelProperty("地址号")
    @Column(name = "addr_no", columnDefinition = "int(18)  comment '地址号'")
    Integer addrNo;

    @ApiModelProperty("拼音")
    @Column(name = "pinyin", columnDefinition = "varchar(800)  comment '拼音'")
    String pinyin;

    @ApiModelProperty("拼音简称")
    @Column(name = "pinyin_sh", columnDefinition = "varchar(200)  comment '拼音简称'")
    String pinyinSh;

    @ApiModelProperty("资金能力")
    @Column(name = "comp_capital", columnDefinition = "varchar(40)  comment '资金能力'")
    String compCapital;

    @ApiModelProperty("业务员员工ID")
    @Column(name = "agent_emp_id", columnDefinition = "bigint default 0  comment '业务员员工ID'")
    Long agentEmpId;

    @ApiModelProperty("付款方式")
    @Column(name = "pay_method", columnDefinition = "varchar(40)  comment '付款方式'")
    String payMethod;

    @ApiModelProperty("币种")
    @Column(name = "cust_curr", columnDefinition = "varchar(40)  comment '币种'")
    String custCurr;

    @ApiModelProperty("信贷级别 [UDC]COM:CREDIT_LEVEL")
    @Column(name = "credit_level", columnDefinition = "varchar(40)  comment '信贷级别 [UDC]COM:CREDIT_LEVEL'")
    String creditLevel;

    @ApiModelProperty("信用额度")
    @Column(name = "credit_limit", columnDefinition = "NUMERIC(20,2)   comment '信用额度'")
    BigDecimal creditLimit;

    @ApiModelProperty("信用余额")
    @Column(name = "credit_bal", columnDefinition = "NUMERIC(20,2)  comment '信用余额'")
    BigDecimal creditBal;

    @ApiModelProperty("信贷检查类型 [UDC]COM:CREDIT_CHECK_TYPE")
    @Column(name = "credit_check_type", columnDefinition = "varchar(40)  comment '信贷检查类型 [UDC]COM:CREDIT_CHECK_TYPE'")
    String creditCheckType;

    @ApiModelProperty("支付条款")
    @Column(name = "payment_term", columnDefinition = "varchar(40)  comment '支付条款'")
    String paymentTerm;

    @ApiModelProperty("结算方式")
    @Column(name = "settle_type", columnDefinition = "varchar(40)  comment '结算方式'")
    String settleType;

    @ApiModelProperty("对账周期")
    @Column(name = "recon_period", columnDefinition = "varchar(40)  comment '对账周期'")
    String reconPeriod;

    @ApiModelProperty("月结日期")
    @Column(name = "settle_monthly_day", columnDefinition = "int(18)  comment '月结日期'")
    Integer settleMonthlyDay;

    @ApiModelProperty("默认BUID")
    @Column(name = "def_bu_id", columnDefinition = "bigint default 0  comment '默认BUID'")
    Long defBuId;

    @ApiModelProperty("默认仓库ID")
    @Column(name = "def_wh_id", columnDefinition = "bigint default 0  comment '默认仓库ID'")
    Long defWhId;

    @ApiModelProperty("国家")
    @Column(name = "country", columnDefinition = "varchar(40)  comment '国家'")
    String country;

    @ApiModelProperty("邮编")
    @Column(name = "postcode", columnDefinition = "varchar(40)  comment '邮编'")
    String postcode;

    @ApiModelProperty("区域")
    @Column(name = "region", columnDefinition = "varchar(40)  comment '区域'")
    String region;

    @ApiModelProperty("客户等级")
    @Column(name = "cust_level", columnDefinition = "varchar(40)  comment '客户等级'")
    String custLevel;

    @ApiModelProperty("渠道类型 [UDC]COM:CHANNEL_TYPE")
    @Column(name = "channel_type", columnDefinition = "varchar(40)  comment '渠道类型 [UDC]COM:CHANNEL_TYPE'")
    String channelType;

    @ApiModelProperty("渠道类型2 [UDC]COM:CHANNEL_TYPE2")
    @Column(name = "channel_type2", columnDefinition = "varchar(40)  comment '渠道类型2 [UDC]COM:CHANNEL_TYPE2'")
    String channelType2;

    @ApiModelProperty("KA类型")
    @Column(name = "ka_type", columnDefinition = "varchar(40)  comment 'KA类型'")
    String kaType;

    @ApiModelProperty("门店类型")
    @Column(name = "store_type", columnDefinition = "varchar(40)  comment '门店类型'")
    String storeType;

    @ApiModelProperty("会员号码")
    @Column(name = "vip_no", columnDefinition = "varchar(40)  comment '会员号码'")
    String vipNo;

    @ApiModelProperty("会员级别")
    @Column(name = "vip_level", columnDefinition = "varchar(10)  comment '会员级别'")
    String vipLevel;

    @ApiModelProperty("会员组别")
    @Column(name = "vip_group", columnDefinition = "varchar(20)  comment '会员组别'")
    String vipGroup;

    @ApiModelProperty("是否积分")
    @Column(name = "cust_point_flag", columnDefinition = " int(1)   comment '是否积分'")
    Boolean custPointFlag;

    @ApiModelProperty("积分余额")
    @Column(name = "point_balance", columnDefinition = "NUMERIC(10,2)   comment '积分余额'")
    BigDecimal pointBalance;

    @ApiModelProperty("客户来源")
    @Column(name = "cust_source", columnDefinition = "varchar(20)  comment '客户来源'")
    String custSource;

    @ApiModelProperty("生效日期")
    @Column(name = "valid_from", columnDefinition = "datetime   comment '生效日期'")
    LocalDateTime validFrom;

    @ApiModelProperty("失效日期")
    @Column(name = "valid_to", columnDefinition = "datetime   comment '失效日期'")
    LocalDateTime validTo;

    @ApiModelProperty("税区")
    @Column(name = "tax_type", columnDefinition = "varchar(40)  comment '税区'")
    String taxType;

    @ApiModelProperty("税码")
    @Column(name = "tax_code", columnDefinition = "varchar(40)  comment '税码'")
    String taxCode;

    @ApiModelProperty("纳税人类型")
    @Column(name = "taxpayer_type", columnDefinition = "varchar(40)  comment '纳税人类型'")
    String taxpayerType;

    @ApiModelProperty("税号")
    @Column(name = "taxer_no", columnDefinition = "varchar(100)  comment '税号'")
    String taxerNo;

    @ApiModelProperty("发票类型 [UDC]COM:INV_TYPE")
    @Column(name = "inv_type", columnDefinition = "varchar(40)  comment '发票类型 [UDC]COM:INV_TYPE'")
    String invType;

    @ApiModelProperty("开票抬头")
    @Column(name = "inv_title", columnDefinition = "varchar(40)  comment '开票抬头'")
    String invTitle;

    @ApiModelProperty("开票地址")
    @Column(name = "inv_address", columnDefinition = "varchar(200)  comment '开票地址'")
    String invAddress;

    @ApiModelProperty("开票联系人")
    @Column(name = "inv_pic_name", columnDefinition = "varchar(40)  comment '开票联系人'")
    String invPicName;

    @ApiModelProperty("开票联系人电话")
    @Column(name = "inv_pic_phone", columnDefinition = "varchar(40)  comment '开票联系人电话'")
    String invPicPhone;

    @ApiModelProperty("开票电话")
    @Column(name = "inv_tel", columnDefinition = "varchar(40)  comment '开票电话'")
    String invTel;

    @ApiModelProperty("开票银行名称")
    @Column(name = "inv_bank_name", columnDefinition = "varchar(40)  comment '开票银行名称'")
    String invBankName;

    @ApiModelProperty("开票银行支行")
    @Column(name = "inv_bank_branch", columnDefinition = "varchar(40)  comment '开票银行支行'")
    String invBankBranch;

    @ApiModelProperty("开票银行账号")
    @Column(name = "inv_bank_acc", columnDefinition = "varchar(40)  comment '开票银行账号'")
    String invBankAcc;

    @ApiModelProperty("税率编号")
    @Column(name = "tax_rate_no", columnDefinition = "varchar(40)  comment '税率编号'")
    String taxRateNo;

    @ApiModelProperty("税率")
    @Column(name = "tax_rate", columnDefinition = "NUMERIC(20,8)   comment '税率'")
    BigDecimal taxRate;

    @ApiModelProperty("总账类型 [UDC]ORG:CUST_GL_TYPE")
    @Column(name = "fin_gl_type", columnDefinition = "varchar(40)  comment '总账类型 [UDC]ORG:CUST_GL_TYPE'")
    String finGlType;

    @ApiModelProperty("工商登记号")
    @Column(name = "ic_register_no", columnDefinition = "varchar(40)  comment '工商登记号'")
    String icRegisterNo;

    @ApiModelProperty("注册日期")
    @Column(name = "register_date", columnDefinition = "datetime   comment '注册日期'")
    LocalDateTime registerDate;

    @ApiModelProperty("注册地址")
    @Column(name = "register_address", columnDefinition = "varchar(200)  comment '注册地址'")
    String registerAddress;

    @ApiModelProperty("注册商标编号")
    @Column(name = "register_trademark_no", columnDefinition = "varchar(40)  comment '注册商标编号'")
    String registerTrademarkNo;

    @ApiModelProperty("注册资金")
    @Column(name = "register_fund", columnDefinition = "varchar(40)  comment '注册资金'")
    String registerFund;

    @ApiModelProperty("注册资金货币")
    @Column(name = "register_fund_curry", columnDefinition = "varchar(40)  comment '注册资金货币'")
    String registerFundCurry;

    @ApiModelProperty("工商登记注册机关")
    @Column(name = "ic_issued", columnDefinition = "varchar(40)  comment '工商登记注册机关'")
    String icIssued;

    @ApiModelProperty("工商登记日期")
    @Column(name = "ic_issued_date", columnDefinition = "datetime   comment '工商登记日期'")
    LocalDateTime icIssuedDate;

    @ApiModelProperty("组织机构代码证")
    @Column(name = "biz_code_cert", columnDefinition = "varchar(40)  comment '组织机构代码证'")
    String bizCodeCert;

    @ApiModelProperty("机构类型")
    @Column(name = "biz_type", columnDefinition = "varchar(40)  comment '机构类型'")
    String bizType;

    @ApiModelProperty("组织机构代码证颁发单位")
    @Column(name = "biz_issued", columnDefinition = "varchar(40)  comment '组织机构代码证颁发单位'")
    String bizIssued;

    @ApiModelProperty("统一信用代码")
    @Column(name = "cert_no", columnDefinition = "varchar(40)  comment '统一信用代码'")
    String certNo;

    @ApiModelProperty("税务登记证编号")
    @Column(name = "tax_reg_no", columnDefinition = "varchar(40)  comment '税务登记证编号'")
    String taxRegNo;

    @ApiModelProperty("纳税人识别号")
    @Column(name = "taxpayer_id", columnDefinition = "varchar(40)  comment '纳税人识别号'")
    String taxpayerId;

    @ApiModelProperty("法人代表")
    @Column(name = "repr", columnDefinition = "varchar(40)  comment '法人代表'")
    String repr;

    @ApiModelProperty("法人证件类型")
    @Column(name = "repr_cert_type", columnDefinition = "varchar(40)  comment '法人证件类型'")
    String reprCertType;

    @ApiModelProperty("法人证件编号")
    @Column(name = "repr_cert_no", columnDefinition = "varchar(40)  comment '法人证件编号'")
    String reprCertNo;

    @ApiModelProperty("法人手机号")
    @Column(name = "repr_cert_mobile", columnDefinition = "varchar(40)  comment '法人手机号'")
    String reprCertMobile;

    @ApiModelProperty("公司名称")
    @Column(name = "comp_name", columnDefinition = "varchar(40)  comment '公司名称'")
    String compName;

    @ApiModelProperty("公司性质")
    @Column(name = "comp_prop", columnDefinition = "varchar(40)  comment '公司性质'")
    String compProp;

    @ApiModelProperty("公司规模")
    @Column(name = "comp_scale", columnDefinition = "varchar(40)  comment '公司规模'")
    String compScale;

    @ApiModelProperty("经营地点")
    @Column(name = "comp_bussaddr", columnDefinition = "varchar(40)  comment '经营地点'")
    String compBussaddr;

    @ApiModelProperty("主营业务")
    @Column(name = "comp_mainbuss", columnDefinition = "varchar(40)  comment '主营业务'")
    String compMainbuss;

    @ApiModelProperty("经营范围")
    @Column(name = "comp_bussrange", columnDefinition = "varchar(2000)  comment '经营范围'")
    String compBussrange;

    @ApiModelProperty("外部编码")
    @Column(name = "outer_code", columnDefinition = "varchar(40)  comment '外部编码'")
    String outerCode;

    @ApiModelProperty("标签")
    @Column(name = "tags", columnDefinition = "varchar(200)  comment '标签'")
    String tags;

    @ApiModelProperty("ES1")
    @Column(name = "es1", columnDefinition = "varchar(40)  comment 'ES1'")
    String es1;

    @ApiModelProperty("ES2")
    @Column(name = "es2", columnDefinition = "varchar(40)  comment 'ES2'")
    String es2;

    @ApiModelProperty("ES3")
    @Column(name = "es3", columnDefinition = "varchar(40)  comment 'ES3'")
    String es3;

    @ApiModelProperty("ES4")
    @Column(name = "es4", columnDefinition = "varchar(40)  comment 'ES4'")
    String es4;

    @ApiModelProperty("ES5")
    @Column(name = "es5", columnDefinition = "varchar(40)  comment 'ES5'")
    String es5;

    @ApiModelProperty("ES6")
    @Column(name = "es6", columnDefinition = "varchar(40)  comment 'ES6'")
    String es6;

    @ApiModelProperty("ES7")
    @Column(name = "es7", columnDefinition = "varchar(40)  comment 'ES7'")
    String es7;

    @ApiModelProperty("ES8")
    @Column(name = "es8", columnDefinition = "varchar(40)  comment 'ES8'")
    String es8;

    @ApiModelProperty("ES9")
    @Column(name = "es9", columnDefinition = "varchar(40)  comment 'ES9'")
    String es9;

    @ApiModelProperty("ES10")
    @Column(name = "es10", columnDefinition = "varchar(40)  comment 'ES10'")
    String es10;

    @ApiModelProperty("利润中心")
    @Column(name = "pcId", columnDefinition = "bigint default 0  comment '利润中心'")
    Long pcId;

    @ApiModelProperty("允许超允收期")
    @Column(name = "allowOverAap", columnDefinition = " int(1)   comment '允许超允收期'")
    Boolean allowOverAap;
    //liuqi 2020/10/13
    @ApiModelProperty("允许卫检单后补")
    @Column(name = "allow_pp_inv", columnDefinition = " int(1)   comment '允许卫检单后补'")
    Boolean allowPpInv;

    @ApiModelProperty("是否含税")
    @Column(name = "taxInclFlag", columnDefinition = " int(1)   comment '是否含税'")
    Boolean taxInclFlag;
    // roman.zhang add at 2020.10.9
    @ApiModelProperty("允许最大批次数量")
    @Column(name = "max_lot_num", columnDefinition = "int(18)  comment '允许最大批次数量'")
    Integer maxLotNum;

    @ApiModelProperty("接口状态")
    @Column(name = "intf_status", columnDefinition = "varchar(40)  comment '接口状态'")
    String intfStatus;

    @ApiModelProperty("接口处理时间")
    @Column(name = "intf_time", columnDefinition = "datetime   comment '接口处理时间'")
    LocalDateTime intfTime;

    @ApiModelProperty("活动订单金额")
    @Column(name = "OPEN_SO_AMT", columnDefinition = "NUMERIC(20,2)   comment '活动订单金额'")
    BigDecimal openSoAmt;

    @ApiModelProperty("预留浮点数1")
    @Column(name = "en1", columnDefinition = "float(20,2) comment '预留浮点数1'")
    Double en1;

    @ApiModelProperty("预留浮点数2")
    @Column(name = "en2", columnDefinition = "float(20,2) comment '预留浮点数2'")
    Double en2;

    @ApiModelProperty("预留浮点数3")
    @Column(name = "en3", columnDefinition = "float(20,2) comment '预留浮点数3'")
    Double en3;

    @ApiModelProperty("预留浮点数4")
    @Column(name = "en4", columnDefinition = "float(20,2) comment '预留浮点数4'")
    Double en4;

    @ApiModelProperty("预留浮点数5")
    @Column(name = "en5", columnDefinition = "float(20,2) comment '预留浮点数5'")
    Double en5;

    @ApiModelProperty(value = "是否有退货合同")
    @Column(columnDefinition = "tinyint(1) default 0 comment '是否有退货合同 0：否；1：是'")
    Boolean coFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrgCustDO)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        OrgCustDO entity = (OrgCustDO) o;
        return getId().equals(entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
