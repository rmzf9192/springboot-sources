package com.el.test;

import com.el.SpringbootJpaApplication;
import com.el.service.OrgCustService;
import com.el.vo.OrgCustRespVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 *
 * @author Roman.Zhang
 * @description TODO
 * </p >
 * @date 2021/3/7
 */
@SpringBootTest(classes = {SpringbootJpaApplication.class})
@RequiredArgsConstructor
@RunWith(SpringRunner.class)
public class JpaTest {

    @Autowired
    private OrgCustService orgCustService;

    @Test
    public void testSaveOrgCust(){
        var custRespVOBuilder = OrgCustRespVO.builder().custCode("DF").custName("test");
        orgCustService.createOne(custRespVOBuilder.build());

    }

    @Test
    public void testFindCustCode(){
        System.out.println("结果："+orgCustService.findByCustCode("DF"));
    }
}
