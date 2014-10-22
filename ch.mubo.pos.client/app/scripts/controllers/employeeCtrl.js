'use strict';

posbom.controller('employeeCtrl', function($scope, employeeService){
	$scope.msgtxt='';
	$scope.login = function(user){
		console.log('bin drin');
		loginService.login(user,$scope); //call login service
	}
});