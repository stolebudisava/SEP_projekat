(function() {
	var app = angular.module('app', ['ui.router', 'navController', 'ngAnimate', 'ui.bootstrap', 'ngResource', 'app.insuranceControllers', 'app.registerControllers', 'app.insuranceServices', 'app.registerServices'])

	// define for requirejs loaded modules
	define('app', [], function() { return app; });

	// function for dynamic load with requirejs of a javascript module for use with a view
	// in the state definition call add property `resolve: req('/views/ui.js')`
	// or `resolve: req(['/views/ui.js'])`
	// or `resolve: req('views/ui')`
	function req(deps) {
		if (typeof deps === 'string') deps = [deps];
		return {
			deps: function ($q, $rootScope) {
				var deferred = $q.defer();
				require(deps, function() {
					$rootScope.$apply(function () {
						deferred.resolve();
					});
					deferred.resolve();
				});
				return deferred.promise;
			}
		}
	}

	app.config(function($stateProvider, $urlRouterProvider, $controllerProvider){
		var origController = app.controller
		app.controller = function (name, constructor){
			$controllerProvider.register(name, constructor);
			return origController.apply(this, arguments);
		}

		var viewsPrefix = 'views/';
		var insurancePrefix = 'views/insurance_pages/';
		var registerPrefix = 'views/register_pages/';
		var loginPrefix = 'views/login_pages/';

		// For any unmatched url, send to /
		$urlRouterProvider.otherwise("/login");

		$stateProvider
			// you can set this to no template if you just want to use the html in the page
			.state('home', {
				url: "/",
				templateUrl: viewsPrefix + "home.html",
				data: {
					pageTitle: 'Home'
				}
			}).state('insurances',{
	        url:'/insurances',
	        templateUrl: insurancePrefix + 'insurances.html',
	        controller:'InsuranceListController',
	        authenticate: true
	    }).state('viewInsurance',{
	       url:'/insurances/:id/view',
	       templateUrl: insurancePrefix + 'insurance-view.html',
	       controller:'InsuranceViewController',
	       authenticate: true
	    }).state('newInsurance',{
	        url:'/insurances/new',
	        templateUrl: insurancePrefix + 'insurance-add.html',
	        controller:'InsuranceCreateController',
	        authenticate: true
	    }).state('editInsurance',{
	        url:'/insurances/:id/edit',
	        templateUrl: insurancePrefix + 'insurance-edit.html',
	        controller:'InsuranceEditController',
	        authenticate: true
	    }).state('register',{
	        url:'/register',
	        templateUrl: registerPrefix + 'register.html',
	        controller:'RegisterCreateController',
	        authenticate: true
	    }).state('login',{
	        url:'/login',
	        templateUrl: loginPrefix + 'login.html',
	        controller:'loginController',
	        authenticate: false
	    })
	})
	.directive('updateTitle', ['$rootScope', '$timeout',
		function($rootScope, $timeout) {
			return {
				link: function(scope, element) {
					var listener = function(event, toState) {
						var title = 'Project Name';
						if (toState.data && toState.data.pageTitle) title = toState.data.pageTitle + ' - ' + title;
						$timeout(function() {
							element.text(title);
						}, 0, false);
					};

					$rootScope.$on('$stateChangeSuccess', listener);
				}
			};
		}
	]);
}());
