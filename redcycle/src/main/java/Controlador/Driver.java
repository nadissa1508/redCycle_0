/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/*
 * POO 2 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 19/09/2023
 * Fecha final: 19/09/2023
 *
 * @author Nadissa Lopez 23764
 * @author Vianka Castro 23201
 * @author Ricardo Godinez 23247
 * 
 * Clase controladora que conecta todos los modelos del
 * programa, es crucial porque concentra la lógica primordial del sistema.
 * 
 * */
import Modelo.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nadis
 */
public class Driver {
    //Atributos

    private Usuario usuario;

    private ArrayList<Clasificacion> clasificacionesBasura;

    //Getters y Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Clasificacion> getClasificacionesBasura() {
        return clasificacionesBasura;
    }

    public void setClasificacionesBasura(ArrayList<Clasificacion> clasificacionesBasura) {
        this.clasificacionesBasura = clasificacionesBasura;
    }

    public Driver() {
        //usuario = new Usuario();
        //falta llenar el array clasificacionesBasura segun los tipos personalizados que seleccionó el usuario
        //debe de hacerse por defecto 
        usuario = null;

        clasificacionesBasura = new ArrayList<>();
    }

    private float validarLitrosCont(String cantLitros) {
        float litros = 0.0f;
        try {
            if (cantLitros.equals("")) {
                litros = 0.0f;
            } else {
                litros = Float.parseFloat(cantLitros);
            }

        } catch (Exception e) {
            //ACA HAY ERROR
            JOptionPane.showMessageDialog(null, "Debe ingresar un número decimal, no ingrese letras o números negativos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("ERROR AL TRATAR INGRESAR CANTIDAD DE LITROS DEL CONTENEDOR");
            litros = -1.1f;
        }
        return litros;
    }

    public void validarUsuario(String mensaje, String nombre, String correo, String password, String clasificacionCont1, String litros1, String clasificacionCont2, String litros2, String clasificacionCont3, String litros3, String clasificacionCont4, String litros4, String clasificacionCont5, String litros5, String clasificacionCont6, String litros6) {
        float litrosOrganica = 0.0f, litrosPlastico = 0.0f, litrosMulticapa = 0.0f, litrosMetal = 0.0f, litrosVidrio = 0.0f, litrosPapel = 0.0f;

        litrosOrganica = validarLitrosCont(litros1);
        litrosPlastico = validarLitrosCont(litros2);
        litrosMulticapa = validarLitrosCont(litros3);
        litrosMetal = validarLitrosCont(litros4);
        litrosVidrio = validarLitrosCont(litros5);
        litrosPapel = validarLitrosCont(litros6);

        if (nombre.equals("") || correo.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacio!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (litrosOrganica < 0) {
            //ENTRA ACA
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida en la cantidad del litros del contenedor (basura orgánica) !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (litrosPlastico < 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida en la cantidad del litros del contenedor (plastico) !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (litrosMulticapa < 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida en la cantidad del litros del contenedor (basura multicapa) !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (litrosMetal < 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida en la cantidad del litros del contenedor (metal) !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (litrosVidrio < 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida en la cantidad del litros del contenedor (vidrio) !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (litrosPapel < 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida en la cantidad del litros del contenedor (papel y carton) !", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        guardarUsuario(mensaje,nombre, correo, password, clasificacionCont1, litrosOrganica, clasificacionCont2, litrosPlastico, clasificacionCont3, litrosMulticapa, clasificacionCont4, litrosMetal, clasificacionCont5, litrosVidrio, clasificacionCont6, litrosPapel);

    }

    public void guardarUsuario(String mensaje, String nombre, String correo, String password, String clasificacionCont1, float litros1, String clasificacionCont2, float litros2, String clasificacionCont3, float litros3, String clasificacionCont4, float litros4, String clasificacionCont5, float litros5, String clasificacionCont6, float litros6) {
        ArrayList<Contenedor> contenedoresBasura = new ArrayList<>();

        Contenedor contTemp;
        if (litros1 > 0) {
            contTemp = new Contenedor(clasificacionCont1, litros1, 0);
            contenedoresBasura.add(contTemp);
        }
        if (litros2 > 0) {
            contTemp = new Contenedor(clasificacionCont2, litros2, 0);
            contenedoresBasura.add(contTemp);
        }
        if (litros3 > 0) {
            contTemp = new Contenedor(clasificacionCont3, litros3, 0);
            contenedoresBasura.add(contTemp);
        }
        if (litros4 > 0) {
            contTemp = new Contenedor(clasificacionCont4, litros4, 0);
            contenedoresBasura.add(contTemp);
        }
        if (litros5 > 0) {
            contTemp = new Contenedor(clasificacionCont5, litros5, 0);
            contenedoresBasura.add(contTemp);
        }
        if (litros6 > 0) {
            contTemp = new Contenedor(clasificacionCont6, litros6, 0);
            contenedoresBasura.add(contTemp);
        }

        if (contenedoresBasura.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione al menos un contenedor de basura!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        usuario = new Usuario(nombre, correo, password, contenedoresBasura);
        if (usuario != null) {
            JOptionPane.showMessageDialog(null, "Cuenta " + mensaje + " con exito!");
        } else {
            System.out.println("ERROR AL CREAR USUARIO");
        }

    }

    public boolean iniciarSesion(String user, String pass) {
        boolean flag = false;
        if (usuario != null) {
            if ((user.equals(usuario.getNombre())) && (pass.equals(usuario.getPassword()))) {
                JOptionPane.showMessageDialog(null, "Credenciales correctas!");
                flag = true;
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas!", "Error", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe registrarse para poder iniciar sesión", "Error", JOptionPane.ERROR_MESSAGE);
            flag = false;
        }

        return flag;
    }

    public void buscarResiduo(String residuo) {

    }

    public void ingresarResiduos(String clasificación, int cantidadResiduos) {

    }

    public void mostrarMisResiduos() {

    }

    public void mostrarEstadísticas(Date fecha) {

    }

    public String alertaContenedores(String clasificación) {
        String alerta = "";
        return alerta;
    }

    public void actualizarControlContenedor() {

    }

    public void calcularProgresoMensual() {

    }

}
