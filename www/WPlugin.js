var exec = require('cordova/exec');

exports.coolMethod = function(arg0, success, error) {
    exec(success, error, "WPlugin", "coolMethod", [arg0]);
};
exports.helloMethod = function(arg0, success, error) {
    exec(success, error, "WPlugin", "helloMethod", [arg0]);
};
