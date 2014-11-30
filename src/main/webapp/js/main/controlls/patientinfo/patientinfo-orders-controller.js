/**
* Created by sf201 on 2014/11/29.
*/

var ordersControl = mainApp.controller("ordersControl", ["$scope", function ($scope) {
    //医嘱列表
    $scope.ordersList = [];
    $scope.selectedOrder=[] ;
    for(var i = 0 ;i<5;i++){
        var clsOrder = new order();
        clsOrder.rowNo ="0"+i;
        clsOrder.repeateTemp ="长期";
        clsOrder.orderClass = "药品";
        clsOrder.startOrderTime = "14-11-26 12:32";
        clsOrder.orderText = "氯化钠注射液";
        clsOrder.dosage = "20";
        clsOrder.dosageUnits = "ml";
        clsOrder.administration = "静脉滴注";
        clsOrder.frequency = "TID";
        clsOrder.performSchedule = "4-8-12";
        clsOrder.stopDateTime = "";
        clsOrder.freqDetail = "医生说明";
        clsOrder.billingAtrr = "不计价";
        clsOrder.drugBillingAttrBaiyao = "";
        clsOrder.startOrderDoctor = "王医生";
        clsOrder.stopOrderDoctor = "王医生";
        clsOrder.nurse = "李护士";
        clsOrder.durations = "1";
        clsOrder.durationUnit = "天";
        clsOrder.processingTime = "14-11-29 14:00";
        $scope.ordersList.push(clsOrder);
    }
    $scope.ordersGrid={
        data:'ordersList',
        selectedItems:$scope.selectedOrder,
        multiSelect: false,
        showFooter:false,
        beforeSelectionChange:function(item,ev){
            return true ;
        },
        afterSelectionChange:function(item,ev){
            if(item.selected){
                console.log(item.entity.rowNo) ;
            }
        },
        columnDefs:[{
            field:'rowNo',displayName:'行号',width:50
        },{
            field:'repeateTemp',displayName:'长临',width:50
        },{
            field:'orderClass',displayName:'医嘱类别',width:100
        },{
            field:'startOrderTime',displayName:'下达时间',width:100
        },{
            field:'orderText',displayName:'医嘱内容',width:100
        },{
            field:'dosage',displayName:'剂量',width:50
        },{
            field:'dosageUnits',displayName:'单位',width:50
        },{
            field:'administration',displayName:'途径',width:50
        },{
            field:'frequency',displayName:'频次',width:50
        },{
            field:'performSchedule',displayName:'执行时间',width:100
        },{
            field:'stopDateTime',displayName:'停止时间',width:100
        },{
            field:'freqDetail',displayName:'医生说明',width:100
        },{
            field:'billingAtrr',displayName:'计价属性',width:100
        },{
            field:'drugBillingAttrBaiyao',displayName:'摆药',width:50
        },{
            field:'startOrderDoctor',displayName:'下达医生',width:100
        },{
            field:'stopOrderDoctor',displayName:'停止医生',width:100
        },{
            field:'nurse',displayName:'护士',width:50
        },{
            field:'durations',displayName:'持续时间',width:100
        },{
            field:'durationUnit',displayName:'持续时间单位',width:100
        },{
            field:'processingTime',displayName:'转抄时间',width:100
        }]
    }
}]);

