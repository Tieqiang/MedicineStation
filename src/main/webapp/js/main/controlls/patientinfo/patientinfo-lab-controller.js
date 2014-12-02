/**
* Created by sf201 on 2014/11/29.
*/

var labControl = mainApp.controller("labControl", ["$scope", function ($scope) {
    //检验列表
    $scope.labMasterList = [];
    $scope.selectedLabMaster=[] ;
    //检验明细列表
    $scope.labDetailList = [];
    $scope.selectedLabDetail=[] ;
    for(var i = 0 ;i<5;i++){
        var clsLabMaster = new labmaster();
        var clsLabDetail = new labdetail();
        clsLabMaster.applyDate ="2014-11-12";
        clsLabMaster.labName ="血常规";

        clsLabDetail.applyDate="2014-11-12";
        clsLabDetail.reportDate="2014-11-13";
        clsLabDetail.itemClass="血液";
        clsLabDetail.itemName="全血";
        clsLabDetail.result="正常";
        clsLabDetail.exception="无";
        clsLabDetail.unit="ml";
        clsLabDetail.standardValue="2-5";

        $scope.labMasterList.push(clsLabMaster);
        $scope.labDetailList.push(clsLabDetail);
    }


    $scope.labMasterGrid={
        data:'labMasterList',
        selectedItems:$scope.selectedLabMaster,
        multiSelect: false,
        showFooter:false,
        beforeSelectionChange:function(item,ev){
            return true ;
        },
        afterSelectionChange:function(item,ev){
            if(item.selected){
                console.log(item.entity.labName) ;
            }
        },
        columnDefs:[{
            field:'applyDate',displayName:'申请日期'
        },{
            field:'labName',displayName:'申请单'
        }]
    }

    $scope.labDetailGrid={
        data:'labDetailList',
        selectedItems:$scope.selectedLabDetail,
        multiSelect: false,
        showFooter:false,
        beforeSelectionChange:function(item,ev){
            return true ;
        },
        afterSelectionChange:function(item,ev){
            if(item.selected){
                console.log(item.entity.applyDate) ;
            }
        },
        columnDefs:[{
            field:'applyDate',displayName:'申请日期'
        },{
            field:'reportDate',displayName:'报告日期'
        },{
            field:'itemClass',displayName:'项目类别'
        },{
            field:'result',displayName:'结果'
        },{
            field:'exception',displayName:'异常'
        },{
            field:'unit',displayName:'单位'
        },{
            field:'standardValue',displayName:'正常参考值'
        }]
    }
}]);

