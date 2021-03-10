package com.el.service.impl;

import com.el.entity.OrgCustDO;
import com.el.repo.OrgCustRepo;
import com.el.service.OrgCustService;
import com.el.utils.BeanCopyUtil;
import com.el.vo.OrgCustRespVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


/**
 * <p>
 * 功能说明
 * </p>
 *
 * @author Kevin.yuan
 * @since 2021-02-26 11:31:25
 */
@Service
@RequiredArgsConstructor
public class OrgCustServiceImpl implements OrgCustService {

    private final OrgCustRepo orgCustRepo;

    @Override
    @Transactional
    public Long createOne(OrgCustRespVO orgCustRespVO) {
        OrgCustDO orgCustDO = new OrgCustDO();
        BeanCopyUtil.beanCopy(orgCustRespVO,orgCustDO);
        return orgCustRepo.save(orgCustDO).getId();
    }

    @Override
    public OrgCustRespVO findByCustCode(String custCode) {
        Optional<OrgCustDO> byCustCode = orgCustRepo.findByCustCode(custCode);
        OrgCustRespVO orgCustRespVO = OrgCustRespVO.builder().build();
        byCustCode.ifPresent(orgCustDO -> BeanCopyUtil.beanCopy(orgCustDO, orgCustRespVO));
        return orgCustRespVO;
    }

}
