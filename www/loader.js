/*global cordova, module*/

module.exports = {
    load: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Loader", "load", [name]);
    }
};
