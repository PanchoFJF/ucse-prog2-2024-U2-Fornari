package org.example;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureEjercicio {

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

        CompletableFuture<Void> tareas = CompletableFuture.allOf(tarea1, tarea2, tarea3, tarea4);

        CompletableFuture<Integer> sumaFuture = tareas.thenApply(v -> {
            try {
                return tarea1.get() + tarea2.get() + tarea3.get() + tarea4.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        sumaFuture.thenAccept(suma -> System.out.println("La suma de los cuatro valores es: " + suma));

        sumaFuture.get();
    }
}

