function bitSet(va, bit) {
	if (bit < 0) { return false; }
	return va |= (1 << bit);
}

function bitReset(va, bit) {
	if (bit < 0) { return false; }
	return va &= ~(1 << bit);
}

function bitFlip(va, bit) {
	if (bit < 0) { return false; }
	return va ^= (1 << bit);
}

function bitIsset(va, bit) {
	if (bit < 0) { return false; }
	return (va &= (1 << bit)) != 0;
}
zk.afterLoad('zul.wgt', function () {
	var _button = {};

zk.override(zul.wgt.Button.prototype, _button, {
	_sclass: 'btn-default',
	getZclass: function () {
		return 'btn';
	}
});

});