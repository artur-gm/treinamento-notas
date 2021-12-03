 $(".new").click((e)=>{
     let id = $(e.currentTarget).data("id");
     let nome = document.querySelector('#nome').value;
     let cpf = document.querySelector('#cpf').value;
 
     let usuario = {
     nome: nome,
     cpf: cpf
     };
 
      $.ajax({
         url: '/api/usuario',
         method: 'POST',
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
 