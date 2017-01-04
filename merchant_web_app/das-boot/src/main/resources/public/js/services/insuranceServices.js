angular.module('app.insuranceServices', [])
.factory('Insurance', function($resource) {
	return $resource('/api/v1/insurances/:id', {
		id : '@id'
	}, {
		update : {
			method : 'PUT'
		}
	});
}).service('popupService', function($window) {
	this.showPopup = function(message) {
		return $window.confirm(message);
	}
});
