// zk client test js
/*
zk.load("zul.inp, zul.layout",function(){alert("package loaded!")});

zk.Widget.$('bZ8Po').mainWin.setTitle("Hello");

zk.Widget.$(jq('@window')[1]).setTitle("xxx");

zk.Widget.$(jq('@window')[1]).appendChild(new zul.wnd.Window({
    title: 'Hello, World',
    border: 'normal',
    children: [
        new zul.wgt.Label({value: 'Hi, '}),
        new zul.wgt.Button({
            label: 'Click Me!',
            listeners:  {
                onClick: function (evt) {
                    alert('Hi, you clicked me');
                }
            }
        })
    ]
}));

zk("@window").$("helloWin").id
$("#rZHQ9").load('public?redrawCtrl=page')
*/

var a = {
	x: 10,
	calculate: function(z) {
		console.log(this);
		return this.x + this.y +z;
	}
};

var b = {
	y: 20,
	__proto__: a
};

var c = {
	y: 20,
	__proto__: a
};

var Foo = function() {};


zk.$package('org.alc');
org.alc.navbar = zk.$extends(zk.Object,{title:'Navbar'});
console.log(window['org']['alc']);
org.alc.navbar; // function
org.alc.navbar.title; // undefined
org.alc.navbar.prototype; // !! Object prototype of function org.alc.navbar
navbar = new org.alc.navbar;
navbar.title; // 'Navbar'
zk.define(org.alc.navbar,{disable:false}); // define a new attribute in org.alc.navbar
navbar.setDisable(true);
navbar.isDisable(); // true

// create a sub Objec of org.alc.navbar
org.alc.niceNavBar = zk.$extends(org.alc.navbar,{
	title : 'Nice Navbar',
	cool : true,
	$define: {
		width: 0,
		height: 0
	}
},
{
	saySomethingTo: function(name) {
		alert("Hello:"+name+"!\nI'm a navbar!");
	}
});
niceNavbar = new org.alc.niceNavBar;
niceNavbar.title; // "Nice navbar"
org.alc.niceNavBar.saySomethingTo("adrian");
niceNavbar.$class.saySomethingTo("piggy");

org.alc.helloBar = zk.$extends(org.alc.niceNavBar,{},{
	hello:function (name) {
		alert("Hello:" +name+ "again!");
	}
});
