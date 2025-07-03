public class NumbersAndOperations {
    /**
     * Reto 1: Suma
     * Haz que el valor de numberA sea 23 y el de numberB sea 40
     * Crea una variable llamada "result" que contenga la suma de las dos variables anteriores (numberA mas numberB)
     *
     * @return La variable result.
     */
    public int sum() {
        int numberA;
        int numberB;

        // Tu código aquí
        numberA = 23;
        numberB = 40;

        int result = numberA + numberB;
        return result; // Sustituye el 0 por result
    }

    /**
     * Reto 2: División
     * ¡No modifiques el valor de numberA o numberB!
     * Crea una variable llamada "result" que contenga la división de las dos variables anteriores (numberA partido por numberB). 👁️ Esta división tiene decimales.
     *
     * @return La variable result, solo puede ser float.
     */
    public float division() {
        int numberA = 10;
        int numberB = 3;

        // Tu código aquí
        float result = (float) numberA / numberB;

        return result; // sustituye 0.0f por la variable "result"
    }

    /**
     * Reto 3: Módulo
     * Asigna un NUEVO valor a numberA y numberB de modo que el resultado de numberA % numberB sea 1
     *
     * @return No modifiques el return
     */
    public int modulo() {
        int numberA = 1;
        int numberB = 1;

        // Tu código aquí
        numberA = 5;
        numberB = 4;

        return numberA % numberB; // No hace falta modificar el return. Si los valores que has asignado son correctos, el test pasará 😉
    }

    /**
     * Reto 4: Número aleatorio
     * Asigna un NUEVO valor a randomNumber, de forma que finalmente obtengamos un número aleatorio entre 0 y 100.
     * Utiliza Math.
     *
     * @return No modifiques el return
     */
    public int randomizer() {
        int randomNumber = 9999;

        // Tu código aquí
        randomNumber = (int) (Math.random() * 101);

        return randomNumber; // No hace falta modificar el return. Si los valores que has asignado son correctos, el test pasará 😉
    }

    /**
     * Reto 5: Potencia
     * Crea una variable llamada "result" que sea el resultado de elevar numberB a numberA.
     * El resultado debe ser un int
     *
     * @return La variable result
     */
    public int power() {
        int numberA = 9;
        int numberB = 3;

        // Tu código aquí
        int result = (int) Math.pow(numberB, numberA);

        return result; // sustituye el 0 por la variable result
    }

    /**
     * Reto 6: Redondeo
     * Asigna un NUEVO valor a 'decimalNumber' para que, al redondearlo al entero más cercano, el resultado sea 10.
     * Piensa que estamos utilizando Math.round() 🤔
     *
     * @return No modifiques el return
     */
    public long roundNumber() { // Usamos 'long' porque Math.round() devuelve long
        double decimalNumber = 0.0;

        // Tu código aquí
        decimalNumber = 9.5;

        return Math.round(decimalNumber); // No hace falta modificar el return. Ya tu sabes... 😉
    }

    /**
     * Reto 7: Combinación de Operaciones
     * No modifiques el valor de 'initialValue'.
     * Debes crear una nueva variable (int) llamada finalResult que contenga la suma de initialValue más 5 y luego ese resultado multiplicado por 13.
     *
     * @return La variable finalResult.
     */
    public int combinedOperations() {
        int initialValue = 7;

        // Tu código aquí
        int finalResult = (initialValue + 5) * 13;

        return finalResult; // Sustituye el 0 por finalResult
    }

    public static void main(String[] args) {
        // Puedes hacer pruebas por aquí 🤖
    }
}
