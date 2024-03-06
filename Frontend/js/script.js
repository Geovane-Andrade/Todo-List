var regiao_cadastro_exclusao = {
    "Cadastrar" : "<div id='formulario'><form id = 'formulario_cadastro'><p><label for='nome_tarefa'>Nome da tarefa: </label><input type='text' id='nome_tarefa'></p><p>    <label for='descricao_tarefa'>Descrição: </label>    <input type='text' id='descricao_tarefa'></p><p>    <label for='cadastro_data'>Data de Término: </label>    <input type='date' name='data_termino' id='cadastro_data'></p><p>    <label for='prioridade_1'> Nível de prioridade? </label>    <input type='radio' name='prioridade' id='prioridade_1'>    <label for='prioridade_1'> 1</label>    <input type='radio' name='prioridade' id='prioridade_2'>    <label for='prioridade_2'> 2</label>    <input type='radio' name='prioridade' id='prioridade_3'>    <label for='prioridade_3'> 3</label>    <input type='radio' name='prioridade' id='prioridade_4'>    <label for='prioridade_4'> 4</label>    <input type='radio' name='prioridade' id='prioridade_5'>    <label for='prioridade_5'> 5</label></p><p>    <label for='cadastro_backlog'> Qual o status da tarefa? </label>    <input type='radio' name='tarefa' id='cadastro_backlog'>    <label for='cadastro_backlog'> Backlog</label>    <input type='radio' name='tarefa' id='cadastro_todo'>    <label for='cadastro_todo'> Todo</label>    <input type='radio' name='tarefa' id='cadastro_doing'>    <label for='cadastro_doing'> Doing</label>    <input type='radio' name='tarefa' id='cadastro_done'>    <label for='cadastro_done'> Done</label></p><button type='button' id='criar_tarefa'>Criar tarefa</button><button type='button' id='atualizar_tarefa'>Atualizar tarefa</button></form>",
    "Excluir" : "<form action='js/script.js' method='post' id ='formulario_exclusao'><p><label for='tarefa_para_excluir'>Nome da tarefa à excluir:   </label><input type='text' id='nome_tarefa_para_excluir'></p><p><p>    <label for='cadastro_backlog'> Status da tarefa:  </label>    <input type='radio' name='tarefa' id='cadastro_backlog'>    <label for='cadastro_backlog'> Backlog</label>    <input type='radio' name='tarefa' id='cadastro_todo'>    <label for='cadastro_todo'> Todo</label>    <input type='radio' name='tarefa' id='cadastro_doing'>    <label for='cadastro_doing'> Doing</label>    <input type='radio' name='tarefa' id='cadastro_done'>    <label for='cadastro_done'> Done</label></p><button type='button' id='deletar_tarefa'>Deletar tarefa</button></form>"
};

var cor_nao_selecionada = "#2E7C49"
var cor_selecionada = "#215A35"

var caixa_selecionada = document.getElementsByClassName("caixa_unica")

for(var i = 0; i < caixa_selecionada.length; i++) {
  
    caixa_selecionada[i].onclick = function(){
  
      for(var j = 0; j < caixa_selecionada.length; j++){
        caixa_selecionada[j].style["background-color"] = cor_nao_selecionada;
        caixa_selecionada[j].style["font-weight"] = "normal";
      }
  
      this.style["background-color"] = cor_selecionada;
      this.style["font-weight"] = "bold";
      
  
      var selecionado = this.innerHTML;
      
      document.getElementById("formulario").innerHTML = regiao_cadastro_exclusao[selecionado];
    }
}

