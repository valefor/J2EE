// zk bootstrap adjust javascript

$('head').append('<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->')
	.append('<!--[if lt IE 9]>')
	.append('<script src="../../assets/js/html5shiv.js"></script>')
	.append('<script src="../../assets/js/respond.min.js"></script>')
	.append('<![endif]-->');

// add attribute 'data-spy' & 'data-target' to <body> to enable bootstrap affix navbar
$('body').attr({
	"data-spy"		: "scroll",
	"data-target"	: ".alc-docs-sidebar"
});