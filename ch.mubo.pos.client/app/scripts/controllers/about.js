'use strict';

/**
 * @ngdoc function
 * @name posConsoleApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the posConsoleApp
 */
angular.module('posConsoleApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
