/**
 * Created by heren on 2014/10/13.
 */

var deptModul = angular.module("deptModul", ["ui.bootstrap", "ngCookies", "wiki.common"]);
deptModul.controller("deptController", ["$scope", "$timeout", "$http", "Path", "$q", "$location", "$cookies", function ($scope, $timeout, $http, Path, $q, $location, $cookies) {

    $scope.deptList=[] ;
    $http.get(Path.getUri("api/dept")).success(function(data){
        //$scope.deptList=data ;

        console.log(data) ;
        if(data !=null){
            for(var i=0 ;i<data.length;i++){
                $scope.deptList.push(data[i]);
            }
        }
    });
}]);
