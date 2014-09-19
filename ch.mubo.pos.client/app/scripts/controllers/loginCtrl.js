'use strict';

posbom.controller('LoginCtrl', function($scope,loginService){
	$scope.msgtxt='';
	$scope.login = function(user){
		loginService.login(user,$scope); //call login service
	}
});