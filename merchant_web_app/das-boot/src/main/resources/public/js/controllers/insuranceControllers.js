angular.module('app.insuranceControllers', [])

.controller('InsuranceListController', function ($scope, $state, popupService, $window, Insurance) {
	$scope.insurances = Insurance.query(); //fetch all insurances. Issues a GET to /api/vi/insurances

	$scope.deleteInsurance = function (insurance) { // Delete a insurance. Issues a DELETE to /api/v1/insurances/:id
		if (popupService.showPopup('Really delete this?')) {
			insurance.$delete(function () {
				$scope.insurances = Insurance.query();
				$state.go('insurances');
			});
		}
	};
})

.controller('InsuranceViewController', function ($scope, $stateParams, Insurance) {
	$scope.insurance = Insurance.get({
			id : $stateParams.id
		}); //Get a single Insurance.Issues a GET to /api/v1/insurances/:id
})

.controller('InsuranceCreateController', function ($scope, $state, $stateParams, Insurance) {
	$scope.insurance = new Insurance(); //create new Insurance instance. Properties will be set via ng-model on UI

	$scope.addInsurance = function () { //create a new Insurance. Issues a POST to /api/v1/Insurances
		$scope.insurance.$save(function () {
			$state.go('insurances'); // on success go back to the list i.e. Insurances state.
		});
	};
})

.controller('InsuranceEditController', function ($scope, $state, $stateParams, Insurance) {
	$scope.updateInsurance = function () { //Update the edited Insurance. Issues a PUT to /api/v1/Insurances/:id
		$scope.insurance.$update(function () {
			$state.go('insurances'); // on success go back to the list i.e. Insurances state.
		});
	};

	$scope.loadInsurance = function () { //Issues a GET request to /api/v1/Insurances/:id to get a Insurance to update
		$scope.insurance = Insurance.get({
				id : $stateParams.id
			});
	};

	$scope.loadInsurance(); // Load a Insurance which can be edited on UI
});
