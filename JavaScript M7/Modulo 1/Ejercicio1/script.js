
let costosFijos = prompt("Ingrese el total de los costos fijos:")
let precioVenta = prompt("Ingrese el precio de venta:")
let costosVariables = prompt("Ingrese el total de los costo variables:")

let costosFijosInt = parseInt(costosFijos);
let precioVentaInt = parseInt(precioVenta);
let costosVariablesInt = parseInt(costosVariables);


let CV = costosFijosInt / (precioVentaInt - costosVariablesInt);

prompt("El punto de equilibrio es igual a: " + CV);

