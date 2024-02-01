google.charts.load("current", {
  "packages":["map"],
  // See: https://developers.google.com/chart/interactive/docs/basic_load_libs#load-settings
  "mapsApiKey": "AIzaSyBQqwuzhQuzdJdebddC5hqQEf-c3HvEA-0"
});
google.charts.setOnLoadCallback(drawChart);
function drawChart() {
  var data = google.visualization.arrayToDataTable([
    ['Lat', 'Long', 'Name'],
    [42.42760713402658, 19.262397293050107, 'Podgorica'],
    [42.775711621116066, 18.96120869650851, 'Niksic'],
    [42.08996603783748, 19.091205335454315, 'Bar'],
  ]);

  var map = new google.visualization.Map(document.getElementById('map_div'));
  map.draw(data, {
    showTooltip: true,
    showInfoWindow: true
  });
}