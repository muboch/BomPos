'use strict';

/**
 * @ngdoc overview
 * @name posConsoleApp
 * @description
 * # posConsoleApp
 *
 * Main module of the application.
 */

var posbom  = angular
  .module('posConsoleApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ]);

posbom.config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/login.html',
        controller: 'loginCtrl'
      })
      .when('/pos', {
        templateUrl: 'views/pos.html',
        controller: 'posCtrl'
      })
      .when('/employee', {
        templateUrl: 'views/employee.html',
        controller: 'employeeCtrl'
      })
      .otherwise({
        redirectTo: 'views/login.html'
      });
  });

/* posbom.factory */