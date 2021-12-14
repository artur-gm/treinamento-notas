$(".delete").click((e)=>{
    let id = $(e.currentTarget).data("id");

     $.ajax({ url: '/api/materia/' + id, method: 'DELETE' })
        .done((data)=>{
            window.location.href = "/materia";
        })
        .fail((data)=>{
            //alert("Falha ao deletar item " + id);
            alert(data.responseJSON.msg);
        })
})
