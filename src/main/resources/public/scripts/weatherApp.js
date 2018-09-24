
angular.module('weatherForecastingApp', [])
    .controller('cityLoaderController', ['$scope', '$http', function($scope, $http) {
        $http.get("/locations").success(function(response) {
            $scope.data = {
                citySelect: null,
                availableOptions: response.map(location => location.name)
            };
        });
        
    $scope.getWeather = function() {
        $http.get("/weather/" + $scope.data.citySelect)
        .success(function(response) {
                $scope.weatherData = response;
        });
    }
}]);


