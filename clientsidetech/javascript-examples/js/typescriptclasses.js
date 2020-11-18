var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var User = /** @class */ (function () {
    function User(id, name) {
        this.id = id;
        this.name = name;
    }
    User.prototype.toString = function () {
        var text = this.id + " " + this.name;
        return text;
    };
    return User;
}());
var Customer = /** @class */ (function (_super) {
    __extends(Customer, _super);
    function Customer(id, name, balance) {
        var _this = _super.call(this, id, name) || this;
        _this.balance = balance;
        return _this;
    }
    Customer.prototype.toString = function () {
        var text = this.id + " " + this.name + " " + this.balance;
        return text;
    };
    return Customer;
}(User));
var Admin = /** @class */ (function (_super) {
    __extends(Admin, _super);
    function Admin(id, name, org) {
        var _this = _super.call(this, id, name) || this;
        _this.organization = org;
        return _this;
    }
    Admin.prototype.toString = function () {
        var text = this.id + " " + this.name + " " + this.organization;
        return text;
    };
    return Admin;
}(User));
var customer1 = new Customer(1, 'avichal', 200);
var admin = new Admin(2, 'shubank', 'capgemini');
console.log("customer =" + customer1.id + " " + customer1.name + " " + customer1.balance);
var customerText = customer1.toString();
console.log("customer1 text= " + customerText);
console.log("admin=" + admin.id + " name=" + admin.name + " organizatioon=" + admin.organization);
var adminText = admin.toString();
console.log("admin to string=" + adminText);
