'use strict';

posbom.controller('loginCtrl', function($scope,loginService){
	$scope.msgtxt='';
	$scope.login = function(user){
		console.log('bin drin');
		loginService.login(user,$scope); //call login service
	}
});