/**
 * Created by heren on 2014/11/21.
 */
var patInfoCtrl = mainApp.controller("patInfoCtrl",["$scope",function($scope){
    $('#myTab a').click(function (e) {
        e.preventDefault();//阻止a链接的跳转行为
        $(this).tab('show');//显示当前选中的链接及关联的content
        alert("cick");
    })

    $scope.pat={} ;
    $scope.$on('clickPat',function(d,data){
        $scope.pat=data ;
    })
}])