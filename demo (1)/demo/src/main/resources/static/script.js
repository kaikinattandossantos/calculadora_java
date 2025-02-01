function calcular() {
    let num1 = document.getElementById("operando1").value;
    let num2 = document.getElementById("operando2").value;
    let operador = document.getElementById("operador").value;

    // Envia os valores para o backend
    fetch(`http://localhost:8080/api/calculadora/operar?num1=${num1}&num2=${num2}&operador=${operador}`)
        .then(response => response.text())
        .then(resultado => {
            document.getElementById("resultado").innerText = "Resultado: " + resultado;
        })
        .catch(error => console.error("Erro ao calcular:", error));
}
