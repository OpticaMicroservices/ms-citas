package pe.edu.cibertec.ms.citas.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ms.citas.config.RabbitMQConfig;
import pe.edu.cibertec.ms.citas.dto.CitaEventoDTO;

/**
 * Servicio para publicar eventos de citas en RabbitMQ
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class CitaEventoPublisher {

    private final RabbitTemplate rabbitTemplate;

    /**
     * Publica un evento de cita en RabbitMQ
     */
    public void publicarEvento(CitaEventoDTO evento) {
        try {
            log.info("📤 Publicando evento de cita: {} - Cita Nro: {}",
                    evento.getTipoEvento(), evento.getNumeroCita());

            rabbitTemplate.convertAndSend(
                    RabbitMQConfig.EXCHANGE_NAME,
                    RabbitMQConfig.ROUTING_KEY_CITAS,
                    evento
            );

            log.info("✅ Evento publicado exitosamente - Sucursal: {}", evento.getNombreSucursal());
        } catch (Exception e) {
            log.error("❌ Error al publicar evento: {}", e.getMessage(), e);
        }
    }
}