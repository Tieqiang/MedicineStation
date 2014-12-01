/**
* Created by sf201 on 2014/11/29.
*/

var mrOperationControl = mainApp.controller("mrOperationControl", ["$scope", function ($scope) {
    //手术
    $scope.operationList = [];
    $scope.selectedOperation=[] ;
    for(var i = 0 ;i<5;i++){
        var clsOperation = new operation();
        clsOperation.operationDate ="2014-01-02";
        clsOperation.operationCode ="001001";
        clsOperation.operationName = "骨折固定";
        clsOperation.doctor = "李大夫";
        clsOperation.assistant1 = "马护士";
        clsOperation.assistant2 = "马护士";
        clsOperation.anaesthesia = "局部麻醉";
        clsOperation.woudGrade = "I";
        clsOperation.heal = "愈合";
        clsOperation.anaesthesiaDoctor = "张大夫";
        clsOperation.scale = "I级";
        $scope.operationList.push(clsOperation);
    }
    $scope.operationGrid={
        data:'operationList',
        selectedItems:$scope.selectedOperation,
        multiSelect: false,
        showFooter:false,
        beforeSelectionChange:function(item,ev){
            return true ;
        },
        afterSelectionChange:function(item,ev){
            if(item.selected){
                console.log(item.entity.operationCode) ;
            }
        },
        columnDefs:[{
            field:'operationDate',displayName:'手术日期',width:'100'
        },{
            field:'operationCode',displayName:'手术编码',width:'100'
        },{
            field:'operationName',displayName:'手术、操作名称',width:'200'
        },{
            field:'doctor',displayName:'手术医师',width:'100'
        },{
            field:'assistant1',displayName:'I助',width:'100'
        },{
            field:'assistant2',displayName:'II助',width:'100'
        },{
            field:'anaesthesia',displayName:'麻醉方法',width:'100'
        },{
            field:'woudGrade',displayName:'切口等级',width:'100'
        },{
            field:'heal',displayName:'愈合情况',width:'100'
        },{
            field:'anaesthesiaDoctor',displayName:'麻醉医师',width:'100'
        },{
            field:'scale',displayName:'手术级别',width:'100'
        }]
    }
}]);

