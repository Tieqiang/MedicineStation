/**
 * Created by heren on 2014/11/21.
 */

var patListCtrl = mainApp.controller("patListCtrl",["$scope","$http",function($scope,$http){

    var pat=function(){
        name:""
    }

    $scope.deptDicts=[] ;
    $scope.patients=[] ;

    $scope.inpDept = {} ;

    /**
     * 获取科室
     */
    $scope.getInpDept=function(){
        $http.get(Path.getUri("api/comm/1")).success(function(data){
            $scope.deptDicts=data ;
        });
    }
    $scope.getInpDept() ;
    $scope.selectedDept = "" ;
    $scope.getPatientListByDeptCode = function(dept){

        $http.get(Path.getUri("api/comm/2")+"?param="+dept).success(function(data){
            $scope.patients=data ;
            console.log(data) ;
        })
    }

    $scope.$watch("selectedDept",function(newValue,oldValue){
        $scope.getPatientListByDeptCode(newValue) ;
    }) ;


    $scope.patListGridOptions={
        data:'patients',
        selectedItems:$scope.mySelectPat,
        multiSelect: false,
        showFooter:true,
        beforeSelectionChange:function(item,ev){
            return true ;
        },
        afterSelectionChange:function(item,ev){
            if(item.selected){
                console.log(item.entity.patientId) ;
                $scope.$broadcast("patClick",item.entity.patientId) ;
                $scope.$emit("patClickEmt",item.entity) ;
            }
        }
        ,
        columnDefs:[{
            field:'name',displayName:'姓名'
        }]

    }

}])