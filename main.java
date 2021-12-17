import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import org.python.util.PythonInterpreter;

public class main {
    public static void main(String[] args) {
@@ -13,10 +14,13 @@ public static void main(String[] args) {
        while (attempts != 0) { // Se itera mientras el jugador aun tenga intentos disponibles.
            System.out.println("\n Intentos: " + attempts);
            System.out.println("Escribe 4 numeros del 1 al 8:");
            check.put(1, scanner.nextInt());
            check.put(2, scanner.nextInt());
            check.put(3, scanner.nextInt());
            check.put(4, scanner.nextInt());  

            // Se inicializa el interprete de python y se ejecuta el archivo resolver.py
            String[] argumentos = {"juego.ans.get(1)", "juego.ans.get(2)", "juego.ans.get(3)", "juego.ans.get(4)"};
            PythonInterpreter interpreter = new PythonInterpreter();
            PythonInterpreter.initialize(null, null, argumentos);
            interpreter.execfile("../resolver.py");
            // Se imprimen las respuestas.
            System.out.println(check);

            pines = juego.comprobar(check, 1); //Llamada al metodo que comprueba la respuesta propuesta
