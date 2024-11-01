package com.example.rencapp.repositories;

import com.example.rencapp.models.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
    Notificacion findNotificacionByNotificacionId(Long id);

   /* List<Notificacion> findAllByUsuarioId(Long id);*/
}
