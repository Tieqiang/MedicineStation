var minCtrl = mainApp.controller("minCtrl",["$scope","$http",function($scope,$http){
    $scope.$on("patClickEmt",function(d,data){
        $scope.$broadcast("clickPat",data) ;
    })
}])