/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Clasificacion;
import java.util.ArrayList;

/**
 *
 * @author richi
 */
public class DriverClasifico {

    ArrayList<Clasificacion> clasificacionesBasura;

    public DriverClasifico() {
        clasificacionesBasura = new ArrayList<>();
        llenarClasificaciones();
    }

    //este metodo toma cada elemento del array articulosClasificacion y los introduce dentro del arrayArticulos, que es atributo
    //de las intancias de Clasificacion
    public ArrayList<String> llenarArrayArticulos(String[] articulosClasificacion) {
        Clasificacion clas = new Clasificacion();
        for (String articulo : articulosClasificacion) {
            clas.agregarArticulo(articulo);
        }
        return clas.getArrayArticulos();
    }

    public void llenarClasificaciones() {
        Clasificacion tempClas;

        //CREAR OBJETO CLASIFICACION -> BASURA ORGANICA
        String[] articulosOrganica = {
            "Cascaras de naranja",
            "Cascaras de platano",
            "Restos de lechuga",
            "Sobras de espaguetis",
            "Pan viejo",
            "Filtros de papel de café",
            "Bolsitas de te",
            "Cascaras de huevo",
            "Hojas de arboles",
            "Ramas de arbustos",};

        tempClas = new Clasificacion("Organica", "La basura orgánica, también conocida como residuos orgánicos, comprende materiales biodegradables de origen natural, como restos de alimentos, hojas, ramas y papel de cocina sucio. Estos desechos se descomponen naturalmente a través de procesos biológicos y pueden convertirse en compost o abono para mejorar la fertilidad del suelo. La gestión adecuada de la basura orgánica es esencial para reducir la cantidad de residuos enviados a vertederos y contribuir a la sostenibilidad ambiental a través del compostaje.", "El mal manejo de la basura orgánica es que cuando se desecha incorrectamente en vertederos o incineradoras, puede generar la liberación de gases de efecto invernadero, como el metano. El metano es un gas que contribuye al cambio climático y al calentamiento global.", "La gestión adecuada de la basura orgánica da como resultado un valioso producto: el compost. El compost es un abono orgánico rico en nutrientes que puede utilizarse para enriquecer el suelo en jardines, huertos y agricultura. Al hacerlo, contribuyes a mejorar la salud del suelo, aumentar la fertilidad y promover un crecimiento más saludable de plantas y cultivos.", llenarArrayArticulos(articulosOrganica));
        clasificacionesBasura.add(tempClas);

        tempClas = new Clasificacion();
        //CREAR OBJETO CLASIFICACION -> BASURA PLASTICO
        String[] articulosPlastico = {
            "Botella de plástico",
            "Envases de yogur",
            "Bolsas de plástico",
            "Envases de productos de limpieza",
            "Tapas de botellas",
            "Tazas desechables de plástico",
            "Juguetes de plástico",
            "Cubiertos desechables de plástico",
            "Envases de champú",
            "Envases de detergente líquido"
        };
        tempClas = new Clasificacion("Plastico", "El artículo que buscaste se debe clasificar como Plástico. Este tipo de desechos están compuestos en su mayoría por derivados del petróleo, tienen un tiempo de degradación muy lento y tardan al menos 100 años en descomponerse.", "Los plásticos mal gestionados a menudo terminan en océanos y mares, los animales marinos pueden ingerir plásticos al confundirlos con alimentos, lo que puede llevar a daños internos, asfixia e incluso la muerte.", "Reducir la producción de residuos de plástico beneficia al medio ambiente al conservar la vida marina y los ecosistemas marinos. Al optar por alternativas sostenibles, como bolsas reutilizables y botellas recargables, ayudas a prevenir la contaminación de los océanos y la ingesta de plásticos por parte de la vida marina. Además, esta elección también puede ahorrarte dinero a largo plazo y disminuir tu huella de carbono.", llenarArrayArticulos(articulosPlastico));
        clasificacionesBasura.add(tempClas);

        //CREAR OBJETO CLASIFICACION -> BASURA MULTICAPA
        String[] articulosMulticapa = {
            "Envase de aperitivos",
            "Envase de jugo",
            "Envase de papas fritas",
            "Bolsas de café",
            "Envoltorios de dulce",
            "Bolsas de bocadillos",
            "Pasta de dientes",
            "Envase de detergente",
            "Blister de pastillas",
            "Envases de baterías"
        };
        tempClas = new Clasificacion("Multicapa", "categorización de residuos que consisten en envases y productos con capas de diferentes materiales, como papel, plástico, aluminio o metal. Estos materiales combinados en capas pueden ser difíciles de reciclar o reutilizar, lo que a menudo los convierte en un desafío ambiental. La basura multicapa incluye productos como envases de alimentos, envases de bebidas, bolsas de aperitivos y otros artículos que contienen múltiples capas de diferentes materiales.", "El mal manejo de la basura multicapa conlleva dificultades en su reciclaje, lo que a menudo resulta en la acumulación de estos productos en vertederos. Esto puede llevar a la pérdida de recursos y contribuir a la contaminación ambiental. Es importante considerar alternativas y reciclaje adecuado para minimizar estos efectos negativos.", "Al reducir la producción de residuos multicapa, estás ayudando a preservar la belleza natural del planeta y a proteger a la vida silvestre. Menos desechos multicapa significan menos productos dañinos que llegan a hábitats naturales y océanos, lo que beneficia a los ecosistemas y a los animales que dependen de ellos. Tu contribución apoya la biodiversidad y asegura que los animales puedan vivir en un entorno más limpio y saludable.", llenarArrayArticulos(articulosMulticapa));
        clasificacionesBasura.add(tempClas);

        //CREAR OBJETO CLASIFICACION -> BASURA METAL
        String[] articulosMetal = {
            "Latas de refrescos",
            "Envases de alimentos de metal",
            "Tubos de pasta dental de aluminio",
            "Tapas de frascos metálicos",
            "Alambre de cobre",
            "Clips metálicos",
            "Tuberías de plomería de metal",
            "Cubiertos de acero inoxidable",
            "Piezas de maquinaria de metal",
            "Llaves y tuercas de metal"
        };
        tempClas = new Clasificacion("Metal", "La clasificación de basura de metal se refiere a la categorización de residuos que están hechos principalmente de materiales metálicos, como latas de refrescos, envases de alimentos de metal, alambre de cobre, herramientas de metal y otros objetos similares. El metal es un material valioso y reciclable que se utiliza en una variedad de productos, y su reciclaje ayuda a conservar recursos naturales y reduce la contaminación.", "El mal manejo de la basura de metal puede resultar en la liberación de sustancias químicas tóxicas en el medio ambiente, lo que amenaza la salud humana y la vida silvestre. Además, la producción de metal implica la explotación de recursos naturales y daños ecológicos. Es importante gestionar adecuadamente la basura de metal para prevenir estos efectos negativos.", "Reciclar metales no solo conserva recursos naturales, sino que también reduce las emisiones de gases de efecto invernadero al ahorrar energía y reducir la extracción de minerales. Al continuar reduciendo los residuos de metal, contribuyes a la sostenibilidad y la lucha contra el cambio climático, marcando una diferencia positiva en la protección del planeta.", llenarArrayArticulos(articulosMetal));
        clasificacionesBasura.add(tempClas);

        //CREAR OBJETO CLASIFICACION -> BASURA VIDRIO
        String[] articulosVidrio = {
            "Botellas de vidrio de bebidas",
            "Frascos de vidrio de conservas",
            "Vasos de vidrio",
            "Tazas de café de vidrio",
            "Envases de perfume de vidrio",
            "Jarras de vidrio",
            "Bombillas de luz de vidrio",
            "Botellas de vino de vidrio",
            "Platos de vidrio",
            "Adornos de vidrio"
        };
        tempClas = new Clasificacion("Vidrio", "Es la categorización de residuos que consisten principalmente en artículos hechos de vidrio, como botellas de vidrio, frascos de conservas, vasos, jarras y otros objetos de vidrio. El vidrio es un material altamente reciclable y su reciclaje contribuye a reducir la cantidad de desechos en vertederos y a conservar los recursos naturales, ya que se puede fundir y reutilizar en la fabricación de nuevos productos de vidrio. La gestión adecuada de la basura de vidrio es esencial para promover la sostenibilidad y minimizar el impacto ambiental.", "El mal manejo de la basura de vidrio conduce a la acumulación de desechos de vidrio en vertederos, lo que no solo ocupa espacio de manera innecesaria, sino que también no aprovecha la capacidad de reciclaje efectivo del vidrio, desperdiciando un valioso recurso.", "El reciclaje de vidrio contribuye a mantener la pureza del aire y el agua. Al reducir la producción de vidrio nuevo, se disminuye la necesidad de extraer y procesar minerales, lo que evita la liberación de partículas contaminantes en el aire y la contaminación del agua con productos químicos tóxicos utilizados en la producción de vidrio. Al continuar reduciendo los residuos de vidrio y reciclándolos, estás contribuyendo a la calidad del aire y el agua, lo que beneficia tanto al medio ambiente como a la salud humana.", llenarArrayArticulos(articulosVidrio));
        clasificacionesBasura.add(tempClas);

        //CREAR OBJETO CLASIFICACION -> BASURA PAPEL
        String[] articulosPapel = {
            "Papel de periódico",
            "Revistas",
            "Cartón de cajas",
            "Papel de oficina",
            "Sobres de papel",
            "Papel de embalaje",
            "Libros",
            "Cuadernos",
            "Papel de regalo",
            "Folletos impresos"
        };
        tempClas = new Clasificacion("Papel y cartón", "La clasificación de basura de papel y cartón se refiere a la categorización de residuos que están hechos principalmente de materiales de papel, cartón y productos relacionados. Incluye elementos como periódicos, cajas de cartón, papel de oficina, cartón de envases, revistas, libros y otros artículos de papel y cartón. Estos materiales son altamente reciclables y su reciclaje contribuye a la conservación de los bosques y a la reducción de la contaminación. ", "El mal manejo de la basura de papel y cartón contribuye a la deforestación y la pérdida de hábitats naturales, lo que afecta la biodiversidad y aumenta la presión sobre los recursos naturales. Es crucial promover el reciclaje de papel y cartón para reducir estos impactos negativos en el medio ambiente.", "Reciclar papel y cartón conserva bosques, reduce emisiones de carbono y promueve un estilo de vida sostenible, marcando una diferencia en la protección de la naturaleza y la mitigación del cambio climático.", llenarArrayArticulos(articulosPapel));
        clasificacionesBasura.add(tempClas);
        
        System.out.println("QUE HAY EN LOS OBAJETOS DE CLASIFICACIONESBASURA");
        System.out.println(clasificacionesBasura.get(0).getArrayArticulos().get(0));
        System.out.println(clasificacionesBasura.get(1).getArrayArticulos().get(0));
        System.out.println(clasificacionesBasura.get(2).getArrayArticulos().get(0));
        System.out.println(clasificacionesBasura.get(3).getArrayArticulos().get(0));
        System.out.println(clasificacionesBasura.get(4).getArrayArticulos().get(0));
        System.out.println(clasificacionesBasura.get(5).getArrayArticulos().get(0));
        
    }

    public String buscarArticulo(String articulo) {
        String clas = "";
        for (Clasificacion clasificacion : clasificacionesBasura) {
            ArrayList<String> arrayArticulos = clasificacion.getArrayArticulos();
            if (arrayArticulos.contains(articulo)) {
                clas = clasificacion.getClasificacion();
            }
        }
        return clas;
    }

    public String devolverDescripcion(String clasificacion) {
        String desc = "";
        for (Clasificacion clasBasura : clasificacionesBasura) {
            if (clasBasura.getClasificacion().equals(clasificacion)) {
                desc = clasBasura.getDescripcion() + "\n\n" + clasBasura.getDatoNegativo();
            }
        }
        return desc;
    }
}
