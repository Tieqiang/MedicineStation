/**
 * Created by heren on 2014/11/15.
 */

var mainApp = angular.module("mainApp",["ui.router"]) ;

mainApp.config(["$stateProvider","$urlRouterProvider",function($stateProvider,$urlRouterProvider){

    $stateProvider.state("main",{

        abstract:true,
        views: {
            'nav': {
                templateUrl: '/partials/nav/nav.html'
            }
        }
    }).state("main.welcome",{
        url:"/main",
        views:{
            'main@': {
                templateUrl: '/partials/welcome/welcome.html'
            }
        }
    }).state("main.pat",{
        views:{
            'main@':{
                templateUrl:'/partials/patient/pat-main.html'
            },
            'patlist@main.pat':{
                templateUrl:'/partials/patient/pat-list.html'
            },
            'patinfo@main.pat':{
                templateUrl:'/partials/patient/pat-info.html'
            },
            'top@main.pat':{
                templateUrl:'/partials/patient/pat-info-top.html'
            },
            'main@main.pat':{
                templateUrl:'/partials/patient/pat-info-main.html'
            }
        }
    }) ;
    $urlRouterProvider.otherwise("/main");
}]) ;