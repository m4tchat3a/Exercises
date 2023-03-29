let frase = "";
for(let i = 0; i < 20; i++){
    if(i % 5 != 0){
        continue;
    } else{
        frase = frase + "O valor é " + i + "<br>"
    }
}

document.getElementById("demonstra_valores").innerHTML = frase;