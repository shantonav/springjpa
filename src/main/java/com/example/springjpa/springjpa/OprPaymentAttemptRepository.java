package com.example.springjpa.springjpa;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by ssen on 6/20/2017.
 */
@RepositoryRestResource(collectionResourceRel = "orderinfos" , path = "orderinfos")
interface OprPaymentAttemptRepository extends PagingAndSortingRepository<OprPaymentattemptEntity,OprPaymentattemptEntityPK> {
    List<OprPaymentattemptEntity> findByOrderidAndMerchantid(@Param(value = "orderid") int orderid,
                                                             @Param(value = "mid") Integer mid, Pageable pageable);


    @Query(value = "select at from OprPaymentattemptEntity at left join fetch at.oprOrder o " +
            " where at.merchantid=?1 and o.merchantorderid is not null and o.merchantorderid=?2 order by at.statusdate desc")
    List<OprPaymentattemptEntity> findByMerchantidAndMerchantorderid(@Param(value = "mid")Integer mid,
                                                                     @Param(value = "merchantorderid") Integer morid,Pageable pageable);

    @Query(value = "select at from OprPaymentattemptEntity at " +
            " where at.merchantid=?1 and at.reference=?2 order by at.statusdate desc")
    List<OprPaymentattemptEntity> findByMerchantidAndReference(@Param(value = "mid") Integer mid,
                                                               @Param(value = "merchantreference")String reference,Pageable pageable);

    @Query(value = "select at from OprPaymentattemptEntity at left join fetch at.oprOrder o " +
            " where at.merchantid=?1 and o.merchantorderid is not null and o.merchantorderid=?2 and at.reference=?3 order by at.statusdate desc")
    List<OprPaymentattemptEntity> findByMerchantidAndMerchantorderidAndReference(@Param(value = "mid") Integer mid,
                                                                                 @Param(value = "merchantorderid")Integer morid,
                                                                                 @Param(value = "merchantreference")String reference,Pageable pageable);


}
