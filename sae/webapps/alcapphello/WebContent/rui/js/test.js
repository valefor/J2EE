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
