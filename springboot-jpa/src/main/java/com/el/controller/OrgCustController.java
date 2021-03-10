package com.el.controller;

import com.el.service.OrgCustService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author Roman.Zhang
 * @description TODO
 * </p >
 * @date 2021/3/6
 */
@Slf4j
@RestController
public class OrgCustController {
    @Autowired
    OrgCustService orgCustService;


    @GetMapping("/saveOrgCust")
    public String saveOrgCust(){
        log.info("test");
        return "jj";
    }
}
