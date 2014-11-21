/**
 * Created by heren on 2014/11/21.
 */

var patListCtrl = mainApp.controller("patListCtrl",["$scope",function($scope){

    var pat=function(){
        name:""
    }
    $scope.pats = [] ;
    for(var i =0 ;i<10;i++){
        var p = new pat();
        p.name="张珊"+i ;
        $scope.pats.push(p);
    }

    $scope.patListGridOptions={
        data:'pats',
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
        }
        ,
        columnDefs:[{
            field:'name',displayName:'姓名'
        }]

    }

}])