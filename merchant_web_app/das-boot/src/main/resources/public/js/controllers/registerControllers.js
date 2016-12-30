angular.module('app.registerControllers', []).controller(
		'RegisterCreateController', function($scope, $state, $window, User) {

			$scope.user = User.query();
			$scope.addNewUser = function() { // create a new User. Issues a
												// POST to /api/v1/register
				$scope.users = new User();

				$scope.users.$save(function() {
					$state.go('insurances');
				});// on success go back to the list i.e. insurance state.

			}
		});