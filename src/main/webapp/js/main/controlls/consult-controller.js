/**
 * Created by heren on 2014/11/17.
 */

var consultCtrl = mainApp.controller("consultCtrl", ["$scope", function ($scope) {

    //会诊列表
    $scope.consultes = [];
    $scope.mySelectPat=[] ;
    for(var i = 0 ;i<10;i++){
        var con = new consult();
        con.applyDate = Date.now();
        con.applyDeptCode = i + "deptcode";
        con.applyDeptName = "科室" + i;
        con.consultDoctorId = "2001";
        con.consultDoctorName = "李四";
        con.doctorId = "2002";
        con.doctorName = "王麻子";
        con.patId = i;
        con.patName = "病人" + i;
        $scope.consultes.push(con);
    }




    $scope.patListOptions={
        data:'consultes',
        selectedItems:$scope.mySelectPat,
        multiSelect: false,
        showFooter:true,
        beforeSelectionChange:function(item,ev){
            return true ;
        },
        afterSelectionChange:function(item,ev){
            if(item.selected){
                console.log(item.entity.patId) ;
            }
        },
        columnDefs:[{
            field:'patId',displayName:'病人ID'
        },{
            field:'patName',displayName:'病人姓名'
        },{
            field:'applyDate',displayName:'申请日期'
        },{
            field:'applyDeptName',displayName:'申请科室'
        }]
    }
}]);