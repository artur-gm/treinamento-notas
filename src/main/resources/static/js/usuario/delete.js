$(".delete").click((e)=>{
    let id = $(e.currentTarget).data("id");

     $.ajax({ url: '/api/usuario/' + id, method: 'DELETE' })
        .done((data)=>{
            window.location.href = "/usuario";
        })
        .fail((data)=>{
            //alert("Falha ao deletar item " + id);
            alert(data.responseJSON.msg);
        })
})
