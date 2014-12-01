/**
* Created by sf201 on 2014/11/29.
*/

var mrDiagnosisControl = mainApp.controller("mrDiagnosisControl", ["$scope", function ($scope) {
    //诊断列表
    $scope.diagnosisList = [];
    $scope.selectedDiagnosis=[] ;
    for(var i = 0 ;i<5;i++){
        var clsDiagnosis = new diagnosis();
        clsDiagnosis.diagnosisType ="入院诊断";
        clsDiagnosis.icdCode ="001001";
        clsDiagnosis.icdSubCode = "002112";
        clsDiagnosis.diagnosisName = "感冒";
        clsDiagnosis.statisticCode = "0021";
        clsDiagnosis.result = "无";
        clsDiagnosis.admConditon = "空";
        $scope.diagnosisList.push(clsDiagnosis);
    }
    $scope.diagnosisGrid={
        data:'diagnosisList',
        selectedItems:$scope.selectedDiagnosis,
        multiSelect: false,
        showFooter:false,
        beforeSelectionChange:function(item,ev){
            return true ;
        },
        afterSelectionChange:function(item,ev){
            if(item.selected){
                console.log(item.entity.icdCode) ;
            }
        },
        columnDefs:[{
            field:'diagnosisType',displayName:'诊断类别'
        },{
            field:'icdCode',displayName:'ICD编码'
        },{
            field:'icdSubCode',displayName:'附加码'
        },{
            field:'diagnosisName',displayName:'诊断中文名称'
        },{
            field:'statisticCode',displayName:'统计码'
        },{
            field:'result',displayName:'疗效'
        },{
            field:'admConditon',displayName:'入院病情'
        }]
    }
}]);

