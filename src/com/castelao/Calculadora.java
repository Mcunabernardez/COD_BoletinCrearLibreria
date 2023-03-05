package com.castelao;

/**
 * Libreria que realize las cuatro operaciones básicas que recibe dos float y un int para elegir opcion
 * @version 1.0
 * @author Maikel
 */

public class Calculadora {

    /**
     * Creamos las variables de las 4 opciones literales
     * Opcion de suma, resta multiplicación y división de dos factores
     */
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACION = 3;
    public static final int DIVISION = 4;

    /**
     * Creacion de la variable para la raiz cúbica
     */
    public static final int RAIZCUBICA = 5;
    /**
     * Creamos el Array del resultado de la operacion
     */
    public static final float[] RESULTADO= new float[1];


    /**
     * Switch con métodos para las operaciones básicas y que devuelan el resultado
     * @param num1 1er numero
     * @param num2 2o numero
     * @param option Elegir qué tipo de operación realizar
     * @return Resultado de la operación
     */
    public static float[] operacion(float num1, float num2, int option) {

        switch (option) {

            case SUMA:
                try {
                    RESULTADO[0] = num1 + num2;
                } catch (NullPointerException exception) {
                    return null;
                }

                return RESULTADO;

            case RESTA:

                try {
                    RESULTADO[0] = num1 - num2;
                } catch (NullPointerException exception) {
                    return null;
                }

                return RESULTADO;

            case MULTIPLICACION:

                try {
                    RESULTADO[0] = num1 * num2;
                } catch (NullPointerException exception) {
                    return null;
                }

                return RESULTADO;

            case DIVISION:

                try {
                    RESULTADO[0] = Math.round(num1 / num2);
                } catch (NullPointerException exception) {
                    return null;
                }

                return RESULTADO;

            case RAIZCUBICA:
                /* usamos la funcion math pow para calcular, dando el primer numero, su raiz cubica
                * */
                try {
                    RESULTADO[0] = (float) Math.pow(num1, 1/3);
                } catch (NullPointerException exception) {
                    return null;
                }

                return RESULTADO;


            default:

                return null;
        }
    }
}
