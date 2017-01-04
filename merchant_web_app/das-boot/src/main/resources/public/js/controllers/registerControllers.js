angular.module('app.registerControllers', [])

.controller('RegisterCreateController', function($scope, $state, $stateParams, User) {
	$scope.user = new User();
			
		$scope.addNewUser = function() { // create a new User. Issues a POST to /api/v1/register
			$scope.user.$save(function() {
				$state.go('insurances');
			});// on success go back to the list i.e. insurance state.

		}
});