package org.example;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class CompletableFutureEjercicioMasRapida {

    private static int generarNumero() {
        int random = ThreadLocalRandom.current().nextInt(100, 501);
        try {
            Thread.sleep(random);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return random;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> tarea1 = CompletableFuture.supplyAsync(() -> {
            int num = generarNumero();
            System.out.println("Nro T1: " + num);
            return num;
        });
        CompletableFuture<Integer> tarea2 = CompletableFuture.supplyAsync(() -> {
            int num = generarNumero();
            System.out.println("Nro T2: " + num);
            return num;
        });
        CompletableFuture<Integer> tarea3 = CompletableFuture.supplyAsync(() -> {
            int num = generarNumero();
            System.out.println("Nro T3: " + num);
            return num;
        });
        CompletableFuture<Integer> tarea4 = CompletableFuture.supplyAsync(() -> {
            int num = generarNumero();
            System.out.println("Nro T4: " + num);
            return num;
        });

        CompletableFuture<Object> primera = CompletableFuture.anyOf(tarea1, tarea2, tarea3, tarea4);

        primera.thenAccept(nro -> {
            System.out.println("La primera tarea generó el nro: " + nro);
        });

        primera.get();
    }
}
