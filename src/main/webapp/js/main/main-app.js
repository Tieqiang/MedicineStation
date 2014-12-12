/**
 * Created by heren on 2014/11/15.
 */

var mainApp = angular.module("mainApp",["ui.router","ngGrid","ui.select2"]) ;

mainApp.config(["$stateProvider","$urlRouterProvider",function($stateProvider,$urlRouterProvider){
    $stateProvider.state("main",{

        abstract:true,
        views: {
            'nav': {
                templateUrl: 'partials/nav/nav.html'
            }
        }
    }).state("main.welcome",{
        url:"/main",
        views:{
            'main@': {
                templateUrl: 'partials/welcome/welcome.html'
            }
        }
    }).state("main.pat",{
        url:'/pat',
        views:{
            'main@':{
                templateUrl:'partials/patient/pat-main.html'
            },
            'patlist@main.pat':{
                templateUrl:'partials/patient/pat-list.html'
            },
            'patinfo@main.pat':{
                templateUrl:'partials/patient/pat-info.html'
            },
            'top@main.pat':{
                templateUrl:'partials/patient/pat-info-top.html'
            },
            'main@main.pat':{
                templateUrl:'partials/patient/pat-info-main.html'
            }
        }
    }).state("main.consult",{
        url:'/consult',
        views:{
            'main@':{
                templateUrl:"partials/phar-consult/consult-main.html"
            },
            'consult-left@main.consult':{
                templateUrl:'partials/phar-consult/consolut-left.html'
            },
            'consult-right@main.consult':{
                templateUrl:'partials/phar-consult/consult-right.html'
            }
        }
    }).state("main.patIndex",{
        url:'/patindex',
        views:{
            'main@':{
                templateUrl:"partials/pat-index/pat-index.html"
            }
        }
    }) ;
    $urlRouterProvider.otherwise("/pat");
}]) ;

mainApp.filter("indecatorFilter",function(){
    return function(item){
        if(item=="0"){
            return "临时";
        }else if(item==1){
            return "长期";
        }else{
            return "未定义" ;
        }
    }
})
