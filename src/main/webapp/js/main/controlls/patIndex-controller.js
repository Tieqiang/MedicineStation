/**
 * Created by sf201 on 2014/11/25.
 */

var patIndexCtrl = mainApp.controller("patIndexCtrl", ["$scope", function ($scope) {

    //病人查询列表
    $scope.lstPatFound = [];
    $scope.selectedPat = [];
    //病人历次就诊信息列表
    $scope.lstPatVisit = [];
    $scope.selectedPatVisit = [];
    for (var i = 0; i < 5; i++) {
        var clsPatFound = new patFound();
        clsPatFound.patId = "10000" + i;
        clsPatFound.patName = "张三";
        clsPatFound.sex = "男";
        clsPatFound.birthDate = "1988-03-05";
        clsPatFound.identity = "一般人员";
        clsPatFound.phoneNo = "8788888";
        clsPatFound.addr = "湖南省长沙市";
        $scope.lstPatFound.push(clsPatFound);
    }
    for (var i = 0; i < 5; i++) {
        var clsPatVisit = new patsVisitList();
        clsPatVisit.visitDate = "2014-07-12";
        clsPatVisit.visitType = "住院";
        clsPatVisit.visitDept = "26病区骨科";
        clsPatVisit.diagnosis = "骨折";
        clsPatVisit.doctorInCharge = "苗医生";
        $scope.lstPatVisit.push(clsPatVisit);
    }


    $scope.patsFoundGrid = {
        data: 'lstPatFound',
        selectedItems: $scope.selectedPat,
        multiSelect: false,
        showFooter: false,
        beforeSelectionChange: function (item, ev) {
            return true;
        },
        afterSelectionChange: function (item, ev) {
            if (item.selected) {
                console.log(item.entity.patId);
            }
        },
        columnDefs: [
            {
                field: 'patId', displayName: '病人ID'
            },
            {
                field: 'patName', displayName: '病人姓名'
            },
            {
                field: 'sex', displayName: '性别'
            },
            {
                field: 'birthDate', displayName: '出生日期'
            },
            {
                field: 'identity', displayName: '身份'
            },
            {
                field: 'phoneNo', displayName: '联系电话'
            },
            {
                field: 'addr', displayName: '联系地址'
            }
        ]
    }

    $scope.patsVisitListGrid = {
        data: 'lstPatVisit',
        selectedItems: $scope.selectedPatVisit,
        multiSelect: false,
        showFooter: false,
        beforeSelectionChange: function (item, ev) {
            return true;
        },
        afterSelectionChange: function (item, ev) {
            if (item.selected) {
                console.log(item.entity.visitDept);
            }
        },
        columnDefs: [
            {
                field: 'visitDate', displayName: '就诊日期'
            },
            {
                field: 'visitType', displayName: '就诊类别'
            },
            {
                field: 'visitDept', displayName: '就诊科室'
            },
            {
                field: 'diagnosis', displayName: '诊断'
            },
            {
                field: 'doctorInCharge', displayName: '经治医生'
            }
        ]
    }
    $scope.config2 = [
        {id: 6, text: '来自ng-repeat'},
        {id: 7, text: '来自ng-repeat'},
        {id: 8, text: '来自ng-repeat'}
    ];

}]);

