/*var jason = {
nombre: "Cristian",
edad: 24,
casado= false,
mascota: ['Cachetes'],
colegio:{
    nombrecolegio: 'Alfonso Laso',
    telefono: 0992971179,
    a: ''
}
};

console.log('hola');
console.log(jason.nombre);
console.log(jason.colegio.nombrecolegio);
console.log(jason['mascota']);

var a= arreglo = ["aa","bb",1,true,{a: 1},["asd","fff",45]]
console.log(arreglo);
*/
/*
var jasoncristian = {
    nombre : '',
    apellido: ''
};

console.log(jason + jasoncristian);
var nu = null;

console.log(typeof cristian);
var numero = 1;
var bool = false;
console.log(null + numero);
*/

//funciones

var mifuncion = function(n1, n2) {

    console.log('funcion 1');
    return n1+n2;
};
//funciones flecha borda
var mifuncion2 = (n1, n2) => {

    return n1+n2;
};

mifuncion();
console.log(mifuncion(1, 2));
console.log(mifuncion2());

var jsonFunciones = {

    suma: function(){
        return 2 + 3;
    },

    resta: function(){
      return 10-4;
    },

    multiplocacion: function(){
        return 5*4;

    },

    Division: function(){
        return 20/4;
    }
};

console.log(jsonFunciones.suma());
console.log(jsonFunciones.resta());
console.log(jsonFunciones.multiplocacion());
console.log(jsonFunciones.Division());

var numeroMenorANumero2 = numero > numero2;
var esIgual = numero2 === numero;

console.log();
console.log(typeof numeroMenorANumero2);

if (numeroMenorANumero2) {
    
} else {
    
}
