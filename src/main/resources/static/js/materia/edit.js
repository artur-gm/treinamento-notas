$(".edit").click((e)=>{
    let idMateria = document.querySelector('#idMateria').value;
    let nome = document.querySelector('#nome').value;
    let descricao = document.querySelector('#descricao').value;

    let materia = {
        nome: nome,
        descricao: descricao,
        idMateria: idMateria,
    };

    $.ajax({
        url: '/api/materia',
        method: 'PATCH',
        data: JSON.stringify(materia), //Converte o valor javascript, num JSON
        Accept : "application/json",
        contentType: "application/json",
        dataType: 'json'
    })
    .done((data)=>{
        window.location.href = "/materia"
    })
    .fail((data)=>{
        alert(data.responseJSON.msg);
    })
})
