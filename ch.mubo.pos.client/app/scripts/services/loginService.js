'use strict';

posbom.factory('loginService', function($http){
	return{
		login:function(user,scope){
			console.log('now in login service');
			if (user.username ='test') scope.msgtxt='correct information';
			else scope.msgtxt='incorrect inforamtion'; 
			
		}
		
	}
});