/*
var arreglos = [1,2,3,4,5,6];

 var palabraString = kevin;
var arregloPalabra = palabraString.split('');

//agregra un arreglo al final del arreglo 
arreglos.push(6);
console.log(arreglos.length);
//quitar un arreglo
arreglos.pop();
for (let index = o; index < arreglos.length; index++){
    const element = arreglos[index];
    console.log(element);
}
//accede a un arreglo especifico
console.log(arreglos[3]);
console.log(arreglos.shift());
console.log(arreglos.unshift(3));

///Dividir un arreglo 
console.log(arreglo);
var arregloDividido = arreglo.slice(2, 4);
console.log(arregloDividido)
//eliminar elementos de un arreglo especifico
arreglo.splice(0, 1);
console.log(arreglo);




arreglos.forEach((elemento, indice)=>{
console.log(elemento, indice);
});

var arregloMutado=arreglos.map((elemento,indice)=>{
return elemento+1;
}).forEach((e,i)=>{
    console.log(e);
}).map((e)=>{
   return e+1;
});

console.log(arregloMutado);

var arreglox2 = arreglos.map((element,indice)=>{
return 
})
.some(e =>{
    return e
})
console.log();

var metodoSome=arreglos.some((e,i)=>{
return e == 2; 
})
console.log(metodoSome);



var metodoEvery=arreglos.every((e,i)=>{
    return e == 2; 
    })
    console.log(metodoEvery);

///filter-find
var  metodoFilter=arreglos.find((element,indice)=>{
    return element === 2;
})

console.log(metodoFilter);
*/


//Trabajo en clase 



var jsonarreglo = '[{"Nombre":"Sutano","Edad":22},{"Nombre":"Fulano","Edad":30},{"Nombre":"Mengano","Edad":21},{"Nombre":"Cristian","Edad":22}]';

var arr = JSON.parse(jsonarreglo);

var totalAges = arr.reduce((sum, value) => (typeof value.Edad == "number" ? sum + value.Edad : sum), 0);

console.log("la edad total es de:",totalAges);



