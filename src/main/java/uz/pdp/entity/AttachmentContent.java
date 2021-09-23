package uz.pdp.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "attachment_content")
public class AttachmentContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private byte[] data;

    @OneToOne
    @JoinColumn(name = "attachment_id", referencedColumnName = "id")
    private Attachment attachment;
}
