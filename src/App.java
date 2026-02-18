import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));

        ArrayList<Persona> personas = new ArrayList<Persona>();
        String linea;
        while ((linea = br.readLine()) != null) {
            personas.add(new Persona(linea));
        }
        br.close();
        for (Persona p : personas) {
            System.out.println(p);
        }
        System.out.println("**************************");
        int index = (int) (Math.random() * personas.size());
        personas.remove(index);
        BufferedWriter bw = new BufferedWriter(new FileWriter("alumnos.csv"));
        for (int i = 0; i < personas.size(); i++) {
            bw.write(personas.get(i).serialize());
        }
        bw.close();

        for (Persona p : personas) {
            System.out.println(p);
        }
    }

}
