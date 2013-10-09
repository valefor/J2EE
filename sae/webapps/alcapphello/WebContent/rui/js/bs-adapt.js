zk.afterLoad('zul.wgt', function () {
	var _button = {};

zk.override(zul.wgt.Button.prototype, _button, {
	_sclass: 'btn-default',
	getZclass: function () {
		return 'btn';
	}
});

});