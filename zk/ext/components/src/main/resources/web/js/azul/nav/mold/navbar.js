/**
* Here's the mold file , a mold means a HTML struct that the widget really presented.
* yep, we build html in Javascript , that make it more clear and powerful.
*/
function (out) {

	//Here you call the "this" means the widget instance. (@see Navbar.js)

	var zcls = this.getZclass(),
		uuid = this.uuid;

	//The this.domAttrs_() means it will prepare some dom attributes,
	//like the pseudo code below
	/*
		class="${zcls} ${this.getSclass()}" id="${uuid}"
	*/
	out.push('<div', this.domAttrs_(), '>');
	out.push('<ul id="', uuid, '-cave">');
	for (var w = this.firstChild; w; w = w.nextSibling)
		w.redraw(out);
	out.push('</ul>');
	out.push('</div>');

}