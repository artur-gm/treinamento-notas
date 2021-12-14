$(".edit").click((e)=>{
    let idUsuario = document.querySelector('#idUsuario').value;
    let nome = document.querySelector('#nome').value;
    let cpf = document.querySelector('#cpf').value;
    let rg = document.querySelector('#rg').value;
    let endereco = document.querySelector('#endereco').value;
    let telefone = document.querySelector('#telefone').value;
    let email = document.querySelector('#email').value;

    let usuario = {
        nome: nome,
        cpf: cpf,
        idUsuario: idUsuario,
        rg: rg,
        endereco: endereco,
        telefone: telefone,
        email: email
    };

    $.ajax({
        url: '/api/usuario',
        method: 'PATCH',
        data: JSON.stringify(usuario), //Converte o valor javascript, num JSON
        Accept : "application/json",
        contentType: "application/json",
        dataType: 'json'
    })
    .done((data)=>{
        window.location.href = "/usuario"
    })
    .fail((data)=>{
        alert(data.responseJSON.msg);
    })
})
