package pe.edu.cibertec.ms.citas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsCitasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCitasApplication.class, args);
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("🚀 MS-CITAS iniciado correctamente");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("📚 Swagger UI: http://localhost:8082/swagger-ui.html");
        System.out.println("📡 API Docs: http://localhost:8082/api-docs");
        System.out.println("🐰 RabbitMQ: Productor de eventos configurado");
        System.out.println("💾 Base de datos: MySQL - visum_optica");
        System.out.println("═══════════════════════════════════════════════════════");
    }
}