angular.module('app.registerServices', [])

.factory('User', function($resource) {
	return $resource('/api/v1/register/:id', {
		id : '@id'
	}, {
		update : {
			method : 'PUT'
		}
	});
});