function cross(_r){
}
function bar(_r){
return 5;
}
function foo(_r){
var bar1 = _r(bar);

console.log(bar1);
}
var _req = function(_request){

return _request(_req);
}


foo(_req);
