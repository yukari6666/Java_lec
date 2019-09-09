$(function(event) {
  $.ajax({
      url: '/com/userList',
      type: 'get',
      success: function(data) {
    	  console.log(data)
        for(var i = 0; i < data.length; i++) {
            $html_string = '<tr>';
            $html_string = $html_string + '<td>' + data[i]['idx'] + '</td>';
            $html_string = $html_string + '<td>' + data[i]['name'] + '</td>';
            $html_string = $html_string + '<td>' + data[i]['address'] + '</td>';
            $html_string = $html_string + '<td>' + data[i]['birthday'] + '</td>';
            $html_string = $html_string + '</tr>';
            $('table').append($html_string);
          }
      }
  })  
})

$('#insert_user').click(function(event){
	console.log("yes");
//	var name = $(this).parents('tr').find('td').eq(1).text;//name
//	var address = $(this).parents('tr').find('td').eq(2).text;//address
//	var birthday = $(this).parents('tr').find('td').eq(3).text;//birthday
//	console.log(name, address, birthday);
});