package com.medicine.services.medicine;

import com.google.inject.Inject;
import com.medicine.facade.medicine.CommonFacade;
import com.medicine.models.entity.ConfigInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by heren on 2014/12/9.
 */
@Path("comm")
@Produces(MediaType.APPLICATION_JSON)
public class CommonService {

    private CommonFacade commonFacade ;

    @Inject
    public CommonService(CommonFacade commonFacade){
        this.commonFacade = commonFacade ;
    }

    @GET
    @Path("/{id}")
    public <T> List<T> findVoList( @PathParam("id")String id,@QueryParam("param")String param){
        ConfigInfo configInfo = commonFacade.get(ConfigInfo.class,id) ;
        String[] strings=null ;
        if (param !=null){
            strings = param.split("\\|") ;
        }
        if (configInfo==null){
            return null ;
        }
        List<T> list = commonFacade.findNativeList(configInfo.getPackageName(),configInfo.getClassName(),configInfo.getSql(),strings) ;
        return list ;
    }

}

