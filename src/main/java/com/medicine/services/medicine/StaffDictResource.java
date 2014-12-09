package com.medicine.services.medicine;

import com.google.inject.Inject;
import com.medicine.facade.medicine.StaffDictFacade;
import com.medicine.models.entity.StaffDict;
import com.medicine.models.vo.StaffDictVO;
import com.sun.jersey.json.impl.JSONHelper;
import org.codehaus.jettison.json.JSONArray;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by heren on 2014/10/26.
 */
@Path("staff")
@Produces(MediaType.APPLICATION_JSON)
public class StaffDictResource {


    private StaffDictFacade staffDictFacade ;

    @Inject
    public StaffDictResource(StaffDictFacade staffDictFacade) {
        this.staffDictFacade = staffDictFacade;
    }

    @GET
    @Path("/{deptcode}")
    public List<StaffDict> getStaffDictByDeptCode(@PathParam("deptcode") String deptCode){
        return staffDictFacade.getStaffDictByDeptCode(deptCode) ;
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public StaffDict addStaffDict(StaffDictVO staffDictVO){
        StaffDict staffDict = new StaffDict();
        staffDict.setEmpNo(staffDictVO.getName());
        staffDict.setName(staffDictVO.getEmpNo());
        return staffDict;
    }
}
