package com.el.service;

import com.el.vo.OrgCustRespVO;

import java.util.List;
import java.util.Optional;

/**
 * <p>
 * 功能说明
 * </p>
 *
 * @author Kevin.yuan
 * @since 2021-02-26 11:31:24
 */
public interface OrgCustService {

    /**
     * 创建
     *
     * @param orgCustRespVO
     */
    Long createOne(OrgCustRespVO orgCustRespVO);

    OrgCustRespVO findByCustCode(String custCode);




}
