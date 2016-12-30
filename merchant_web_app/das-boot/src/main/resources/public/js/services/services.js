angular.module('app.services', [])
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
}).factory('User', function($resource) {
	return $resource('/api/v1/register/:id', {
		id : '@id'
	}, {
		update : {
			method : 'PUT'
		}
	});
});
