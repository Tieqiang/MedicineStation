package com.medicine;

import org.junit.Test;

/**
 * Created by heren on 2014/12/9.
 */
public class uitl {
    @Test
    public void testStringFormat(){
        //查看文档：http://blog.csdn.net/lonely_fireworks/article/details/7962171
        String str ="select * from pat_master_index where patient_id='%s' and visit_id='%s'" ;
        String strFormmat = String.format(str,"2001","2002");
        System.out.println(strFormmat);
    }
}
