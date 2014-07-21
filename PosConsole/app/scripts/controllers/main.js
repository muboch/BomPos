'use strict';

/**
 * @ngdoc function
 * @name posConsoleApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the posConsoleApp
 */
angular.module('posConsoleApp')
  .controller('MainCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
