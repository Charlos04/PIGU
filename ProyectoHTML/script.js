
let filas = 5
let columnas = 5
let lado = 50





nuevoJuego()

function nuevoJuego() {
  leerValor();
  generarTableroHTML() 
}

function leerValor(){
  
  columnas = document.getElementById("filas").value
  filas = document.getElementById("filas").value
  generarTableroHTML();
}


function generarTableroHTML() {
  let html = ""
  for (let f = 0; f < filas; f++) {
    html += `<tr>`
    for (let c = 0; c < columnas; c++) {
      html += `<td id="celda-${c}-${f}" style="width:${lado}px;height:${lado}px">`
      html += `</td>`
    }
    html += `</tr>`
  }
  let tableroHTML = document.getElementById("tablero")
  tableroHTML.innerHTML = html
  tableroHTML.style.width = columnas * lado + "px"
  tableroHTML.style.height = filas * lado + "px"
  tableroHTML.style.background = "white"
}



















