var app = angular.module('weatherForecastingApp', []);

app.constant('config', {
    protocol: 'http',
    host: 'localhost',
    port: 8080
});

app.controller('weatherForecastController', ['$scope', '$http', 'config', function($scope, $http, config) {
    $http.get(config.protocol+"://"+config.host+":"+config.port+"/locations").success(function(response) {
        $scope.data = {
            citySelect: null,
            availableOptions: response.map(location => location.name)
        };
    });
    
	$scope.getWeather = function() {
	    $http.get(config.protocol+"://"+config.host+":"+config.port+"/weather/" + $scope.data.citySelect).success(function(response) {
	            $scope.weatherData = response;
	    });
	}
}]);


