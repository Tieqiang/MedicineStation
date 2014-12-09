function closeAlert() {
    var divTemplate = document.getElementById("debuginfo");
    var divLock = document.getElementById("lock");
    document.body.removeChild(divTemplate);
    document.body.removeChild(divLock);
}

(function () {
    var _createNode = function (elmName, elmId, className, innerHtml, innerText, parentNode) {
        var nodeElem = document.createElement(elmName);
        if (typeof elmId !== "undefined") {
            nodeElem.id = elmId;
        }
        if (typeof className !== "undefined") {
            nodeElem.className = className;
        }
        if (typeof innerHtml !== "undefined") {
            nodeElem.innerHTML = innerHtml;
        }
        if (typeof innerText !== "undefined") {
            nodeElem.innerText = innerText;
        }
        if (parentNode === document) {
            document.body.appendChild(nodeElem);
            return nodeElem;
        }
        parentNode.appendChild(nodeElem);
        return nodeElem;
    };
    var message = "";
    window.onerror = function (msg, url, line) {
        var errorInfo;
        if (msg.indexOf("ReferenceError") > -1) {
            errorInfo = "访问不存在的变量或者对象";
        } else if (msg.indexOf("TypeError") > -1) {
            errorInfo = "类型转换发生错误";
        } else if (msg.indexOf("RangeError") > -1) {
            errorInfo = "边界超出了范围";
        } else if (msg.indexOf("Error") > -1) {
            errorInfo = "系统发生错误";
        }
        else {
            errorInfo = "无法预知的错误，请联系管理员!";
        }
        var splits = msg.split("Uncaught Error:");
        if (splits instanceof  Array) {
            msg = splits[1];
        }
        var divTemplate = document.getElementById("debuginfo");
        var divLock = document.getElementById("lock");
        if (divLock == null) {
            var divLock = _createNode("div", "lock", "alert-level", undefined, undefined, document);
        }
        if (divTemplate == null) {
            var divTemplate = _createNode("div", "debuginfo", "alert-message js-error-message", undefined, undefined, document);
            var tempStr = "" + errorInfo + "<button class=\"close\" onclick='closeAlert()'>×</button>";
            var titelElm = _createNode("h5", undefined, undefined, tempStr, undefined, divTemplate);
            var contentElm = _createNode("div", undefined, "error-content-div", undefined, undefined, divTemplate);
            var dlElm = _createNode("dl", undefined, undefined, undefined, undefined, contentElm);
            var dtElm = _createNode("dt", undefined, undefined, undefined, "错误信息:", dlElm);
            var ddElm = _createNode("dd", undefined, undefined, undefined, "" + msg + "", dlElm);
            var dtElm1 = _createNode("dt", undefined, undefined, undefined, "错误文件:", dlElm);
            var ddElm1 = _createNode("dd", undefined, undefined, undefined, "" + url + "", dlElm);
            var dtElm2 = _createNode("dt", undefined, undefined, undefined, "错误行号:", dlElm);
            var ddElm2 = _createNode("dd", undefined, undefined, undefined, "" + line + "", dlElm);
            var footerHtml = "<button class=\"btn btn-primary\" onclick='closeAlert()'>关闭</button>";
            var footerElm = _createNode("div", undefined, "message-bottom", footerHtml, undefined, divTemplate);
        }
        return false;
    };
})();

/**
 * URl工具类
 */
var Path = function () {
    var reg = /^\//;
    return {
        getUri: function (url) {
            if (reg.test(url)) {
                return url;
            } else {
                var pathName = window.document.location.pathname;
                return pathName.substring(0, pathName.substr(1).indexOf('/') + 1) + "/" + url;
            }
        },
        getWebstartUri: function (url) {
            return "http://localhost:8089/" + url;
        },
        getOrigin: function () {
            return window.document.location.origin;
        },
        getFuncSrc: function () {
            var pathName = window.document.location.pathname;
            return  pathName.substring(pathName.substr(1).indexOf('/') + 2, pathName.length);
        },
        refresh: function () {
            window.document.location.reload();
        }
    };
}();

/**
 * 组装查询Uri时使用的工具类，组装时会忽略掉没有值的字段；
 * 对于其他特殊过滤条件的情况，需要提供接口函数，有待增强。
 * 使用方式：
 * var url = QueryUriBuilder.queryParam($scope.patientId, "patientId")
 *  .queryParam(null, "name")
 *  .queryParam($scope.pinyin, "pinyin")
 *  .build();
 *  返回组装好的字符串，结构为——?patientId=value&pinyin=value
 * @type {QueryUriParamBuilder}
 */
var QueryUriParamBuilder = (function () {
    var _urlStr = "";
    var _count = 0;
    var _acceptFilter = function (value2Check) {
        return value2Check !== undefined && value2Check !== null && value2Check !== "";
    };
    var _clearAndReturnGeneratedUrl = function () {
        var _generatedUrl = _urlStr;
        _urlStr = "";
        _count = 0;
        return _generatedUrl;
    };
    return {
        queryParam: function (value2Check, field2Check) {
            if (_acceptFilter(value2Check)) {
                if (_count === 0) {
                    _urlStr += "?" + field2Check + "=" + value2Check;
                } else {
                    _urlStr += "&" + field2Check + "=" + value2Check;
                }
                _count++;
            }
            return this;
        },
        build: function () {
            return _clearAndReturnGeneratedUrl();
        }
    };
})();

/**
 * 数学工具类
 */
var HrMath = function () {
    return {
        //修复四则运算浮点数精度问题
        fixArithmetic: function (m, n, op) {
            var a = (m + "");
            var b = (n + "");
            var x = 1;
            var y = 1;
            var c = 1;
            if (a.indexOf(".") > 0) {
                x = Math.pow(10, a.length - a.indexOf(".") - 1);
            }
            if (b.indexOf(".") > 0) {
                y = Math.pow(10, b.length - b.indexOf(".") - 1);
            }
            switch (op) {
                case '+':
                case '-':
                    c = Math.max(x, y);
                    m = Math.round(m * c);
                    n = Math.round(n * c);
                    break;
                case '*':
                    c = x * y;
                    m = Math.round(m * x);
                    n = Math.round(n * y);
                    break;
                case '/':
                    c = Math.max(x, y);
                    m = Math.round(m * c);
                    n = Math.round(n * c);
                    c = 1;
                    break;
            }
            return eval("(" + m + op + n + ")/" + c);
        }
    };
}();

/**
 * 时间工具类
 */
var HrDate = function () {
    return {
        Y_MM_DD: "y-mm-dd",
        YY_MM_DD: "yy-mm-dd",
        HH_MM_SS: "HH:mm:ss",
        YY_MM_DD_HH_MM_SS: "yy-mm-dd HH:mm:ss",

        formatDate: function (date, format) {
            if (null !== date && undefined !== date) {
                return $.datepicker.formatDate(format, date);
            }
            return null;
        },
        formatTime: function (time, format) {
            if (null !== time && undefined !== time) {
                return $.datepicker.formatTime(format, {
                    hour: time.getHours(),
                    minute: time.getMinutes(),
                    second: time.getSeconds(),
                    millisec: time.getMilliseconds(),
                    timezone: time.getTimezoneOffset()
                });
            }
            return null;
        },
        formatDateTime: function (dateTime, dateFormat, timeFormat) {
            if (null !== dateTime && undefined !== dateTime) {
                return this.formatDate(dateTime, dateFormat) + " " + this.formatTime(dateTime, timeFormat);
            }
            return null;
        },
        getAgeFromBirthday: function (birth) {
            if (birth) {
                var newDate = new Date();
                var currentYear = newDate.getFullYear();
                var currentMonth = newDate.getMonth() + 1;
                var currentDay = newDate.getDate();

                var birthYear = birth.split("-")[0];
                var birthMonth = birth.split("-")[1];
                var birthDay = birth.split("-")[2];

                var myYear = currentYear - parseInt(birthYear);
                var myMonth = currentMonth - parseInt(birthMonth);
                var myDay = currentDay - parseInt(birthDay);

                var s = "";
                if (myDay < 0) {
                    myDay = myDay + 30;
                    myMonth--;
                }
                if (myMonth < 0) {
                    myMonth = myMonth + 12;
                    myYear--;
                }
                if ((myYear <= 0)) {
                    if (myMonth == 0) {
                        s = s + myDay + "天";
                    }
                    else {
                        s = s + myMonth + "月" + myDay + "天";
                    }
                }
                else {
                    s = myYear + "岁";
                    if (myYear < 6) {
                        s = s + myMonth + "月";
                    }
                }
                if (s == "0天") {
                    s = "1天";
                }
                return s;
            }
        },
        compare: function (date1, date2) {
            var year1 = date1.getFullYear();
            var month1 = date1.getMonth() + 1;
            var day1 = date1.getDate();
            var year2 = date2.getFullYear();
            var month2 = date2.getMonth() + 1;
            var day2 = date2.getDate();
            if (year1 > year2 && month1 > month2 && day1 > day2) {
                return 1;
            } else if (year1 < year2 && month1 < month2 && day1 < day2) {
                return -1;
            } else if (year1 == year2 && month1 == month2 && day1 == day2) {
                return 0;
            }
        },
        plusOrMinus: function (date, interval, num) {
            var year = date.getFullYear();
            var month = date.getMonth() + 1;
            var day = date.getDate();
            var hour = date.getHours();
            var minute = date.getMinutes();
            var second = date.getSeconds();
            switch (interval) {
                case "YEAR":  year += num; break;
                case "MONTH":  month += num; break;
                case "DATE":  day += num; break;
                case "HOUR":  hour += num; break;
                case "MINUTE":  minute += num; break;
                case "SECOND":  second += num; break;
                default : ;
            }
            var dateStr = year+"/"+month+"/"+day+" "+hour+":"+minute+":"+second;
            var resultDate = new Date(dateStr);
            return resultDate;
        },
        dateType: {
            "YEAR": "YEAR",
            "MONTH": "MONTH",
            "DATE": "DATE",
            "HOUR": "HOUR",
            "MINUTE": "MINUTE",
            "SECOND": "SECOND"
        }
    };
}();

/**
 * 字符串工具类
 */
var HrStr = function () {
    return {
        isNull: function isNull(value) {
            if (value === undefined || value === null || value === "") {
                return true;
            }
            if (value !== undefined || value !== null || value !== "") {
                return false;
            }
        }
    };
}();

/**
 * 快捷键通用配置，现在以编码形式写死，后续看是否有必要迁移到参数配置中
 */
var HrKeys = function () {
    var arrays = [
        {code: "save", value: "S"},
        {code: "fresh", value: "F"},
        {code: "close", value: "C"},
        {code: "query", value: "Q"},
        {code: "order", value: "O"},
        {code: "delete", value: "D"},
        {code: "new", value: "N"},
        {code: "refresh", value: "R"}
    ];
    return {
        getKeyboardByCode: function (code) {
            var value;
            arrays.forEach(function (obj) {
                if (typeof code === "string") {
                    if (obj instanceof Object) {
                        if (obj.code === code) {
                            value = obj.value;
                            return value;
                        }
                    }
                }
            });
            return value;
        }
    };
}();

/**
 * 无分类工具类集合
 */
var HrUtils = function () {
    var selfErrorCallback = function (data, status, errorCallback, hrDialog) {
        if (typeof errorCallback === "function") {
            errorCallback(data, status);
        } else {
            HrUtils.httpError(data, status, hrDialog);
        }
    };
    return {
        httpMethod: {
            GET: "get",
            POST: "post",
            PUT: "put",
            DELETE: "delete"
        },
        httpError: function (data, status, hrDialog) {
            if (status === 412) {
                var messages = "";
                var length = data.errorList.length;
                for (var i = 0; i < length; i++) {
                    messages = messages +
                        data.errorList[i].field + ":" + data.errorList[i].message + ";";
                }
                hrDialog.dialog(hrDialog.typeEnum.EXCEPTION,
                    {message: "[" + data.message + "]" + messages, detail: "[" + data.message + "]" + messages});
            } else if (status === 503 || status === 404) {
                hrDialog.dialog(hrDialog.typeEnum.WARN,
                    {message: data.message, detail: data.message});
            } else {
                hrDialog.dialog(hrDialog.typeEnum.EXCEPTION,
                    {message: "服务器异常，请查看详细信息", detail: data.message});
            }
        },
        httpRequest: function ($http, url, successCallback, errorCallback, hrDialog, method, param) {
            if (angular.equals(method, "post")) {
                $http.post(Path.getUri(url), param).success(
                    function (data, status) {
                        if (typeof successCallback === "function") {
                            successCallback(data, status);
                        }
                    }
                ).error(
                    function (data, status) {
                        selfErrorCallback(data, status, errorCallback, hrDialog);
                    }
                );
            } else if (angular.equals(method, "put")) {
                $http.put(Path.getUri(url), param).success(
                    function (data, status) {
                        if (typeof successCallback === "function") {
                            successCallback(data, status);
                        }
                    }
                ).error(
                    function (data, status) {
                        selfErrorCallback(data, status, errorCallback, hrDialog);
                    }
                );
            } else if (angular.equals(method, "delete")) {
                $http.delete(Path.getUri(url)).success(
                    function (data, status) {
                        if (typeof successCallback === "function") {
                            successCallback(data, status);
                        }
                    }
                ).error(
                    function (data, status) {
                        selfErrorCallback(data, status, errorCallback, hrDialog);
                    }
                );
            } else {
                $http.get(Path.getUri(url)).success(
                    function (data, status) {
                        if (typeof successCallback === "function") {
                            successCallback(data, status);
                        }
                    }
                ).error(
                    function (data, status) {
                        selfErrorCallback(data, status, errorCallback, hrDialog);
                    }
                );
            }
        }
    };
}();

/**
 * 数组工具类
 */
var HrArray = function () {
    return {
        pushAll: function (targetArray, sourceArray) {
            sourceArray.forEach(function (item) {
                targetArray.push(item);
            });
        },
        exist: function (item, array) {
            return $.inArray(item, array) === -1 ? false : true;
        },
        inArray: function (item, array) {
            return $.inArray(item, array);
        },
        remove: function (item, array) {
            var index = $.inArray(item, array);
            if (index != -1) {
                array.splice(index, 1);
            }
        }
    };
}();

/**
 * 获取主框架信息工具类
 */
window.baseUtils = {};
baseUtils.getQueryString = function (queryString, name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = queryString.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2])
    }
    return null;
};
baseUtils.getUserId = function () {
    return getQueryString(window.document.location.search, "userId");
};
baseUtils.getAppId = function () {
    return getQueryString(window.document.location.search, "appId");
};

/**
 * 登录信息工具类
 */
var userInfo = function () {
    return{
        getUserInfo: function () {
            return window.parent.StaffDictVO;
        },
        getUserId: function () {
            return window.parent.StaffDictVO.empId;
        },
        getUserNo: function () {
            return window.parent.StaffDictVO.empNo;
        },
        getUserName: function () {
            return window.parent.StaffDictVO.staffName;
        },
        getDoctorInfo: function () {
            return window.parent.StaffDictVO.doctorDictVO;
        }
    };
}();