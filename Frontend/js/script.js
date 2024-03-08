
document.getElementById("criar_tarefa").onclick = function adicionar_tarefa() {

    var nome = document.getElementById("nome_tarefa").value
    var descricao = document.getElementById("descricao_tarefa").value
    var data_termino = document.getElementById("data").value
    var prioridade = document.getElementsByName("prioridade")
    var status = document.getElementsByName("status")
    var categoria = document.getElementById("selecao_categoria").value

    var status_selecionado
    var prioridade_selecionada

    for (let i = 0; i < status.length; i++) {
        if (status[i].checked) {
            status_selecionado = status[i].value
            break;
        }
    }

    for (let i = 0; i < prioridade.length; i++) {
        if (prioridade[i].checked) {
            prioridade_selecionada = prioridade[i].value
            break;
        }
    }


    var tarefaHtml = '<div class="tarefa">' +
        '<h3>Nome: ' + nome + '</h3>' +
        '<p>Descrição: ' + descricao + '</p>' +
        '<p>Data de Término: ' + data_termino + '</p>' +
        '<p>Categoria: ' + categoria + '</p>' +
        '<p>Prioridade: ' + prioridade_selecionada + '</p>' +
        '<button class="excluir_tarefa" onclick="remover_tarefa(this)">Remover</button>' +
        '<button class="botao_edicao" onclick="atualizar_tarefa(this)">Editar</button>' +
        '</div>';

    switch (status_selecionado) {

        case "backlog": {

            document.getElementById("backlog_lista").innerHTML += tarefaHtml
            break;
        }
        case "todo": {
            document.getElementById("todo_lista").innerHTML += tarefaHtml
            break;
        }
        case "doing": {

            document.getElementById("doing_lista").innerHTML += tarefaHtml
            break;
        }
        case "done": {
            document.getElementById("done_lista").innerHTML += tarefaHtml
            break;
        }
    }
}

function remover_tarefa(botao_remove) {
    botao_remove.parentNode.remove()
}

function atualizar_tarefa(botao_atualiza) {
    var tarefa = botao_atualiza.parentNode
    var campos = tarefa.querySelectorAll('h3, p')

    campos.forEach(function (campo) {
        var valor_antigo = campo.innerText.split(':')[1].trim()
        var nome_campo = campo.innerText.split(':')[0].trim()
        var type = null

        if(nome_campo == 'Data de Término'){
            type = 'date'
            
        }else{
            type = 'text'
        }
        campo.innerHTML = '<label>' + nome_campo + `: <input type=${type} value="` + valor_antigo + '"> </label>'
    })

    var botaoOk = document.createElement('button');
        botaoOk.innerText = 'Ok!';
        botaoOk.onclick = function() {
            campos.forEach(function(campo) {
                var nome_campo = campo.innerText.split(':')[0].trim()
                campo.innerHTML = nome_campo +  ': ' + campo.querySelector('input').value ;
            });
            tarefa.appendChild(botao_atualiza); 
            botaoOk.remove(); 
        };
        
        tarefa.appendChild(botaoOk); 
        botao_atualiza.remove();

}

