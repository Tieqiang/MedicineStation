/**
* Created by sf201 on 2014/12/02.
*/

var examControl = mainApp.controller("examControl", ["$scope", function ($scope) {
    //检查列表
    $scope.examMasterList = [];
    $scope.selectedExamMaster=[] ;

    for(var i = 0 ;i<5;i++){
        var clsExamMaster = new exammaster();
        clsExamMaster.applyDate ="2014-11-12";
        clsExamMaster.examName ="DR/CR胸部";
        $scope.examMasterList.push(clsExamMaster);
    }


    $scope.examMasterGrid={
        data:'examMasterList',
        selectedItems:$scope.selectedExamMaster,
        multiSelect: false,
        showFooter:false,
        beforeSelectionChange:function(item,ev){
            return true ;
        },
        afterSelectionChange:function(item,ev){
            if(item.selected){
                console.log(item.entity.examName) ;
            }
        },
        columnDefs:[{
            field:'applyDate',displayName:'申请日期'
        },{
            field:'examName',displayName:'申请单'
        }]
    }
}]);

