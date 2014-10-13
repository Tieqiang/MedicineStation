package com.medicine.facade.medicine;

import com.medicine.facade.BaseFacade;
import com.medicine.models.entity.DeptDict;

import java.util.List;

/**
 * Created by heren on 2014/10/13.
 */
public class DeptFacade extends BaseFacade {

    public List<DeptDict> findAllDeptDict(){
        return super.findAll(DeptDict.class) ;
    }
}
