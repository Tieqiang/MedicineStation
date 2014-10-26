package com.medicine.services.medicine;

import com.google.inject.Inject;
import com.medicine.facade.medicine.StaffDictFacade;
import com.medicine.models.entity.StaffDict;

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
    public StaffDict addStaffDict(@FormParam("name") String name,@FormParam("emp") String emp){
        StaffDict staffDict = new StaffDict();
        staffDict.setEmpNo(emp);
        staffDict.setName(name);
        return staffDict;
    }
}
