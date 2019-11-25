function Product(name, price, tags) {
    this.name = ko.observable(name);
    this.price = ko.observable(price);
    tags = typeof(tags) !== 'undefined' ? tags : [];
    this.tags = ko.observableArray(tags);
};

function PersonViewModel() {
    var self = this;
    this.firstName = ko.observable("Luciano");
    this.lastName = ko.observable("Alves");
    this.fullName = ko.computed(function() {
        return this.firstName() + " " + this.lastName();
    }, this);

    this.shoppingCart = ko.observableArray([
        new Product("book", 10, ['good', 'low price']),
        new Product("Home", 250, ['maked with wood']),
        new Product("Car", 20, ['fast', 'furious'])
    ]);
    this.addProduct = function() {
        var order = this.shoppingCart().length;
        this.shoppingCart.push(new Product("New Prod", Date(), [1, 2, 3]));
    };

    this.removeProduct = function(product) {
        self.shoppingCart.destroy(product);
        self.shoppingCart.remove(product);
    };
    this.checkout = function() {
        alert("Trying checkout");
    };
};
//ko.applyBindings(new personViewModel());
var vm = new PersonViewModel();
ko.applyBindings(vm);
vm.firstName("Name");