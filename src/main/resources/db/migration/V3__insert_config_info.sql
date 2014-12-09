--科室VO
-- insert into config_info values('1','com.medicine.models.vo','DeptDictVo','') ;
-- select a.*
--   from dept_dict a, dept_clinic_attr_dict b, dept_oi_attr_dict c
--  where a.clinic_attr = b.clinic_attr_code
--    and c.oi_attr_code = a.outp_or_inp
--    and b.clinic_attr_name = '临床'
--    and c.oi_attr_name = '住院'

--病人VO

-- insert into config_info values('1','com.medicine.models.vo','DeptDictVo','') ;
-- select a.patient_id, a.name, b.visit_id, a.inp_no, a.sex,a.id_no,a.identity
--   from pat_master_index a, pat_visit b
--  where a.patient_id = b.patient_id
--    and b.dept_admission_to = '%s'