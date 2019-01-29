$('document').ready(function(){

	$('.nav-item').removeClass('active');
	switch(menu){
	case 'Home':
		$('#home').addClass('active');
	case 'About Us':
		$('#about').addClass('active');
	case 'Contact Us':
		$('#contact').addClass('active');
	case 'View Products':
		$('#listProducts').addClass('active');
	}		
})