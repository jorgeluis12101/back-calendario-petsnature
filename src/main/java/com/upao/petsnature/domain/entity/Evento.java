package com.upao.petsnature.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Set;

@Entity(name = "Evento")
@Table(name = "eventos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha_evento", columnDefinition = "DATE")
    private LocalDate fecha;
    private String veterinaria;
    private String descripcion;
    private String costo;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipo;
    @Lob // Asegúrate de que el campo sea lo suficientemente grande
    @Column(length = 10485760) // 10MB, puedes ajustar este valor
    private String archivo; // base64 encoded string
    private LocalDate modificadoFecha;
    @Column(nullable = false, name = "estado")
    private boolean enabled = true;
    @ManyToOne(fetch = FetchType.LAZY)
    private Mascota mascota;
    @OneToMany(mappedBy = "evento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Medicamento> medicamento;

}
