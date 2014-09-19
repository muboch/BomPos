'use strict';

posbom.factory('loginService', function($http){
	return{
		login:function(user,scope){
			if (user.username ='test') scope.msgtxt='crect information'
			else scope.msgtxt='incorrect inforamtion'; 
			
		}
		
	}
});