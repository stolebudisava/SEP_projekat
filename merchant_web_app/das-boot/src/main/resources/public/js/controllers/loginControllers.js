angular.module('app.loginControllers', [])

.controller('loginController', function ($scope, $stateParams, User) {
	$scope.insurance = User.get({
			id : $stateParams.id
		}); //Get a single Insurance.Issues a GET to /api/v1/insurances/:id

});