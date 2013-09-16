// zk bootstrap adjust javascript

// !jQuery must be loaded first
// adjust <body> style for navbar
$('body').css({
	position	: "relative",
	paddingTop	: "50px"
});

// add attribute 'data-spy' & 'data-target' to <body> to enable bootstrap affix navbar
$('body').attr({
	"data-spy"		: "scroll",
	"data-target"	: ".alc-docs-sidebar"
});