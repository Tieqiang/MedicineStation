/**
 * Created by heren on 2014/10/26.
 */

var staffApp = angular.module("staffApp",["ui.bootstrap", "ngCookies", "wiki.common"]);

var staffCtrl = staffApp.controller("staffCtrl",["$scope", "$timeout", "$http", "Path", "$q", "$location", "$cookies", function ($scope, $timeout, $http, Path, $q, $location, $cookies){

    $scope.staffS = [] ;

    $http.get(Path.getUri("api/staff/010401")).success(function(data){
        console.log(data) ;
        for(var i=0 ;i<data.length;i++){
            $scope.staffS.push(data[i]) ;
        }
    });

    $scope.name="";
    $scope.emp="";
    $scope.save=function(){
        $http.post(Path.getUri("api/staff/add/"),{name:$scope.name,emp:$scope.emp}).success(function(data){
            console.log(data);
        })
    }

}]);

