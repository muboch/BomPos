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
        controller: 'MainCtrl'
      })
      .when('/login', {
        templateUrl: 'views/login.html',
        controller: 'LoginCtrl'
      })
      .when('/pos', {
        templateUrl: 'views/pos.html',
        controller: 'AboutCtrl'
      })
      .otherwise({
        redirectTo: '/login.html'
      });
  });
