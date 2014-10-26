package com.medicine.facade.medicine;

import com.google.inject.Inject;
import com.medicine.facade.BaseFacade;
import com.medicine.models.entity.StaffDict;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by heren on 2014/10/26.
 */
public class StaffDictFacade  extends BaseFacade{
    private EntityManager entityManager ;

    @Inject
    public StaffDictFacade(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<StaffDict> getStaffDictByDeptCode(String deptCode){

        String hql = "from StaffDict s where s.deptCode=:deptCode" ;
        Query query = entityManager.createQuery(hql) ;
        query.setParameter("deptCode",deptCode) ;
        return query.getResultList();
    }
}
