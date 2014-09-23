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
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/login.html',
        controller: 'loginCtrl'
      })
      .when('/login', {
        templateUrl: 'views/login.html',
        controller: 'loginCtrl'
      })
      .when('/pos', {
        templateUrl: 'views/pos.html',
        controller: 'posCtrl'
      })
      .otherwise({
        redirectTo: 'views/login.html'
      });
  });
