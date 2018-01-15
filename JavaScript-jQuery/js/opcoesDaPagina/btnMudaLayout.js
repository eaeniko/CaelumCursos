const btn = document.querySelector('#btnMudaLayout')
function mudaTexto (){
  console.log(btn.textContent);
  if (btn.textContent.trim() == "Linhas") {
    btn.textContent = "Colunas"
  } else {
    btn.textContent = "Linhas"
  }
}
btn.addEventListener('click', mudaTexto)

const mural = document.querySelector('.mural')
function mudaLayout() {
  mural.classList.toggle('mural--linha')
}
btn.addEventListener('click', mudaLayout)
btn.classList.remove('no-js')
