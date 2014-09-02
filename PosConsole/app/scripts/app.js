'use strict';

/**
 * @ngdoc overview
 * @name posConsoleApp
 * @description
 * # posConsoleApp
 *
 * Main module of the application.
 */
angular
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
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .when('/pos', {
        templateUrl: 'views/pos.html',
        controller: 'AboutCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
