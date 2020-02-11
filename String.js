var nombre = 'cristian cordova';
var b = "";
var tamanioLetra = nombre.length
console.log(nombre.length);
console.log(nombre.indexOf("v"));

console.log(nombre.search("in"));

console.log(nombre.substr(2));

console.log(nombre.charAt(3));

while (tamanioLetra >= 0) {
    b += nombre.charAt(tamanioLetra)
    console.log(b)
    tamanioLetra--
}
console.log(nombre.slice(1,-7))
console.log(nombre.split(''))

var texto = "hola que hace"
console.log('Antes de remplazar')
console.log(texto);
console.log('Despues de remplazar')
var textModificado = texto.replace('que hace','khe')
console.log(textModificado);

var ejemploTrim = "hola"
console.log(ejemploTrim)
console.log(ejemploTrim.trim())

console.log(ejemploTrim.concat(" ",nombre));
console.log(ejemploTrim.toLowerCase());
ejemploTrim === nombre;


var palabra = "Lenguaje orirnetado a objetos; Esta definición concuerda incluso con ciertos ejemplos prácticos, que no son considerados dentro de la programación orientada a objetos, pero que podrían serlo. Por ejemplo, la programación"


var arreglopalabra = palabra.split(" ");

arreglopalabra[0] = arreglopalabra[0].toLocaleUpperCase();

var mitad1 = (arreglopalabra.length / 2)-0.5;
var mitad2 = (arreglopalabra.length / 2)+0.5;

arreglopalabra[mitad1] = arreglopalabra[mitad1].toLocaleUpperCase(); 
arreglopalabra[mitad2] = arreglopalabra[mitad2].toLocaleUpperCase(); 

var final = arreglopalabra.length;

arreglopalabra[final-1] = arreglopalabra[final-1].toLocaleUpperCase(); 

var puntos = palabra.split(".");
var comas = palabra.split(",");
var puntoycoma = palabra.split(";");

var contarPuntos = puntos.length - 1; 
var contarComas = comas.length - 1;
var contarpuntoycoma = puntoycoma.length - 1;

var palabraCompleta = "";

for (var i = 0; i < arreglopalabra.length; i++) {
    palabraCompleta =  palabraCompleta + arreglopalabra[i] + "*-*" 
}

console.log(palabraCompleta);
console.log("el numeros de Puntos son: "+contarPuntos);
console.log("el numero de Comas es: "+contarComas);
console.log("el numero de dos puntos son: "+contarpuntoycoma);

