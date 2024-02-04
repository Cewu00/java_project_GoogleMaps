(g=>{var h,a,k,p="The Google Maps JavaScript API",c="google",l="importLibrary",q="__ib__",m=document,b=window;b=b[c]||(b[c]={});var d=b.maps||(b.maps={}),r=new Set,e=new URLSearchParams,u=()=>h||(h=new Promise(async(f,n)=>{await (a=m.createElement("script"));e.set("libraries",[...r]+"");for(k in g)e.set(k.replace(/[A-Z]/g,t=>"_"+t[0].toLowerCase()),g[k]);e.set("callback",c+".maps."+q);a.src=`https://maps.${c}apis.com/maps/api/js?`+e;d[q]=f;a.onerror=()=>h=n(Error(p+" could not load."));a.nonce=m.querySelector("script[nonce]")?.nonce||"";m.head.append(a)}));d[l]?console.warn(p+" only loads once. Ignoring:",g):d[l]=(f,...n)=>r.add(f)&&u().then(()=>d[l](f,...n))})({
key: "AIzaSyBQqwuzhQuzdJdebddC5hqQEf-c3HvEA-0",
v: "weekly",
// Use the 'v' parameter to indicate the version to use (weekly, beta, alpha, etc.).
// Add other bootstrap parameters as needed, using camel case.
});




var map;

async function initMap(locations) {
  const { Map } = await google.maps.importLibrary("maps");

  map = new Map(document.getElementById("map_div"), {
    center: { lat: 42.873369419327325, lng: 19.27525603248938 },
    zoom: 8,
  });

  var infoWindow = new google.maps.InfoWindow();

  var marker, i;

  for (i = 0; i < locations.length; i++) {
    marker = new google.maps.Marker({
      position: new google.maps.LatLng(locations[i][0], locations[i][1]),
      map: map
    });

    google.maps.event.addListener(marker, 'click', (function(marker, i) {
      return function() {
        infoWindow.setContent(locations[i][2]);
        infoWindow.open(map, marker);
      }
    })(marker, i));
  }
}


var locations = [
    [42.42760713402658, 19.262397293050107, 'Podgorica'],
    [42.775711621116066, 18.96120869650851, 'Niksic'],
    [42.08996603783748, 19.091205335454315, 'Bar'],
    ];

initMap(locations);