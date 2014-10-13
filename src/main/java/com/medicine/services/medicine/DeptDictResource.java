package com.medicine.services.medicine;

import com.google.inject.Inject;
import com.medicine.facade.medicine.DeptFacade;
import com.medicine.models.entity.DeptDict;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.util.List;

/**
 * Created by heren on 2014/10/13.
 */
@Path("dept")
@Produces(MediaType.APPLICATION_JSON)
public class DeptDictResource {

    @Context
    private UriInfo uriInfo ;

    private DeptFacade deptFacade;

    @Inject
    public DeptDictResource(DeptFacade deptFacade) {
        this.deptFacade = deptFacade;
    }

    @GET
    public List<DeptDict> findDept(){
        return deptFacade.findAllDeptDict();
    }
}
