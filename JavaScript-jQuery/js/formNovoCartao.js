;(function(){
  let numeroDoCartao = 0
  const form = document.querySelector(".formNovoCartao")

  form.addEventListener("submit", function(event){
    event.preventDefault()
    const textArea = form.querySelector(".formNovoCartao-conteudo")
    const isTextAreaVazio = textArea.value.trim().length === 0

    if(isTextAreaVazio){
      const msgErro = document.createElement("div")
      msgErro.classList.add("formNovoCartao-msg")
      msgErro.textContent = "Formulário inválido. Não digite vários nada!"

      div.setAttribute("role", "alert")
      div.setAttribute("aria-live", "polite")

      const btnSubmit = form.children[form.children.length-1]
      form.addEventListener("animationend", function(event){
        event.target.remove()
      })
      form.insertBefore(msgErro, btnSubmit)
    } else {
      numeroDoCartao++
      const conteudoDoCartao = textArea.value
      const cartao = $(`
      <article id="cartao_${numeroDoCartao}" tabindex="0" class="cartao">
        <div class="opcoesDoCartao">
          <button class="opcoesDoCartao-remove opcoesDoCartao-opcao" tabindex="0">
            <svg><use xlink:href="#iconeRemover"></use></svg>
          </button>

          <input type="radio" name="corDoCartao${numeroDoCartao}" value="#EBEF40" id="corPadrao-cartao${numeroDoCartao}" class="opcoesDoCartao-radioTipo" checked>
          <label for="corPadrao-cartao${numeroDoCartao}" class="opcoesDoCartao-tipo opcoesDoCartao-opcao" style="color: #EBEF40;" tabindex="0">
            Padrão
          </label>

          <input type="radio" name="corDoCartao${numeroDoCartao}" value="#F05450" id="corImportante${numeroDoCartao}" class="opcoesDoCartao-radioTipo">
          <label for="corImportante${numeroDoCartao}" class="opcoesDoCartao-tipo opcoesDoCartao-opcao" style="color: #F05450;" tabindex="0">
            Importante
          </label>

          <input type="radio" name="corDoCartao${numeroDoCartao}" value="#92C4EC" id="corTarefa-cartao${numeroDoCartao}" class="opcoesDoCartao-radioTipo">
          <label for="corTarefa-cartao${numeroDoCartao}" class="opcoesDoCartao-tipo opcoesDoCartao-opcao" style="color: #92C4EC;" tabindex="0">
            Tarefa
          </label>

          <input type="radio" name="corDoCartao${numeroDoCartao}" value="#76EF40" id="corInspiração-cartao${numeroDoCartao}" class="opcoesDoCartao-radioTipo">
          <label for="corInspiração-cartao${numeroDoCartao}" class="opcoesDoCartao-tipo opcoesDoCartao-opcao" style="color: #76EF40;" tabindex="0">
            Inspiração
          </label>

        </div>
        <p class="cartao-conteudo" contenteditable tabindex="0">${conteudoDoCartao}</p>
      </article>
       `)
       cartao.on("focusin", function(){
         cartao.addClass("cartao--focado")
         })

         cartao.on("focusout", function(){
           cartao.removeClass("cartao--focado")
         })

         //Event delegation

         cartao.on("change", ".opcoesDoCartao-radioTipo", function mudaCor(event) {
           console.log()
           cartao.css("background-color", event.target.value)
         })
         cartao.on("keydown", function deixaClicarComEnter(event){
           if (event.target.classList.contains("opcoesDoCartao-opcao") && (event.key === "Enter" || event.key === " ")) {
             event.target.click()
           }
         })

         cartao.on('click', function(event){
           const elementoSelecionado = event.target
           if (elementoSelecionado.classList.contains('opcoesDoCartao-remove')) {
             cartao.addClass("cartao--some")
             cartao.on("transitionend", function(){
               cartao.remove()
             })
           }
         })

       $(".mural").append(cartao)

    }

  })

  form.classList.remove("no-js")
})()
