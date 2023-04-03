//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//class MediaException extends RuntimeException {
//    public MediaException(float nota) {
//        super("" + nota);
//    }
//}
//class VacioException extends RuntimeException {}
//class NegativoException extends RuntimeException {
//
//    public NegativoException(float nota) {
//        super("" + nota);
//    }
//}
//
//class Diploma {
//    static String generar() {
//        float media = Calificador.calcularMedia();
//
//
//        if (media < 5) {
//            throw new MediaException(media);
//        }
//        return "DIPLOMA DE PROGRAMADOR. Nota media: " + media;
//    }
//}
//
//class Calificador {
//    static float calcularMedia() {
//        List<Float> notas = Notas.leer();
//
//
//        if (notas.size() == 0) {
//            throw new VacioException();        }
//        float suma = 0;
//        for(Float nota : notas) {
//            suma += nota;
//        }
//        return suma / notas.size();
//    }
//}
//
//class Notas {
//    static List<Float> leer() {
//        Scanner scanner = new Scanner("3 -4");
//
//
//        List<Float> notas = new ArrayList<>();
//        while(scanner.hasNext()) {
//            float nota = scanner.nextFloat();
//            if (nota < 0) {
//                throw new NegativoException(nota);            }
//            notas.add(nota);
//        }
//
//        return notas;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        String diploma = Diploma.generar();
//        System.out.println(diploma);
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class MediaException extends RuntimeException {
//    public MediaException(float nota) {
//        super("" + nota);
//    }
//}
//class VacioException extends RuntimeException {}
//class NegativoException extends RuntimeException {
//
//    public NegativoException(float nota) {
//        super("" + nota);
//    }
//}
//
//class Diploma {
//    static String generar(float nota) {
//        if (nota < 5) {
//            throw new MediaException(nota);
//        }
//        return "DIPLOMA DE PROGRAMADOR. Nota: " + nota;
//    }
//}
//
//
//class Calificador {
//    static float calcularMedia(List<Float> notas) {
//        if (notas.size() == 0) {
//            throw new VacioException();
//        }
//        float suma = 0;
//        for(Float nota : notas) {
//            suma += nota;
//        }
//        return suma / notas.size();
//    }
//}
//
//
//class Notas {
//    static List<Float> leer(){
//        Scanner scanner = new Scanner("5,5 0,5 8,5");
//
//
//        List<Float> notas = new ArrayList<>();
//        while(scanner.hasNext()) {
//            float nota = scanner.nextFloat();
//            if (nota < 0) {
//                throw new NegativoException(nota);
//            }
//            notas.add(nota);
//        }
//
//
//        return notas;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        try {
//            List<Float> notas = Notas.leer();
//
//            float media = Calificador.calcularMedia(notas);
//
//            String diploma = Diploma.generar(media);
//            System.out.println(diploma);
//
//        } catch (NegativoException e){
//            System.out.println("Hay una nota negativa: " + e.getMessage());
//        } catch (MediaException e) {
//            System.out.println("La media es menor a 5, esta es: "+ e.getMessage());
//        } catch (VacioException e) {
//            System.out.println("vacio mal");
//        }
//
//    }
//}

import java.util.Scanner;

class Main {
    public static void checkTheCode(String input) {
        int number = Integer.parseInt(input);
        int divResult = 22 / number;
        int multResult = 0 * number;
        System.out.println(multResult);
    }


    public static void main(String[] args) {
        checkTheCode(new Scanner(System.in).next());
    }
}
