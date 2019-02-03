$('document').ready(function() {

	$('.nav-item').removeClass('active');
	switch (menu) {
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'View Products':
		$('#listProducts').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
	}
})

$('document').ready(function() {
	var total = $('.wrapper').height();
	var nav = $('#barra').height();
	var cont = total - nav;
	$('#contenuto').css('min-height', cont);
})