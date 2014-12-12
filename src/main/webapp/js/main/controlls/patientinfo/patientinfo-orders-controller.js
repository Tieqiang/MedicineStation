/**
* Created by sf201 on 2014/11/29.
*/

var ordersControl = mainApp.controller("ordersControl", ["$scope","$http", function ($scope,$http) {
    //医嘱列表

    $scope.ordersList = [];
    $scope.selectedOrder=[] ;

    $scope.$on("clickPat",function(d,data){
        $http.get(Path.getUri("api/comm/3")+"?param="+data.patientId+"|"+data.visitId).success(function(data){
            $scope.ordersList=[] ;
            $.each(data,function(index,item){
                $scope.ordersList.push(item);
            })
        }).error(function(data){
            alert("获取医嘱列表失败") ;
        })
    }) ;

    $scope.click=function(row,item){
        console.log(row) ;
        console.log(item) ;
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
            field:'id',displayName:'行号',width:50
        },{
            field:'repeatIndicator',displayName:'长临',width:50,cellTemplate:"<span>{{row.entity[col.field]|indecatorFilter}}</span>"
        },{
            field:'className',displayName:'医嘱类别',width:100
        },{
            field:'startDateTime',displayName:'下达时间',width:100,cellTemplate:"<span>{{row.entity[col.field]|date:\'yyyy-MM-dd HH:mm:ss\'}}</span>"
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
            field:'stopDateTime',displayName:'停止时间',width:100,cellTemplate:'<span>{{row.entity[col.field]|date:\'yyyy-MM-dd HH:mm:ss\'}}</span>'
        },{
            field:'freqDetail',displayName:'医生说明',width:100
        },{
            field:'billingAttr',displayName:'计价属性',width:100
        },{
            field:'drugBillingAttr',displayName:'摆药',width:50
        },{
            field:'doctor',displayName:'下达医生',width:100
        },{
            field:'stopDoctor',displayName:'停止医生',width:100
        },{
            field:'nurse',displayName:'护士',width:50
        },{
            field:'duration',displayName:'持续时间',width:100
        },{
            field:'durationUnits',displayName:'持续时间单位',width:100,cellTemplate:"<span>{{row.entity[col.field]|date:\'yyyy-MM-dd HH:mm:ss\'}}</span>"
        },{
            field:'processingDateTime',displayName:'转抄时间',width:100,cellTemplate:"<span>{{row.entity[col.field]|date:\'yyyy-MM-dd HH:mm:ss\'}}</span>"
        }]
    }
}]);

