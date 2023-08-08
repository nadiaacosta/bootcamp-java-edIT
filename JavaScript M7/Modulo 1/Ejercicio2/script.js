
let sueldo = prompt("Ingrese su sueldo: ");
let sueldoInt = parseInt(sueldo);

let gastosNec = sueldoInt * 0.5;
let gastosOpc = sueldoInt * 0.3;
let ahorro = sueldoInt * 0.2;

prompt("Debe gastar: " + gastosNec + " en gastos necesarios, " + gastosOpc + " en gastos opcionales y "
 + ahorro + " en ahorro e inversion." )