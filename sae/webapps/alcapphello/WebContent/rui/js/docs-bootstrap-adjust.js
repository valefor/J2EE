// bootstrap adjust javascript for documentation

//$('head').append('<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->')
//	.append('<!--[if lt IE 9]>')
//	.append('<script src="../../assets/js/html5shiv.js"></script>')
//	.append('<script src="../../assets/js/respond.min.js"></script>')
//	.append('<![endif]-->');


// add padding to top so navbar won't cover main content of web
$('body').css({
		position	: "relative",
		paddingTop	: "50px"
});

!function($) {	
	// When DOM is ready, execute customized codes
	$(function() {

		// add attribute 'data-spy' & 'data-target' to <body> to enable bootstrap affix navbar
		$('body').attr({
			"data-spy" : "scroll",
			"data-target" : ".alc-docs-sidebar"
		});
		console.log($('body'));

		$sideBar = $('.alc-docs-sidebar');
		$sideBar.affix({
			offset : {
				top : function() {
					var offsetTop = $sideBar.offset().top;
					var sideBarMargin = parseInt($sideBar.children(0).css(
							'margin-top'), 10);
					var navOuterHeight = $('.alc-docs-nav').height();

					console.log('offset top');
					console.log(offsetTop);
					console.log(sideBarMargin);
					console.log(navOuterHeight);
					
					return (this.top = offsetTop - navOuterHeight - sideBarMargin);
				},
				bottom : function() {
					console.log('offset bottom');
					console.log($('.alc-docs-footer').outerHeight(true));
					return (this.bottom = $('.alc-docs-footer').outerHeight(true));
				}
			}
		});	
	});


}(window.jQuery);