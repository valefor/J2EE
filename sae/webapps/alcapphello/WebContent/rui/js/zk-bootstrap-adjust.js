// zk bootstrap adjust javascript

//$('head').append('<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->')
//	.append('<!--[if lt IE 9]>')
//	.append('<script src="../../assets/js/html5shiv.js"></script>')
//	.append('<script src="../../assets/js/respond.min.js"></script>')
//	.append('<![endif]-->');

// add attribute 'data-spy' & 'data-target' to <body> to enable bootstrap affix navbar
!function($) {
	
	// When DOM is ready, execute customized codes
	$(function() {
		console.log("ready!");
		console.log($(".alc-docs-sidebar").length);
		console.log( document);
		console.log($('div.navbar'));
		var $sideBar = $('.alc-docs-sidebar');
		console.log($sideBar);
		console.log($('.alc-docs-sidebar'));

		$('body').attr({
			"data-spy" : "scroll",
			"data-target" : ".alc-docs-sidebar"
		});
		console.log($('body'));

		$sideBar.affix({
			offset : {
				top : function() {
					var offsetTop = $sideBar.offset().top;
					var sideBarMargin = parseInt($('#sidebar').children(0).css(
							'margin-top'), 10);
					var navOuterHeight = $('.alc-docs-nav').height();

					return (this.top = offsetTop - navOuterHeight - sideBarMargin);
				},
				bottom : function() {
					return (this.bottom = $('.bs-footer').outerHeight(true));
				}
			}
		});	
	});


}(window.jQuery);