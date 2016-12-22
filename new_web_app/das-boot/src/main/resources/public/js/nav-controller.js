angular.module('navController', [])
	.controller('nav', function($scope, $state) {
		$scope.title = 'Insurances company';

		// returns true if the current router url matches the passed in url
		// so views can set 'active' on links easily
		$scope.isUrl = function(url) {
			if (url === '#') return false;
			return ('#' + $state.$current.url.source + '/').indexOf(url + '/') === 0;
		};

		$scope.pages = [
			{
				name: 'Home',
				url: '#/'
			},
			
			{
				name: 'Insurances',
				url: '#/insurances'
			},
			
			{
				name: 'Register',
				url: '#/register'
			}
		]
	});
