package com.el.repo;

import com.el.entity.OrgCustDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;


/**
 * <p>
 * 功能说明
 * </p>
 *
 * @author Kevin.yuan
 * @since 2021-02-26 11:10:58
 */
@Repository
public interface OrgCustRepo extends JpaRepository<OrgCustDO, Long>, QuerydslPredicateExecutor<OrgCustDO> {


    Optional<OrgCustDO> findByCustCode(String custCode);

    @Query(value = "select * from org_cust where es5 = :openId ",nativeQuery = true)
    List<Map<String,Object>> findByOpenId(@Param("openId") String openId);
}
