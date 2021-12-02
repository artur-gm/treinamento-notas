 $(".new").click((e)=>{
     let id = $(e.currentTarget).data("id");
     let nome = document.querySelector('#nome').value;
     let tipo = document.querySelector('#cpf').value;
 
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
        // Estou usando esses alerts provisóriamente, o Api está funcionando, mas algo está dando errado no js
         .done((data)=>{
             //let requestParams = new URLSearchParams({inclusao:nome}).toString()
             //window.location.href = "/localhost:8080/usuario?"+requestParams+" ID="+data;
             alert("funcionou")
         })
         .fail((data)=>{
             //alert(data.responseJSON.msg);
             alert("não funcionou");
         })
 })
 