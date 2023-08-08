
let usuario = prompt("Ingrese su usuario:");
let contra = prompt("Ingrese su contraseña:");

let usuarioTrue = "admin";
let contraTrue = "1234";

if (usuario == usuarioTrue && contra == contraTrue) {
    prompt("Usuario validado correctamente.");
}
else {
    prompt("Usuario incorrecto.");
}